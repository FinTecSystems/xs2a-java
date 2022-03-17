import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.Product
import org.junit.jupiter.api.Test
import com.fintecsystems.xs2a.java.services.BankCodesService

internal class BankCodesServiceTest {
    @Test
    fun testGetBankByCode() {
        BankCodesService(apiKey).apply {
            val response = getBankByCode("88888888")
            assert(response.bankCode == "88888888")
        }
    }

    @Test
    fun testFilterAllBanks() {
        BankCodesService(apiKey).apply {
            val response = filterAllBanks(countryId = CountryId.CH)
            assert(response.data[0].countryId?.value === CountryId.CH.value)
        }
    }

    @Test
    fun testAutocompleteSearch() {
        BankCodesService(apiKey).apply {
            val response = autocompleteSearch("postbank")
            assert(response.data[0].name.contains("Postbank"))
        }
    }

    @Test
    fun testAutocompleteSearchWithProduct() {
        BankCodesService(apiKey).apply {
            val response = autocompleteSearch("postbank", product = Product.RISK)
            assert(response.data[0].name.contains("Postbank"))
        }
    }

    companion object {
        private val apiKey = System.getenv("API_KEY")
    }
}