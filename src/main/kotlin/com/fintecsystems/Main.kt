import com.fintecsystems.xs2a.java.models.Xs2aRisk
import com.fintecsystems.xs2a.java.services.RiskService

fun main() {
    val apiKeyToUse = System.getenv("API_KEY")

    RiskService(apiKeyToUse).apply {
        val wizardSession = create(Xs2aRisk())

        println(wizardSession)
    }
}
