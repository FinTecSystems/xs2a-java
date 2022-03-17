import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.fintecsystems.xs2a.java.models.common.Language
import com.fintecsystems.xs2a.java.models.form.*
import com.fintecsystems.xs2a.java.models.pay.*
import com.fintecsystems.xs2a.java.services.PayService
import com.fintecsystems.xs2a.java.services.WizardService
import org.junit.jupiter.api.Test

internal class PayServiceTest {
    private val apiKey = System.getenv("API_KEY")

    @Test
    fun test() {
        PayService(apiKey).apply {
            val pay = Xs2aPay(
                language = Language.DE,
                amount = 1.toFloat(),
                currencyId = CurrencyId.EUR,
                purpose = "Flowers",
                recipientHolder = "Max Mustermann",
                recipientIban = "DE04888888880087654321",
                metadata = mapOf("test" to "test")
            )

            val response = create(pay)

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

            assert(wizRes3.form?.elements?.get(0) is FormHelpText)
            assert(wizRes3.form?.elements?.get(1) is FormImage)
            assert(wizRes3.form?.elements?.get(2) is FormText)

            val wizRes4 = wizardService.navigate(
                mapOf(
                    "key" to response.wizardSessionKey,
                    (wizRes3.form?.elements?.get(2) as FormText).name to "123",
                )
            )

            assert(wizRes4.form?.name == "finish")

            val paymentObject = get(response.transaction)
            assert(paymentObject.amount == 1.toFloat())
            assert(paymentObject.recipientHolder == "Max Mustermann")

            val updatedStatus = updatePaymentStatus(response.transaction, PaymentStatus.LOSS)
            assert(updatedStatus.paymentStatus === PaymentStatus.LOSS)

            // Set to received again to continue the tests
            updatePaymentStatus(response.transaction, PaymentStatus.RECEIVED)

            // getReport(response.transaction)

            val events = getEvents(response.transaction)
            assert(events.total == 0)

            /**
             * Test Refund Payouts
             */
            val requestData = RefundPayoutRequest(
                transactions = listOf(
                    RefundPayoutTransactions(
                        transaction = response.transaction,
                        amount = 0.5.toFloat(),
                        type = RefundPayoutType.REFUND
                    )
                ),
                painType = RefundPayoutRequest.PainType.PAIN001001003
            )

            // val refundPayoutResponse = generatePainFile(requestData)
            // assert(refundPayoutResponse.messageId.isNotEmpty())

            // val refPayout = getRefundPayout(response.transaction)
            // assert(refPayout.transaction == response.transaction)

            /**
             * List
             */
            val list = list()
            assert(list.data.isNotEmpty())
        }
    }
}