
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param name Name to compare against. Usually the surname.
 * @param firstname Firstname to compare against.
 */

data class Xs2aNameCheck (
    /* Name to compare against. Usually the surname. */
    @Json(name = "name")
    var name: String,
    /* Firstname to compare against. */
    @Json(name = "firstname")
    var firstname: String
)

