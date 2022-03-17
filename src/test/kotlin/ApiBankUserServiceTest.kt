import com.fintecsystems.xs2a.java.models.api.users.AccessToken
import com.fintecsystems.xs2a.java.models.api.users.BankUser
import com.fintecsystems.xs2a.java.models.api.users.BankUserCreationRequest
import com.fintecsystems.xs2a.java.services.ApiBankUserService
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import java.time.LocalDateTime

@TestMethodOrder(OrderAnnotation::class)
internal class ApiBankUserServiceTest {

    @Test
    @Order(0)
    fun testCreate() {
        ApiBankUserService(apiKey).apply {
            val bankUserToCreate = BankUserCreationRequest(
                name = "Test User",
                email = "test@test.com"
            )

            apiBankUser = create(bankUserToCreate)

            assert(apiBankUser.name == bankUserToCreate.name)
            assert(apiBankUser.email == bankUserToCreate.email)
        }
    }

    @Test
    @Order(1)
    fun testGet() {
        ApiBankUserService(apiKey).apply {
            val response = get(apiBankUser.id)

            assert(response == apiBankUser)
        }
    }

    @Test
    @Order(2)
    fun testList() {
        ApiBankUserService(apiKey).apply {
            val response = list()

            assert(response.data.any { it.id == apiBankUser.id })
        }
    }

    @Test
    @Order(3)
    fun testCreateAccessToken() {
        ApiBankUserService(apiKey).apply {
            val validUntil = LocalDateTime.now()
                .withNano(0)
                .plusDays(1)

            apiBankUserAccessToken = createAccessToken(
                apiBankUser.id,
                validUntil
            )

            assert(apiBankUserAccessToken.validUntil == validUntil)
        }
    }

    @Test
    @Order(4)
    fun testGetAccessToken() {
        ApiBankUserService(apiKey).apply {
            val response = getAccessToken(
                apiBankUser.id,
                apiBankUserAccessToken.id
            )

            assert(response == apiBankUserAccessToken)
        }
    }

    @Test
    @Order(5)
    fun testListAccessToken() {
        ApiBankUserService(apiKey).apply {
            val response = listAccessTokens(apiBankUser.id)

            assert(response.data.any { it.id == apiBankUserAccessToken.id })
        }
    }

    @Test
    @Order(6)
    fun testRefreshAccessToken() {
        ApiBankUserService(apiKey).apply {
            val validUntil = LocalDateTime.now()
                .withNano(0)
                .plusDays(2)

            val response = refreshAccessToken(
                apiBankUser.id,
                apiBankUserAccessToken.id,
                validUntil
            )

            assert(response.id == apiBankUserAccessToken.id)
            assert(response.validUntil == validUntil)
        }
    }

    @Test
    @Order(7)
    fun testDeleteAccessToken() {
        ApiBankUserService(apiKey).apply {
            deleteAccessToken(
                apiBankUser.id,
                apiBankUserAccessToken.id
            )
        }
    }

    @Test
    @Order(8)
    fun testDelete() {
        ApiBankUserService(apiKey).apply {
            delete(apiBankUser.id)
        }
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")

        private lateinit var apiBankUser: BankUser
        private lateinit var apiBankUserAccessToken: AccessToken
    }
}