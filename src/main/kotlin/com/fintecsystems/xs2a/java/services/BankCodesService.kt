package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.api.bankcodes.BankObject
import com.fintecsystems.xs2a.java.models.api.bankcodes.BankObjectList
import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.Product
import okhttp3.OkHttpClient

@Suppress("unused")
class BankCodesService(
    apiKey: String,
    client: OkHttpClient = OkHttpClient(),
    backendUrl: String = "https://api.xs2a.com"
) : ServiceBase(
    apiKey,
    client = client,
    backendUrl = backendUrl
) {

    constructor(apiKey: String) : this(apiKey, OkHttpClient())

    constructor(apiKey: String, backendUrl: String) : this(apiKey, OkHttpClient(), backendUrl)

    constructor(apiKey: String, client: OkHttpClient) : this(apiKey, client, "https://api.xs2a.com")

    fun getBankByCode(bankCode: String): BankObject {
        val response = apiService.get(
            "bankcodes", mutableMapOf(
                "bank_code" to bankCode,
            )
        )

        return JsonSerializer.parseJson(response)
    }

    fun filterAllBanks(
        countryId: CountryId? = null, per_page: Int = 15, page: Int = 1
    ): BankObjectList {
        val response = apiService.get(
            "bankcodes/all", mutableMapOf(
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
        val response = apiService.get(
            "bankcodes/autocomplete", mutableMapOf(
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