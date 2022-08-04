package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardResponse
import okhttp3.OkHttpClient

@Suppress("unused")
class ApiWizardService(
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

    fun navigate(body: Map<String, Any>): WizardResponse {
        val response = apiService.post("api/wizard", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }
}