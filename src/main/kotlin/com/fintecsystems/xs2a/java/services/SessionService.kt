package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardSessionObject

class SessionService(
    apiKey: String
) : ServiceBase(apiKey) {

    fun get(transactionId: String): WizardSessionObject {
        val response = apiService.get("sessions/$transactionId")

        return JsonSerializer.parseJson(response)
    }
}