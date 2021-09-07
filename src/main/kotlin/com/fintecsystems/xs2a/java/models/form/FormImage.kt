
package com.fintecsystems.xs2a.java.models.form


import com.squareup.moshi.Json

/**
 * 
 * @param data The base64 encoded image
 * @param label The label of the form element
 */

data class FormImage (
    /* The base64 encoded image */
    @Json(name = "data")
    var data: String,
    /* The label of the form element */
    @Json(name = "label")
    var label: String
) : FormBase()

