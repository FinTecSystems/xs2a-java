import com.fintecsystems.xs2a.java.models.*
import com.fintecsystems.xs2a.java.models.form.FormCheckbox
import com.fintecsystems.xs2a.java.models.form.FormPassword
import com.fintecsystems.xs2a.java.models.form.FormSelect
import com.fintecsystems.xs2a.java.models.form.FormText
import com.fintecsystems.xs2a.java.services.RiskService
import com.fintecsystems.xs2a.java.services.WizardService
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.LocalDateTime

internal class RiskServiceTest {
    private val apiKey = System.getenv("API_KEY")

    @Test
    fun test() {
        val riskService = RiskService(apiKey)

        val risk = Xs2aRisk(
            xs2aAccountCharacteristicsCheck = emptyList(),
            xs2aAccountLinkedOffersCheck = emptyList(),
            xs2aAccountSnapshot = Xs2aAccountSnapshot(
                days = 10,
                from = LocalDate.now().withMonth(1),
                to = LocalDate.now().withMonth(1).plusDays(10),
                filters = listOf("income"),
                allAccounts = true,
                allTags = true
            ),
            xs2aAccountStatusCheck = Xs2aAccountStatusCheck(
                limitTurnoverDays = 10,
                allAccounts = true
            ),
            xs2aAllAccountsCheck = emptyList(),
            xs2aBalanceCheck = Xs2aBalanceCheck(
                checkAmount = 10f,
                checkCurrencyId = CurrencyId.EUR
            ),
            xs2aBalanceOverview = emptyList(),
            xs2aCashflowOverview = emptyList(),
            xs2aChargebackCheck = emptyList(),
            xs2aChildrenCheck = emptyList(),
            xs2aCreditCheck = Xs2aCreditCheck(
                checks = listOf("income")
            ),
            xs2aDirectDebitCheck = Xs2aDirectDebitCheck(
                checkAmount = 10f,
                checkCurrencyId = CurrencyId.EUR,
                startDate = LocalDate.now().plusDays(7),
                endDate = LocalDate.now().plusDays(14),
            ),
            xs2aFactSheetLists = Xs2aFactSheetLists(
                limitTurnoverDays = 10,
                fields = listOf(
                    Xs2aFactSheetListsFields(
                        categories = listOf("K.8.2.1"),
                        maxAmount = 100.toFloat(),
                        minAmount = 1.toFloat(),
                        tags = listOf("expenditure"),
                        name = "test"
                    )
                ),
            ),
            xs2aHolderIdentificationCheck = Xs2aHolderIdentificationCheck(
                expectHolders = listOf(
                    ExpectedHolderObject(
                        name = "Mustermann",
                        firstname = "Max",
                    )
                )
            ),
            xs2aIncomeCheck = emptyList(),
            xs2aNameCheck = Xs2aNameCheck(
                name = "Mustermann",
                firstname = "Max",
            ),
            xs2aOverdraftLimitCheck = emptyList(),
            xs2aProfitLossCheck = emptyList(),
            xs2aRatingB2bCheck = emptyList(),
            xs2aRatingB2cCheck = emptyList(),
            xs2aRiskCalculationsCheck = Xs2aRiskCalculationsCheck(
                calculations = listOf(
                    RiskCalculations(
                        tags = listOf("transfer"),
                        categories = listOf("K.1.1"),
                        functions = listOf("sum"),
                        name = "test",
                        days = 10,
                        fullMonths = "",
                        childrenCategories = true,
                        matchTagsWithCategories = true,
                    )
                )
            ),
            xs2aSeizureCheck = Xs2aSeizureCheck(
                days = 10
            ),
            xs2aStandingOrdersCheck = emptyList()
        )

        val response = riskService.create(risk)

        /* Navigate so we can get the results of the risk checks */
        val wizardService = WizardService(apiKey)

        val wizRes1 = wizardService.navigate(
            mapOf(
                "key" to response.wizardSessionKey,
            )
        )

        assert(wizRes1.form?.elements?.get(0) is FormSelect)
        assert(wizRes1.form?.elements?.get(1) is FormText)

        val wizRes2 = wizardService.navigate(
            mapOf(
                "key" to response.wizardSessionKey,
                "country_id" to CountryId.DE,
                "bank_code" to 88888888
            )
        )

        assert(wizRes2.form?.elements?.get(0) is FormText)
        assert(wizRes2.form?.elements?.get(1) is FormPassword)
        assert(wizRes2.form?.elements?.get(2) is FormCheckbox)

        val wizRes3 = wizardService.navigate(
            mapOf(
                "key" to response.wizardSessionKey,
                "USER_NAME" to "abcdef",
                "USER_PIN" to 123456,
                "privacy_policy" to true,
            )
        )

        /*
        assert(wizRes3.form?.elements?.get(0) is FormRadio)

        val wizRes4 = wizardService.navigate(
            mapOf(
                "key" to response.wizardSessionKey,
                (wizRes3.form?.elements?.get(0) as FormRadio).name to 0,
            )
        )

         */

        assert(wizRes3.form?.name == "finish")

        val riskResult = riskService.get(response.transaction)
        assert(riskResult.xs2aAccountCharacteristicsCheck !== null)
        assert(riskResult.xs2aAccountSnapshot !== null)
        assert(riskResult.xs2aAccountStatusCheck !== null)
        assert(riskResult.xs2aAllAccountsCheck !== null)
        assert(riskResult.xs2aBalanceCheck !== null)
        assert(riskResult.xs2aBalanceOverview !== null)
        assert(riskResult.xs2aCashflowOverview !== null)
        assert(riskResult.xs2aChargebackCheck !== null)
        assert(riskResult.xs2aChildrenCheck !== null)
        assert(riskResult.xs2aCreditCheck !== null)
        assert(riskResult.xs2aDirectDebitCheck !== null)
        assert(riskResult.xs2aFactSheetLists !== null)
        assert(riskResult.xs2aHolderIdentificationCheck !== null)
        assert(riskResult.xs2aIncomeCheck !== null)
        assert(riskResult.xs2aNameCheck !== null)
        assert(riskResult.xs2aOverdraftLimitCheck !== null)
        assert(riskResult.xs2aRatingB2bCheck !== null)
        assert(riskResult.xs2aRatingB2bCheck !== null)
        assert(riskResult.xs2aProfitLossCheck !== null)
        assert(riskResult.xs2aRiskCalculationsCheck !== null)
        assert(riskResult.xs2aSeizureCheck !== null)
        assert(riskResult.xs2aStandingOrdersCheck !== null)
        assert(riskResult.xs2aAccountLinkedOffersCheck !== null)

        riskService.getAccountSnapshot(response.transaction)

        val fullPdf = riskService.getFullPDF(response.transaction)
        assert(fullPdf.isNotEmpty())

        // riskService.getReport(response.transaction)

        riskService.getEvents(response.transaction)

        riskService.list(to = LocalDateTime.now().minusDays(30))

        val delete = riskService.delete(response.transaction)
        assert(delete["code"] !== null)
    }
}