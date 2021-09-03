package com.fintecsystems.xs2a.java.models.form


import com.squareup.moshi.Json

/**
 *
 * @param name The name of the form element
 * @param tabs An array of possible transports
 * @param label The label of the form element
 * @param selected The selected transport
 */

data class FormTabs(
    /* The name of the form element */
    @Json(name = "name")
    override val name: String,
    /* An array of possible transports */
    @Json(name = "tabs")
    val tabs: List<String>,
    /* The label of the form element */
    @Json(name = "label")
    val label: String,
    /* The selected transport */
    @Json(name = "selected")
    val selected: String
) : FormNameBase()
