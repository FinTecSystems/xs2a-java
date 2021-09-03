import com.fintecsystems.xs2a.java.models.*
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import com.fintecsystems.xs2a.java.services.WhitelistService

@TestMethodOrder(OrderAnnotation::class)
internal class WhitelistServiceTest {
    @Test
    @Order(0)
    fun testAdd() {
        WhitelistService(apiKey).apply {
            whitelistObject = add(WhitelistAdd("DE93888888880043218765"))
        }
    }

    @Test
    @Order(1)
    fun testGet() {
        WhitelistService(apiKey).apply {
            val response = get(whitelistObject.id)

            assert(response == whitelistObject)
        }
    }

    @Test
    @Order(2)
    fun testDelete() {
        WhitelistService(apiKey).apply {
            val response = delete(whitelistObject.id)

            assert(response == whitelistObject)
        }
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")

        private lateinit var whitelistObject: WhitelistObject
    }
}