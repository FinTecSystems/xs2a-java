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
    var elements: List<FormBase>
)
