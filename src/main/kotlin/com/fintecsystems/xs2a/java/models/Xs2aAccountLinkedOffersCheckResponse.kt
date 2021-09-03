
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param links 
 */

data class Xs2aAccountLinkedOffersCheckResponse (
    @Json(name = "links")
    val links: List<Xs2aAccountLinkedOffersCheckResponseLinks>
)

