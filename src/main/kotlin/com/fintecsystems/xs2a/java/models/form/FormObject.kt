package com.fintecsystems.xs2a.java.models.form

import com.squareup.moshi.Json


/**
 * Contains the form objects
 * @param name ???
 * @param elements Contains the elements of the form. Can contain any of 'Form.Element'
 */

data class FormObject(
    /* ??? */
    @Json(name = "name")
    var name: String,
    /* Contains the elements of the form. Can contain any of 'Form.Element' */
    @Json(name = "elements")
    var elements: Array<FormBase>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FormObject

        if (name != other.name) return false
        if (!elements.contentEquals(other.elements)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + elements.contentHashCode()
        return result
    }
}
