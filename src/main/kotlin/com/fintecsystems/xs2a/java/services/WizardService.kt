package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardResponse
import okhttp3.OkHttpClient

class WizardService(
    apiKey: String,
    client: OkHttpClient,
) : ServiceBase(apiKey, "v1.1", client = client) {

    constructor(apiKey: String) : this(apiKey, OkHttpClient());

    fun navigate(body: Map<String, Any>): WizardResponse {
        val response = apiService.post("wizard", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }
}