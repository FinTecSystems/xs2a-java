
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param firstname The first name
 * @param name The last name
 */

data class ExpectedHolderObject (
    /* The first name */
    @Json(name = "firstname")
    @JvmField
    val firstname: String,
    /* The last name */
    @Json(name = "name")
    @JvmField
    val name: String
)

