
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
    @JvmField
    val data: String,
    /* The label of the form element */
    @Json(name = "label")
    @JvmField
    val label: String
) : FormBase()

