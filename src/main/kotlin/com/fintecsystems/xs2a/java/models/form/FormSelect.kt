package com.fintecsystems.xs2a.java.models.form


import com.squareup.moshi.Json

/**
 *
 * @param name The name of the form element
 * @param selected Key of the checked element
 * @param options Object with key as key and value as label
 * @param label The label of the form element
 * @param validation List of validation rules, concatenated with a pipe character
 * @param invalid Indicates whether the validation of the element failed
 * @param failedValidationRules A list of failed validation rules (concatenated with a pipe character)
 * @param validationError The validation error (human readable)
 */

data class FormSelect(
    /* The name of the form element */
    @Json(name = "name")
    override var name: String,
    /* Key of the checked element */
    @Json(name = "selected")
    var selected: String,
    /* Object with key as key and value as label */
    @Json(name = "options")
    var options: Map<String, String>,
    /* The label of the form element */
    @Json(name = "label")
    var label: String,
    /* List of validation rules, concatenated with a pipe character */
    @Json(name = "validation")
    var validation: String,
    /* Indicates whether the validation of the element failed */
    @Json(name = "invalid")
    var invalid: Boolean,
    /* A list of failed validation rules. String if empty and List of Strings if populated */
    @Json(name = "failed_validation_rules")
    var failedValidationRules: Any,
    /* The validation error (human readable) */
    @Json(name = "validation_error")
    var validationError: String
) : FormNameBase()
