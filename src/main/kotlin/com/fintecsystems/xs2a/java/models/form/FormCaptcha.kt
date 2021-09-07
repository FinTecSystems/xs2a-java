
package com.fintecsystems.xs2a.java.models.form


import com.squareup.moshi.Json

/**
 * 
 * @param name The name of the form element
 * @param data The base64 encoded image
 * @param value The set value of the form element
 * @param validation List of validation rules, concatenated with a pipe character
 * @param invalid Indicates whether the validation of the element failed
 * @param failedValidationRules A list of failed validation rules (concatenated with a pipe character)
 * @param validationError The validation error (human readable)
 */

data class FormCaptcha (
    /* The name of the form element */
    @Json(name = "name")
    @JvmField
    override val name: String,
    /* The base64 encoded image */
    @Json(name = "data")
    @JvmField
    val data: String,
    /* The set value of the form element */
    @Json(name = "value")
    @JvmField
    val value: String,
    /* List of validation rules, concatenated with a pipe character */
    @Json(name = "validation")
    @JvmField
    val validation: String,
    /* Indicates whether the validation of the element failed */
    @Json(name = "invalid")
    @JvmField
    val invalid: Boolean,
    /* A list of failed validation rules. String if empty and List of Strings if populated */
    @Json(name = "failed_validation_rules")
    @JvmField
    val failedValidationRules: Any,
    /* The validation error (human readable) */
    @Json(name = "validation_error")
    @JvmField
    val validationError: String
) : FormNameBase()

