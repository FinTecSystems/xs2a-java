import com.fintecsystems.xs2a.java.models.api.connections.BankConnectionRequest
import com.fintecsystems.xs2a.java.models.api.connections.BankConnectionSyncParameters
import com.fintecsystems.xs2a.java.models.api.connections.SyncMode
import com.fintecsystems.xs2a.java.models.api.users.BankUserCreationRequest
import com.fintecsystems.xs2a.java.models.form.FormCheckbox
import com.fintecsystems.xs2a.java.models.form.FormPassword
import com.fintecsystems.xs2a.java.models.form.FormSelect
import com.fintecsystems.xs2a.java.models.form.FormText
import com.fintecsystems.xs2a.java.services.ApiBankConnectionService
import com.fintecsystems.xs2a.java.services.ApiBankUserService
import com.fintecsystems.xs2a.java.services.ApiWizardService
import org.junit.jupiter.api.*
import java.time.OffsetDateTime
import kotlin.test.assertNotNull

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class ApiBankConnectionServiceTest {
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


        /* Creaet Bank Connection */
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
    }

    @Test
    @Order(2)
    fun testGet() {
        ApiBankConnectionService(accessToken).apply {
            val response = get(bankConnectionId)
            assert(response.transaction == transaction)
        }
    }

    @Test
    @Order(3)
    fun testSync() {
        ApiBankConnectionService(accessToken).apply {
            assertDoesNotThrow {
                sync(
                    bankConnectionId,
                    BankConnectionSyncParameters(
                        null,
                        false
                    )
                )
            }
        }
    }

    @Test
    @Order(4)
    fun testReset() {
        ApiBankConnectionService(accessToken).apply {
            val response = reset(bankConnectionId)
            assertNotNull(response.transaction)
            assertNotNull(response.wizardSessionKey)
        }
    }

    @Test
    @Order(5)
    fun testListBankConnections() {
        ApiBankConnectionService(accessToken).apply {
            val response = list()

            assert(response.data[0].id == bankConnectionId)
        }
    }

    @Test
    @Order(6)
    fun testDelete() {
        ApiBankConnectionService(accessToken).apply {
            assertDoesNotThrow {
                delete(bankConnectionId)
            }
        }
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")

        private lateinit var bankUserId: String
        private lateinit var transaction: String
        private lateinit var accessTokenId: String
        private lateinit var accessToken: String
        private lateinit var bankConnectionId: String
        private lateinit var wizardSessionKey: String
    }
}