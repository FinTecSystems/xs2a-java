package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.WizardResponse

class WizardService(
    private val apiKey: String
) {

    fun navigate(body: Map<String, Any>): WizardResponse {
        val response = ApiService(apiKey, "v1.1").post("wizard", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }
}