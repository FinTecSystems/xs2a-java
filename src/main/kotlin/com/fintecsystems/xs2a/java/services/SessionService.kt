package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardSessionObject
import okhttp3.OkHttpClient

@Suppress("unused")
class SessionService(
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

    fun get(transactionId: String): WizardSessionObject {
        val response = apiService.get("sessions/$transactionId")

        return JsonSerializer.parseJson(response)
    }
}