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
    @JvmField
    override val name: String,
    /* An array of possible transports */
    @Json(name = "tabs")
    @JvmField
    val tabs: List<String>,
    /* The label of the form element */
    @Json(name = "label")
    @JvmField
    val label: String,
    /* The selected transport */
    @Json(name = "selected")
    @JvmField
    val selected: String
) : FormNameBase()
