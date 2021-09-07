
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param rating Rating from A - F
 * @param version 
 */

data class Xs2aRatingB2bCheckResponse (
    /* Rating from A - F */
    @Json(name = "rating")
    var rating: String,
    @Json(name = "version")
    var version: String
)

