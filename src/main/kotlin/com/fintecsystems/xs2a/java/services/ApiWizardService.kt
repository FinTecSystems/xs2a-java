package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.WizardResponse

class ApiWizardService(
    private val apiKey: String
) {

    fun navigate(body: Map<String, Any>): WizardResponse {
        val response = ApiService(apiKey).post("api/wizard", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }
}