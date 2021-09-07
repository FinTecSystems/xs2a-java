
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
    @JvmField
    val link: String,
    @Json(name = "description")
    @JvmField
    val description: String,
    @Json(name = "image")
    @JvmField
    val image: String
)

