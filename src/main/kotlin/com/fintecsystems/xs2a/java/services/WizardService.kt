package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.wizard.WizardResponse

class WizardService(
    apiKey: String
) : ServiceBase(apiKey, "v1.1") {

    fun navigate(body: Map<String, Any>): WizardResponse {
        val response = apiService.post("wizard", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }
}