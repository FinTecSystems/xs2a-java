
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param link 
 * @param description 
 * @param image 
 */

data class Xs2aAccountLinkedOffersCheckResponseLinks (
    @Json(name = "link")
    val link: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "image")
    val image: String
)

