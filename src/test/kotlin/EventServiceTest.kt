import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.common.PaginatedList
import com.fintecsystems.xs2a.java.models.events.EventObject
import com.fintecsystems.xs2a.java.models.risk.Xs2aRisk
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import com.fintecsystems.xs2a.java.services.EventService
import com.fintecsystems.xs2a.java.services.RiskService
import java.time.OffsetDateTime

@TestMethodOrder(OrderAnnotation::class)
internal class EventServiceTest {

    @Test
    @Order(0)
    fun testList() {
        EventService(apiKey).apply {
            val emptyRisk = RiskService(apiKey).create(Xs2aRisk())
            val eventsList = list(
                emptyRisk.transaction,
                from = OffsetDateTime.now().minusMonths(1),
                to = OffsetDateTime.now(),
            )

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

    @Test
    fun testBruh() {
        val testString = """
            {
                "total": 0,
                "perPage": 0,
                "currentPage": 0,
                "lastPage": 0,
                "from": 0,
                "to": 0,
                "data": [
                    {
                        "id": "111111",
                        "transaction": "100000",
                        "type": "transaction.created",
                        "data": null,
                        "testmode": false,
                        "message": "Nothing",
                        "created_at": "2020-10-20"
                    }
                ]
            }
        """.trimIndent()

        val intermediate = JsonSerializer.parseJson<Map<String, String>>(testString)
        val test = intermediate[data]
        println(test)
        val value = PaginatedList.fromJson<EventObject>(intermediate)

        println(value)
    }

    companion object {
        private val apiKey = System.getenv("API_KEY") ?: ""

        private lateinit var event: EventObject
    }
}
