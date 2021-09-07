
package com.fintecsystems.xs2a.java.models.form

import com.squareup.moshi.Json

/**
 * 
 * @param name The name of the form element
 * @param selected Name of the selected element (value of one of the nested elements)
 * @param elements Array containing the nested elements
 */

data class FormMulti (
    /* The name of the form element */
    @Json(name = "name")
    override var name: String,
    /* Name of the selected element (value of one of the nested elements) */
    @Json(name = "selected")
    var selected: String,
    /* Array containing the nested elements */
    @Json(name = "elements")
    var elements: List<FormMultiElements>
) : FormNameBase()

