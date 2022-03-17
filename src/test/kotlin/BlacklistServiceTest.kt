import com.fintecsystems.xs2a.java.models.*
import com.fintecsystems.xs2a.java.models.blacklist.BlacklistAdd
import com.fintecsystems.xs2a.java.models.blacklist.BlacklistObject
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import com.fintecsystems.xs2a.java.services.BlacklistService

@TestMethodOrder(OrderAnnotation::class)
internal class BlacklistServiceTest {
    @Test
    @Order(0)
    fun testAdd() {
        BlacklistService(apiKey).apply {
            blacklistObject = add(BlacklistAdd("DE93888888880043218765"))
        }
    }

    @Test
    @Order(1)
    fun testGet() {
        BlacklistService(apiKey).apply {
            val response = get(blacklistObject.id)

            assert(response == blacklistObject)
        }
    }

    @Test
    @Order(2)
    fun testDelete() {
        BlacklistService(apiKey).apply {
            val response = delete(blacklistObject.id)

            assert(response == blacklistObject)
        }
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")

        private lateinit var blacklistObject: BlacklistObject
    }
}