package com.fintecsystems.xs2a.java.models.form


import com.squareup.moshi.Json

/**
 *
 * @param name The name of the form element
 * @param checked Index of the checked element
 * @param options An array of possible options
 * @param label The label of the form element
 * @param validation List of validation rules, concatenated with a pipe character
 * @param invalid Indicates whether the validation of the element failed
 * @param failedValidationRules A list of failed validation rules (concatenated with a pipe character)
 * @param validationError The validation error (human readable)
 */

data class FormRadio(
    /* The name of the form element */
    @Json(name = "name")
    @JvmField
    override val name: String,
    /* Index of the checked element */
    @Json(name = "checked")
    @JvmField
    val checked: String,
    /* An array of possible options */
    @Json(name = "options")
    @JvmField
    val options: Any,
    /* The label of the form element */
    @Json(name = "label")
    @JvmField
    val label: String,
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
