package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardResponse
import okhttp3.OkHttpClient

@Suppress("unused")
class WizardService(
    apiKey: String,
    client: OkHttpClient,
    backendUrl: String = "https://api.xs2a.com"
) : ServiceBase(
    apiKey,
    endpointVersion = "v1.1",
    client = client,
    backendUrl = backendUrl
) {

    constructor(apiKey: String) : this(apiKey, OkHttpClient())

    constructor(apiKey: String, backendUrl: String) : this(apiKey, OkHttpClient(), backendUrl)

    fun navigate(body: Map<String, Any>): WizardResponse {
        val response = apiService.post("wizard", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }
}