package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.*

class BankCodesService(
    private val apiKey: String
) {

    fun getBankByCode(bankCode: String): BankObject {
        val response = ApiService(apiKey).get(
            "bankcodes",
            mutableMapOf(
                "bank_code" to bankCode,
            )
        )

        return JsonSerializer.parseJson(response)
    }

    fun filterAllBanks(
        countryId: CountryId? = null,
        per_page: Int = 15,
        page: Int = 1
    ): BankObjectList {
        val response = ApiService(apiKey).get(
            "bankcodes/all",
            mutableMapOf(
                "country_id" to (countryId?.value ?: ""),
                "per_page" to per_page.toString(),
                "page" to page.toString(),
            )
        )

        return JsonSerializer.parseJson(response)
    }

    fun autocompleteSearch(
        query: String,
        countryId: CountryId? = null,
        per_page: Int = 15,
        page: Int = 1,
        product: Product? = null,
    ): BankObjectList {
        val response = ApiService(apiKey).get(
            "bankcodes/autocomplete",
            mutableMapOf(
                "q" to query,
                "country_id" to countryId,
                "per_page" to per_page,
                "page" to page,
                "product" to product,
            )
        )

        return JsonSerializer.parseJson(response)
    }
}