package com.fintecsystems.xs2a.java.models.wizard

import com.squareup.moshi.FromJson
import com.squareup.moshi.Json

/**
 *
 * @param message The error message.
 * @param recoverable True if session can be continued, False if session failed completely.
 */

data class WizardResponseError(
    @Json(name = "message")
    var message: String,
    @Json(name = "recoverable")
    var recoverable: Boolean,
) {
    companion object Adapter {
        @FromJson
        fun fromJson(data: Map<String, Any>): WizardResponseError? = if (data.isEmpty()) null
        else WizardResponseError(
            data["message"] as String,
            data["recoverable"] as Boolean
        )
    }
}