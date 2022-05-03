package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardResponse

class ApiWizardService(
    apiKey: String
) : ServiceBase(apiKey) {

    fun navigate(body: Map<String, Any>): WizardResponse {
        val response = apiService.post("api/wizard", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }
}