
package com.fintecsystems.xs2a.java.models.form


import com.squareup.moshi.Json

/**
 * 
 * @param title The title of the form element
 * @param text The text of the form element
 */

data class FormHelpText (
    /* The title of the form element */
    @Json(name = "title")
    var title: String,
    /* The text of the form element */
    @Json(name = "text")
    var text: String
) : FormBase()

