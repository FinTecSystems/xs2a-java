package com.fintecsystems.xs2a.java.models.form.radio

import com.squareup.moshi.Json

/**
 *
 * @param label Label of the element
 * @param disabled Disabled state of the element
 */

data class FormRadioOption(
    /* Label of the element */
    @Json(name = "label")
    var label: String,
    /* Disabled state of the element */
    @Json(name = "disabled")
    var disabled: Boolean,
)
