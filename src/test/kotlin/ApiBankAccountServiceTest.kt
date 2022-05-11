import com.fintecsystems.xs2a.java.models.api.connections.BankConnectionRequest
import com.fintecsystems.xs2a.java.models.api.connections.SyncMode
import com.fintecsystems.xs2a.java.models.api.users.BankUserCreationRequest
import com.fintecsystems.xs2a.java.models.form.FormCheckbox
import com.fintecsystems.xs2a.java.models.form.FormPassword
import com.fintecsystems.xs2a.java.models.form.FormSelect
import com.fintecsystems.xs2a.java.models.form.FormText
import com.fintecsystems.xs2a.java.services.ApiBankAccountService
import com.fintecsystems.xs2a.java.services.ApiBankConnectionService
import com.fintecsystems.xs2a.java.services.ApiBankUserService
import com.fintecsystems.xs2a.java.services.ApiWizardService
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import java.time.OffsetDateTime

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class ApiBankAccountServiceTest {
    @Test
    @Order(0)
    fun testCreate() {
        /* SETUP START */
        ApiBankUserService(apiKey).apply {
            val bankUser = create(
                BankUserCreationRequest(
                    name = "Mustermann",
                    email = "user@example.com"
                )
            )

            bankUserId = bankUser.id

            val accessTokenResponse = createAccessToken(
                userId = bankUserId,
                validUntil = OffsetDateTime.now().plusDays(7)
            )

            accessTokenId = accessTokenResponse.id
            accessToken = accessTokenResponse.token
        }
        /* SETUP END */


        /* Create Bank Connection */
        ApiBankConnectionService(accessToken).apply {
            val response = create(
                BankConnectionRequest(
                    syncMode = SyncMode.FULL
                )
            )

            transaction = response.transaction
            wizardSessionKey = response.wizardSessionKey
        }

        /* Navigate */
        ApiWizardService(accessToken).apply {
            val wizRes1 = navigate(
                mapOf(
                    "key" to wizardSessionKey
                )
            )

            assert(wizRes1.form?.elements?.get(0) is FormSelect)
            assert(wizRes1.form?.elements?.get(1) is FormText)

            val wizRes2 = navigate(
                mapOf(
                    "key" to wizardSessionKey,
                    "country_id" to "DE",
                    "bank_code" to 88888888
                )
            )

            assert(wizRes2.form?.elements?.get(0) is FormText)
            assert(wizRes2.form?.elements?.get(1) is FormPassword)
            assert(wizRes2.form?.elements?.get(2) is FormCheckbox)

            val wizRes3 = navigate(
                mapOf(
                    "key" to wizardSessionKey,
                    "USER_NAME" to "abcdef",
                    "USER_PIN" to "123456",
                    "privacy_policy" to true
                )
            )

            assert(wizRes3.form?.name == "finish")
        }
    }

    @Test
    @Order(1)
    fun testList() {
        ApiBankConnectionService(accessToken).apply {
            val response = list()
            bankConnectionId = response.data[0].id
        }

        ApiBankAccountService(accessToken).apply {
            val response = list()
            assert(response.data.any {
                it.bankConnectionId == bankConnectionId
            })

            bankAccountId = response.data[0].id
        }
    }

    @Test
    @Order(2)
    fun testListForBankConnection() {
        ApiBankAccountService(accessToken).apply {
            val response = listForBankConnection(bankConnectionId)
            assert(response.data.any {
                it.bankConnectionId == bankConnectionId
            })
        }
    }

    @Test
    @Order(3)
    fun testGet() {
        ApiBankAccountService(accessToken).apply {
            val response = get(bankAccountId)
            assert(response.id == bankAccountId)
        }
    }

    @Test
    @Order(4)
    fun testGetBalance() {
        ApiBankAccountService(accessToken).apply {
            val response = getBalance(bankAccountId)
            assert(response.id == bankAccountId)
        }
    }

    @Test
    @Order(5)
    fun testGetTurnovers() {
        ApiBankAccountService(accessToken).apply {
            val response = getTurnovers(
                bankAccountId,
                from = OffsetDateTime.now().minusMonths(1),
                to = OffsetDateTime.now(),
            )

            assert(response.id == bankAccountId)
        }
    }

    @Test
    @Order(6)
    fun testMarkAsSeen() {
        ApiBankAccountService(accessToken).apply {
            markAsSeen(
                bankAccountId,
                OffsetDateTime.now()
            )
        }
    }

    @Test
    @Order(7)
    fun testDeleteBankConnection() {
        ApiBankConnectionService(accessToken).apply {
            delete(bankConnectionId)
        }
    }

    @Test
    @Order(8)
    fun testDeleteBankAccount() {
        ApiBankAccountService(accessToken).apply {
            delete(bankAccountId)
        }
    }

    @Test
    @Order(9)
    fun testDeleteAccessToken() {
        ApiBankUserService(apiKey).apply {
            deleteAccessToken(bankUserId, accessTokenId)
        }
    }

    @Test
    @Order(10)
    fun testDeleteBankUser() {
        ApiBankUserService(apiKey).apply {
            delete(bankUserId)
        }
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")

        private lateinit var bankUserId: String
        private lateinit var transaction: String
        private lateinit var accessTokenId: String
        private lateinit var accessToken: String
        private lateinit var bankAccountId: String
        private lateinit var bankConnectionId: String
        private lateinit var wizardSessionKey: String
    }
}