
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param rating Rating from A - F
 * @param version 
 */

data class Xs2aRatingB2cCheckResponse (
    /* Rating from A - F */
    @Json(name = "rating")
    @JvmField
    val rating: String,
    @Json(name = "version")
    @JvmField
    val version: String
)

