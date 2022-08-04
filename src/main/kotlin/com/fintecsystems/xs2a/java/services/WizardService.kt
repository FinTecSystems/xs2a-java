package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardResponse
import okhttp3.OkHttpClient

@Suppress("unused")
class WizardService(
    apiKey: String,
    client: OkHttpClient = defaultClient,
    backendUrl: String = defaultBackendUrl
) : ServiceBase(
    apiKey,
    endpointVersion = "v1.1",
    client = client,
    backendUrl = backendUrl
) {

    constructor(apiKey: String) : this(apiKey, defaultClient)

    constructor(apiKey: String, backendUrl: String) : this(apiKey, defaultClient, backendUrl)

    constructor(apiKey: String, client: OkHttpClient) : this(apiKey, client, defaultBackendUrl)

    fun navigate(body: Map<String, Any>): WizardResponse {
        val response = apiService.post("wizard", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }
}