package com.fintecsystems.xs2a.java.models.form

import com.squareup.moshi.Json

/**
 *
 * @param label The label of the element
 * @param value The value of the form element
 * @param elements Array containing the nested elements
 */

data class FormMultiElements(
    /* The label of the element */
    @Json(name = "label")
    val label: String,
    /* The value of the form element */
    @Json(name = "value")
    val value: String,
    /* Array containing the nested elements */
    @Json(name = "elements")
    val elements: Array<Any>
)
