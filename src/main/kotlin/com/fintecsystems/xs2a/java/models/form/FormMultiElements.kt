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
    @JvmField
    val label: String,
    /* The value of the form element */
    @Json(name = "value")
    @JvmField
    val value: String,
    /* Array containing the nested elements */
    @Json(name = "elements")
    @JvmField
    val elements: Array<Any>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FormMultiElements

        if (label != other.label) return false
        if (value != other.value) return false
        if (!elements.contentEquals(other.elements)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = label.hashCode()
        result = 31 * result + value.hashCode()
        result = 31 * result + elements.contentHashCode()
        return result
    }
}
