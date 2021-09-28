import com.fintecsystems.xs2a.java.models.WizardSessionResponse
import com.fintecsystems.xs2a.java.models.Xs2aRisk
import com.fintecsystems.xs2a.java.services.RiskService
import com.fintecsystems.xs2a.java.services.SessionService
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(OrderAnnotation::class)
internal class SessionServiceTest {
    @Test
    @Order(0)
    fun testCreateSession() {
        RiskService(apiKey).apply {
            riskResponse = create(Xs2aRisk())
        }
    }

    @Test
    @Order(1)
    fun testGet() {
        val res = sessionService.get(riskResponse.transaction)

        println(res)
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")

        private lateinit var riskResponse: WizardSessionResponse
        private val sessionService = SessionService(apiKey)
    }
}