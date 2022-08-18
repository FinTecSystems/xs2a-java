import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.fintecsystems.xs2a.java.models.common.Language
import com.fintecsystems.xs2a.java.models.form.*
import com.fintecsystems.xs2a.java.models.pay.*
import com.fintecsystems.xs2a.java.models.wizard.WizardSessionResponse
import com.fintecsystems.xs2a.java.services.PayService
import com.fintecsystems.xs2a.java.services.WizardService
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import kotlin.test.assertNotNull

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
internal class PayServiceTest {
    @Test
    @Order(0)
    fun testCreate() {
        val pay = Xs2aPay(
            language = Language.DE,
            amount = 1.toFloat(),
            currencyId = CurrencyId.EUR,
            purpose = "Flowers",
            recipientHolder = "Max Mustermann",
            recipientIban = "DE04888888880087654321",
            metadata = mapOf("test" to "test")
        )

        payResponse = payService.create(pay)

        /* Navigate so we can get the results of the risk checks */
        val wizRes1 = wizardService.navigate(
            mapOf(
                "key" to payResponse.wizardSessionKey,
            )
        )

        assert(wizRes1.form?.elements?.get(0) is FormSelect)
        assert(wizRes1.form?.elements?.get(1) is FormText)

        val wizRes2 = wizardService.navigate(
            mapOf(
                "key" to payResponse.wizardSessionKey,
                "country_id" to CountryId.DE,
                "bank_code" to 88888888
            )
        )

        assert(wizRes2.form?.elements?.get(0) is FormText)
        assert(wizRes2.form?.elements?.get(1) is FormPassword)
        assert(wizRes2.form?.elements?.get(2) is FormCheckbox)

        val wizRes3 = wizardService.navigate(
            mapOf(
                "key" to payResponse.wizardSessionKey,
                "USER_NAME" to "abcdef",
                "USER_PIN" to 123456,
                "privacy_policy" to true,
            )
        )

        assert(wizRes3.form?.elements?.get(0) is FormHelpText)
        assert(wizRes3.form?.elements?.get(1) is FormImage)
        assert(wizRes3.form?.elements?.get(2) is FormText)

        val wizRes4 = wizardService.navigate(
            mapOf(
                "key" to payResponse.wizardSessionKey,
                (wizRes3.form?.elements?.get(2) as FormText).name to "123",
            )
        )

        assert(wizRes4.form?.name == "finish")
    }

    @Test
    @Order(1)
    fun testGet() {
        val paymentObject = payService.get(payResponse.transaction)
        assert(paymentObject.amount == 1f)
        assert(paymentObject.recipientHolder == "Max Mustermann")
    }

    @Test
    @Order(2)
    fun testUpdatePaymentStatus() {
        var updatedStatus = payService.updatePaymentStatus(payResponse.transaction, PaymentStatus.LOSS)
        assert(updatedStatus.paymentStatus === PaymentStatus.LOSS)

        // Set to received again to continue the tests
        updatedStatus = payService.updatePaymentStatus(payResponse.transaction, PaymentStatus.RECEIVED)
        assert(updatedStatus.paymentStatus === PaymentStatus.RECEIVED)
    }

    @Test
    @Order(3)
    fun testGetReport() {
        val response = payService.getReport(
            payResponse.transaction,
            reportId
        )

        assertNotNull(response)
    }

    @Test
    @Order(4)
    fun testGetEvents() {
        val events = payService.getEvents(payResponse.transaction)
        assert(events.total == 0)
    }

    @Test
    @Order(5)
    fun testGeneratePainFile() {
        val requestData = RefundPayoutRequest(
            transactions = listOf(
                RefundPayoutTransactions(
                    transaction = payResponse.transaction,
                    amount = 0.5.toFloat(),
                    type = RefundPayoutType.REFUND
                )
            ),
            painType = PainType.PAIN001001003
        )

        val refundPayoutResponse = payService.generatePainFile(requestData)
        assert(refundPayoutResponse.messageId.isNotEmpty())

        painMessageId = refundPayoutResponse.messageId
    }

    @Test
    @Order(6)
    fun testGetPainFile() {
        val painFile = payService.getPainFile(painMessageId)

        painFile.use {
            assert(!painFile.exhausted())
        }
    }

    @Test
    @Order(7)
    fun testListRefundPayouts() {
        val list = payService.listRefundPayouts()
        assert(list.data.isNotEmpty())
    }

    @Test
    @Order(8)
    fun testGetRefundPayout() {
        val response = payService.getRefundPayout(payResponse.transaction)
        assert(response.transaction == payResponse.transaction)
    }

    @Test
    @Order(9)
    fun testList() {
        val list = payService.list()
        assert(list.data.isNotEmpty())
    }

    @Test
    @Order(10)
    fun testDelete() {
        payService.delete(payResponse.transaction)
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")
        private val payService = PayService(apiKey)
        private val wizardService = WizardService(apiKey)
        private const val reportId = "urp_CBiJpiCwR7c6Gjm7"

        private lateinit var payResponse: WizardSessionResponse
        private lateinit var painMessageId: String
    }
}