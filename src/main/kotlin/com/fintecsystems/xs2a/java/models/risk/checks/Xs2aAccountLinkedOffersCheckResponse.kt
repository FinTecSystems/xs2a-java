
package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

/**
 * 
 * @param links 
 */

data class Xs2aAccountLinkedOffersCheckResponse (
    @Json(name = "links")
    var links: List<Xs2aAccountLinkedOffersCheckResponseLinks>
)

