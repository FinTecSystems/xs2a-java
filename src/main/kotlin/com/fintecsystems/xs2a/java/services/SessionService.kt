package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardSessionObject
import okhttp3.OkHttpClient

class SessionService(
    apiKey: String,
    client: OkHttpClient,
) : ServiceBase(apiKey, client = client) {

    constructor(apiKey: String) : this(apiKey, OkHttpClient());

    fun get(transactionId: String): WizardSessionObject {
        val response = apiService.get("sessions/$transactionId")

        return JsonSerializer.parseJson(response)
    }
}