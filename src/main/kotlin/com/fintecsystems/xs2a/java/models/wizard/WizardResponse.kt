package com.fintecsystems.xs2a.java.models.wizard

import com.fintecsystems.xs2a.java.models.Polling
import com.fintecsystems.xs2a.java.models.form.FormObject
import com.squareup.moshi.Json

/**
 *
 * @param code The http status code
 * @param message The error message
 * @param error Will be set if an error occurs during the processing of the current step (e.g. the session has expired). If the recoverable flag equals false a new session has to be started.
 * @param polling
 * @param form
 */

data class WizardResponse (
    /* The http status code */
    @Json(name = "code")
    var code: Int,
    /* The error message */
    @Json(name = "message")
    var message: String? = null,
    /* Will be set if an error occurs during the processing of the current step (e.g. the session has expired). If the recoverable flag equals false a new session has to be started. */
    @Json(name = "error")
    var error: Any? = null,
    @Json(name = "polling")
    var polling: Polling? = null,
    @Json(name = "form")
    var form: FormObject? = null,
)