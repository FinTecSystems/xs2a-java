import com.fintecsystems.xs2a.java.models.*
import com.fintecsystems.xs2a.java.models.form.*
import com.fintecsystems.xs2a.java.models.form.radio.FormRadio
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation
import com.fintecsystems.xs2a.java.services.RiskService
import com.fintecsystems.xs2a.java.services.WizardService
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf

@TestMethodOrder(OrderAnnotation::class)
internal class WizardServiceTest {
    private fun getSelectIndex(key: String, options: Map<String, String>) = options.values.indexOf(key)

    private fun getValueOfFormSelect(value: String, formSelect: FormSelect): Int =
        getSelectIndex(value, formSelect.options)

    private fun navigateResponseWithKey(key: String, responseToNavigate: WizardResponse) =
        (responseToNavigate.form?.elements?.get(1) as FormSelect).let {
            wizardService.navigate(
                constructBody(
                    it.name to getValueOfFormSelect(key, it)
                ),
            )
        }

    private fun constructBody(vararg pairs: Pair<String, Any>) = mapOf(
        "key" to wizardResponse.wizardSessionKey,
        *pairs
    )

    private fun testSelectRoute(
        key: String,
        typesToTest: List<Pair<KClass<out FormBase>, Any>>,
        customTest: ((WizardResponse) -> Unit) = {}
    ) {
        response = navigateResponseWithKey(key, response)

        // Test if all elements are present.
        typesToTest.forEachIndexed { index, classToTest ->
            assert(classToTest.first.isInstance(response.form?.elements?.get(index)))
        }

        customTest(response)

        // Construct submit body.
        val submitBody = typesToTest
            .mapIndexed { index, type ->
                if (type.first.isSubclassOf(FormNameBase::class))
                    (response.form?.elements?.get(index) as FormNameBase).name to type.second
                else null
            }
            .filterNotNull()

        // Return to the Select view.
        response = wizardService.navigate(
            constructBody(*submitBody.toTypedArray())
        )

        // Make sure we're back in the Select view.
        assert(response.form?.elements?.get(0) is FormHelpText)
        assert(response.form?.elements?.get(1) is FormSelect)
    }

    @Test
    @Order(0)
    fun testCreateSession() {
        RiskService(apiKey).apply {
            wizardResponse = create(Xs2aRisk())
        }
    }

    @Test
    @Order(1)
    fun testInitializeSession() {
        response = wizardService.navigate(
            mapOf(
                "key" to wizardResponse.wizardSessionKey,
            )
        )

        assert(response.form?.elements?.get(0) is FormSelect)
        assert(response.form?.elements?.get(1) is FormText)
    }

    @Test
    @Order(2)
    fun testNavigatingToLogin() {
        response = wizardService.navigate(
            constructBody(
                "country_id" to CountryId.DE,
                "bank_code" to 88888888
            )
        )

        assert(response.form?.elements?.get(0) is FormText)
        assert(response.form?.elements?.get(1) is FormPassword)
        assert(response.form?.elements?.get(2) is FormCheckbox)
    }

    @Test
    @Order(3)
    fun testInvalidInput() {
        response = wizardService.navigate(
            constructBody(
                "USER_NAME" to "testUser",
                "USER_PIN" to "forms",
                "privacy_policy" to false, // This is required, that's why the request will "fail"
            )
        )

        assert(response.form?.elements?.get(0) is FormText)
        assert((response.form?.elements?.get(0) as FormText).validationError.isEmpty())
        assert(response.form?.elements?.get(1) is FormPassword)
        assert((response.form?.elements?.get(1) as FormPassword).validationError.isEmpty())
        assert(response.form?.elements?.get(2) is FormCheckbox)
        assert((response.form?.elements?.get(2) as FormCheckbox).validationError.isNotEmpty())
    }

    @Test
    @Order(4)
    fun testNavigatingToFormSelect() {
        response = wizardService.navigate(
            constructBody(
                "USER_NAME" to "testUser",
                "USER_PIN" to "forms",
                "privacy_policy" to true,
            )
        )

        assert(response.form?.elements?.get(0) is FormHelpText)
        assert(response.form?.elements?.get(1) is FormSelect)
    }

    @Test
    @Order(5)
    fun testMultiCredentials() {
        testSelectRoute(
            "login_multi_credentials", listOf(
                FormText::class to 10,
                FormText::class to 10,
                FormText::class to "a",
                FormPassword::class to "b"
            )
        )
    }

    @Test
    @Order(6)
    fun testCaptcha() {
        testSelectRoute(
            "login_captcha", listOf(
                FormHelpText::class to "",
                FormText::class to 10001,
                FormPassword::class to "a",
                FormCaptcha::class to "b"
            )
        )
    }

    @Test
    @Order(7)
    fun testMultiForm() {
        testSelectRoute(
            "multiform", listOf(
                FormMulti::class to "SECOND",
            )
        )
    }

    @Test
    @Order(8)
    fun testRadioSelect() {
        testSelectRoute(
            "radio_select", listOf(
                FormHelpText::class to "",
                FormRadio::class to 1,
            )
        )
    }

    @Test
    @Order(9)
    fun testSelect() {
        testSelectRoute(
            "select", listOf(
                FormHelpText::class to "",
                FormSelect::class to 1,
            )
        )
    }

    @Test
    @Order(10)
    fun testTanSelect() {
        testSelectRoute(
            "tan_select", listOf(
                FormHelpText::class to "",
                FormRadio::class to 1,
            )
        )
    }

    @Test
    @Order(11)
    fun testITan() {
        testSelectRoute(
            "tan_iTAN", listOf(
                FormHelpText::class to "",
                FormImage::class to "",
                FormText::class to "1000",
            )
        )
    }

    @Test
    @Order(12)
    fun testMTan() {
        testSelectRoute(
            "tan_mTAN", listOf(
                FormHelpText::class to "",
                FormText::class to "1000",
            )
        )
    }

    @Test
    @Order(13)
    fun testFlickerTan() {
        testSelectRoute(
            "tan_flickerTAN", listOf(
                FormHelpText::class to "",
                FormFlicker::class to "1000",
            )
        )
    }

    @Test
    @Order(14)
    fun testQrTan() {
        testSelectRoute(
            "tan_QR-TAN", listOf(
                FormHelpText::class to "",
                FormImage::class to "",
                FormText::class to "1000",
            )
        )
    }

    @Test
    @Order(15)
    fun testRedirect() {
        response = navigateResponseWithKey("login_redirect", response)


        assert(response.form?.elements?.get(0) is FormHelpText)
        assert(response.form?.elements?.get(1) is FormRedirect)

        response = wizardService.navigate(
            constructBody(
                "action" to "back"
            )
        )

        assert(response.form?.elements?.get(0) is FormText)
        assert(response.form?.elements?.get(1) is FormPassword)
        assert(response.form?.elements?.get(2) is FormCheckbox)
    }


    @Test
    @Order(16)
    fun testFinishTransaction() {
        response = wizardService.navigate(
            constructBody(
                "USER_NAME" to "testUser",
                "USER_PIN" to "accounts",
                "privacy_policy" to true,
            )
        )

        assert(response.form?.elements?.get(0) is FormRadio)

        response = wizardService.navigate(
            constructBody(
                (response.form?.elements?.get(0) as FormRadio).name to 0,
            )
        )

        assert(response.form?.name == "finish")
        assert(response.form?.elements!!.isEmpty())
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")

        private lateinit var wizardResponse: WizardSessionResponse
        private lateinit var response: WizardResponse
        private val wizardService = WizardService(apiKey)
    }
}