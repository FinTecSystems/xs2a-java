
package com.fintecsystems.xs2a.java.models.form


import com.squareup.moshi.Json

/**
 * 
 * @param name The name of the form element
 * @param checked Indicates whether the checkbox is checked
 * @param label The label of the form element
 * @param validation List of validation rules, concatenated with a pipe character
 * @param invalid Indicates whether the validation of the element failed
 * @param failedValidationRules A list of failed validation rules (concatenated with a pipe character)
 * @param validationError The validation error (human readable)
 */

data class FormCheckbox (
    /* The name of the form element */
    @Json(name = "name")
    override var name: String,
    /* Indicates whether the checkbox is checked */
    @Json(name = "checked")
    var checked: Boolean,
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

