package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardSessionObject

class SessionService(
    private val apiKey: String
) {

    fun get(transactionId: String): WizardSessionObject {
        val response = ApiService(apiKey).get("sessions/$transactionId")

        return JsonSerializer.parseJson(response)
    }
}