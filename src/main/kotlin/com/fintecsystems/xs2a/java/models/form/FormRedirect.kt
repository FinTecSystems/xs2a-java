package com.fintecsystems.xs2a.java.models.form


import com.squareup.moshi.Json

/**
 *
 * @param name The name of the form element
 * @param label The label of the form element
 * @param back The label of the back button
 * @param url Redirection url
 */

data class FormRedirect(
    /* The name of the form element */
    @Json(name = "name")
    val name: String,
    /* The label of the form element */
    @Json(name = "label")
    val label: String,
    /* The label of the back button */
    @Json(name = "back")
    val back: String,
    /* Redirection url */
    @Json(name = "url")
    val url: String,
) : FormBase()
