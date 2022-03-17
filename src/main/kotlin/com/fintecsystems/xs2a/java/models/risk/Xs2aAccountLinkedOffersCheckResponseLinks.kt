
package com.fintecsystems.xs2a.java.models.risk


import com.squareup.moshi.Json

/**
 * 
 * @param link 
 * @param description 
 * @param image 
 */

data class Xs2aAccountLinkedOffersCheckResponseLinks (
    @Json(name = "link")
    var link: String,
    @Json(name = "description")
    var description: String,
    @Json(name = "image")
    var image: String
)

