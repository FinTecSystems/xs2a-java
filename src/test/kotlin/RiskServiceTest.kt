import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.fintecsystems.xs2a.java.models.common.Tag
import com.fintecsystems.xs2a.java.models.form.FormCheckbox
import com.fintecsystems.xs2a.java.models.form.FormPassword
import com.fintecsystems.xs2a.java.models.form.FormSelect
import com.fintecsystems.xs2a.java.models.form.FormText
import com.fintecsystems.xs2a.java.models.risk.Category
import com.fintecsystems.xs2a.java.models.risk.ExpectedHolderObject
import com.fintecsystems.xs2a.java.models.risk.Xs2aRisk
import com.fintecsystems.xs2a.java.models.risk.checks.*
import com.fintecsystems.xs2a.java.models.risk.uploadJson.Xs2aRiskUploadJsonAccount
import com.fintecsystems.xs2a.java.models.risk.uploadJson.Xs2aRiskUploadJsonBalance
import com.fintecsystems.xs2a.java.models.risk.uploadJson.Xs2aRiskUploadJsonTurnoversTurnover
import com.fintecsystems.xs2a.java.models.risk.uploadJson.Xs2aRiskUploadJsonWrapper
import com.fintecsystems.xs2a.java.models.wizard.WizardSessionResponse
import com.fintecsystems.xs2a.java.services.RiskService
import com.fintecsystems.xs2a.java.services.WizardService
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import java.time.OffsetDateTime
import kotlin.test.assertNotNull

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
internal class RiskServiceTest {
    @Test
    @Order(0)
    fun testCreate() {
        val risk = Xs2aRisk(
            xs2aAccountCharacteristicsCheck = Xs2aAccountCharacteristicsCheck(),
            xs2aAccountLinkedOffersCheck = Xs2aAccountLinkedOffersCheck(),
            xs2aAccountSnapshot = Xs2aAccountSnapshot(
                days = 10,
                from = OffsetDateTime.now().minusDays(10),
                to = OffsetDateTime.now(),
                filters = listOf(Tag.INCOME),
                allAccounts = true,
                allTags = true
            ),
            xs2aAccountStatusCheck = Xs2aAccountStatusCheck(
                limitTurnoverDays = 10,
                allAccounts = true
            ),
            xs2aAgeVerificationCheck = Xs2aAgeVerificationCheck(),
            xs2aAllAccountsCheck = Xs2aAllAccountsCheck(),
            xs2aBalanceCheck = Xs2aBalanceCheck(
                checkAmount = 10f,
                checkCurrencyId = CurrencyId.EUR
            ),
            xs2aBalanceOverview = Xs2aBalanceOverview(),
            xs2aCashflowOverview = Xs2aCashflowOverview(),
            xs2aChargebackCheck = Xs2aChargebackCheck(),
            xs2aChildrenCheck = Xs2aChildrenCheck(),
            xs2aCreditCheck = Xs2aCreditCheck(
                checks = listOf(Tag.INCOME)
            ),
            xs2aDirectDebitCheck = Xs2aDirectDebitCheck(
                checkAmount = 10f,
                checkCurrencyId = CurrencyId.EUR,
                startDate = OffsetDateTime.now().plusDays(7),
                endDate = OffsetDateTime.now().plusDays(14),
            ),
            xs2aFactSheetLists = Xs2aFactSheetLists(
                limitTurnoverDays = 10,
                fields = listOf(
                    Xs2aFactSheetListsFields(
                        categories = listOf(Category.K_8_2_1),
                        maxAmount = 100.toFloat(),
                        minAmount = 1.toFloat(),
                        tags = listOf(Tag.EXPENDITURE),
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
            xs2aIncomeCheck = Xs2aIncomeCheck(365),
            // xs2aInsuranceContractCheck = Xs2aInsuranceContractCheck(90), // TODO: Add again, when backend is fixed
            xs2aNameCheck = Xs2aNameCheck(
                name = "Mustermann",
                firstname = "Max",
            ),
            xs2aOverdraftLimitCheck = Xs2aOverdraftLimitCheck(),
            xs2aProfitLossCheck = Xs2aProfitLossCheck(),
            xs2aRatingB2bCheck = Xs2aRatingB2bCheck(),
            xs2aRatingB2cCheck = Xs2aRatingB2cCheck(),
            xs2aRiskCalculationsCheck = Xs2aRiskCalculationsCheck(
                calculations = listOf(
                    RiskCalculations(
                        tags = listOf(),
                        categories = listOf(Category.K_1_1),
                        functions = listOf(
                            Xs2aRiskCalculationsCheckFunction.SUM,
                            Xs2aRiskCalculationsCheckFunction.COUNT,
                            Xs2aRiskCalculationsCheckFunction.MEDIAN,
                            Xs2aRiskCalculationsCheckFunction.AVERAGE,
                            Xs2aRiskCalculationsCheckFunction.LAST,
                            Xs2aRiskCalculationsCheckFunction.MIN,
                            Xs2aRiskCalculationsCheckFunction.MAX,
                            Xs2aRiskCalculationsCheckFunction.MIN_DATE,
                            Xs2aRiskCalculationsCheckFunction.MAX_DATE,
                            Xs2aRiskCalculationsCheckFunction.CLEAN_SUM,
                            Xs2aRiskCalculationsCheckFunction.EXISTS,
                            Xs2aRiskCalculationsCheckFunction.SUMS_OF_EVERY_MONTH,
                            Xs2aRiskCalculationsCheckFunction.COUNTS_OF_EVERY_MONTH,
                            Xs2aRiskCalculationsCheckFunction.MEDIAN_OF_ALL_MONTH_SUMS,
                            Xs2aRiskCalculationsCheckFunction.AVERAGE_OF_ALL_MONTH_SUMS,
                            Xs2aRiskCalculationsCheckFunction.MIN_OF_ALL_MONTH_SUMS,
                            Xs2aRiskCalculationsCheckFunction.MAX_OF_ALL_MONTH_SUMS,
                            Xs2aRiskCalculationsCheckFunction.DISTINCT_COUNTER_HOLDERS,
                        ),
                        name = "test",
                        days = 30,
                        fullMonths = "",
                        childrenCategories = true,
                        matchTagsWithCategories = true,
                    )
                )
            ),
            xs2aSeizureCheck = Xs2aSeizureCheck(
                days = 10
            ),
            xs2aStandingOrdersCheck = Xs2aStandingOrdersCheck()
        )

        riskResponse = riskService.create(risk)

        /* Navigate so we can get the results of the risk checks */
        val wizRes1 = wizardService.navigate(
            mapOf(
                "key" to riskResponse.wizardSessionKey,
            )
        )

        assert(wizRes1.form?.elements?.get(0) is FormSelect)
        assert(wizRes1.form?.elements?.get(1) is FormText)

        val wizRes2 = wizardService.navigate(
            mapOf(
                "key" to riskResponse.wizardSessionKey,
                "country_id" to CountryId.DE,
                "bank_code" to 88888888
            )
        )

        assert(wizRes2.form?.elements?.get(0) is FormText)
        assert(wizRes2.form?.elements?.get(1) is FormPassword)
        assert(wizRes2.form?.elements?.get(2) is FormCheckbox)

        val wizRes3 = wizardService.navigate(
            mapOf(
                "key" to riskResponse.wizardSessionKey,
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
    }

    @Test
    @Order(1)
    fun testGet() {
        val riskResult = riskService.get(riskResponse.transaction)

        assertNotNull(riskResult.xs2aAccountCharacteristicsCheck)
        assertNotNull(riskResult.xs2aAccountSnapshot)
        assertNotNull(riskResult.xs2aAccountStatusCheck)
        assertNotNull(riskResult.xs2aAgeVerificationCheck)
        assertNotNull(riskResult.xs2aAllAccountsCheck)
        assertNotNull(riskResult.xs2aBalanceCheck)
        assertNotNull(riskResult.xs2aBalanceOverview)
        assertNotNull(riskResult.xs2aCashflowOverview)
        assertNotNull(riskResult.xs2aChargebackCheck)
        assertNotNull(riskResult.xs2aChildrenCheck)
        assertNotNull(riskResult.xs2aCreditCheck)
        assertNotNull(riskResult.xs2aDirectDebitCheck)
        assertNotNull(riskResult.xs2aFactSheetLists)
        assertNotNull(riskResult.xs2aHolderIdentificationCheck)
        assertNotNull(riskResult.xs2aIncomeCheck)
        // assertNotNull(riskResult.xs2aInsuranceContractCheck)
        assertNotNull(riskResult.xs2aNameCheck)
        assertNotNull(riskResult.xs2aOverdraftLimitCheck)
        assertNotNull(riskResult.xs2aRatingB2bCheck)
        assertNotNull(riskResult.xs2aRatingB2bCheck)
        assertNotNull(riskResult.xs2aProfitLossCheck)
        assertNotNull(riskResult.xs2aRiskCalculationsCheck)
        assertNotNull(riskResult.xs2aSeizureCheck)
        assertNotNull(riskResult.xs2aStandingOrdersCheck)
        assertNotNull(riskResult.xs2aAccountLinkedOffersCheck)
    }

    @Test
    @Order(2)
    fun testGetAccountSnapshot() {
        val response = riskService.getAccountSnapshot(riskResponse.transaction)

        assert(response.isNotEmpty())
    }

    @Test
    @Order(3)
    fun testGetFullPDF() {
        val fullPdf = riskService.getFullPDF(riskResponse.transaction)

        fullPdf.use {
            assert(!fullPdf.exhausted())
        }
    }

    @Test
    @Order(4)
    fun testGetReport() {
        val response = riskService.getReport(
            riskResponse.transaction,
            reportId
        )

        assertNotNull(response)
    }

    @Test
    @Order(5)
    fun testGetEvents() {
        val events = riskService.getEvents(riskResponse.transaction)
        assert(events.total == 0)
    }

    @Test
    @Order(6)
    fun testList() {
        val list = riskService.list()
        assert(list.data.isNotEmpty())
    }

    @Test
    @Order(7)
    fun testDelete() {
        val delete = riskService.delete(riskResponse.transaction)
        assertNotNull(delete["code"])
    }

    @Test
    @Order(8)
    fun testCompleteManually() {
        val sessionResponse = riskService.create(Xs2aRisk())

        val body = listOf(
            Xs2aRiskUploadJsonWrapper(
                account = Xs2aRiskUploadJsonAccount(
                    holder = "Max Mustermann",
                    description = "Test",
                    iban = "DE62888888880012345678",
                    countryId = CountryId.DE,
                    bic = "TESTDE88XXX",
                    bankName = "German Testbank",
                    jointAccount = false
                ),
                balance = Xs2aRiskUploadJsonBalance(
                    balance = 10f,
                    limit = 0f,
                    available = 10f,
                    currency = CurrencyId.EUR
                ),
                turnovers = listOf(
                    Xs2aRiskUploadJsonTurnoversTurnover(
                        bookingDate = OffsetDateTime.now().minusDays(1),
                        amount = 10f,
                        currencyId = CurrencyId.EUR,
                        purpose = listOf("Test"),
                        counterIban = "DE04888888880087654321",
                        counterBic = "TESTDE88XXX",
                        counterHolder = "Max Mustermann"
                    )
                )
            )
        )

        val response = riskService.completeManually(
            sessionResponse.wizardSessionKey,
            body
        )

        assertNotNull(response)

        riskService.delete(sessionResponse.transaction)
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")
        private val riskService = RiskService(apiKey)
        private val wizardService = WizardService(apiKey)
        private const val reportId = "urp_CBiJpiCwR7c6Gjm7"

        private lateinit var riskResponse: WizardSessionResponse
    }
}