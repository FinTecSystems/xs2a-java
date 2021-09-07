
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import com.fintecsystems.xs2a.java.models.form.FormObject

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
    @JvmField
    val code: Int,
    /* The error message */
    @Json(name = "message")
    @JvmField
    val message: String? = null,
    /* Will be set if an error occurs during the processing of the current step (e.g. the session has expired). If the recoverable flag equals false a new session has to be started. */
    @Json(name = "error")
    @JvmField
    val error: Any? = null,
    @Json(name = "polling")
    @JvmField
    val polling: Polling? = null,
    @Json(name = "form")
    @JvmField
    val form: FormObject? = null,
)
