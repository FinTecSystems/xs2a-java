
package com.fintecsystems.xs2a.java.models.risk


import com.squareup.moshi.Json

/**
 * 
 * @param firstname The first name
 * @param name The last name
 */

data class ExpectedHolderObject (
    /* The first name */
    @Json(name = "firstname")
    var firstname: String,
    /* The last name */
    @Json(name = "name")
    var name: String
)

