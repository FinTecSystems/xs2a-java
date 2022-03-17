import com.fintecsystems.xs2a.java.models.events.EventObject
import com.fintecsystems.xs2a.java.models.risk.Xs2aRisk
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import com.fintecsystems.xs2a.java.services.EventService
import com.fintecsystems.xs2a.java.services.RiskService

@TestMethodOrder(OrderAnnotation::class)
internal class EventServiceTest {

    @Test
    @Order(0)
    fun testList() {
        EventService(apiKey).apply {
            val emptyRisk = RiskService(apiKey).create(Xs2aRisk())
            val eventsList = list(emptyRisk.transaction)

            assert(eventsList.data.isNotEmpty())

            event = eventsList.data.first()
        }
    }

    @Test
    @Order(1)
    fun testGet() {
        EventService(apiKey).apply {
            val response = get(event.id)

            assert(response == event)
        }
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")

        private lateinit var event: EventObject
    }
}
