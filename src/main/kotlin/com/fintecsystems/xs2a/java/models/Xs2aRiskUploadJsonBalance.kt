
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param balance 
 * @param limit 
 * @param available 
 * @param currency 
 */

data class Xs2aRiskUploadJsonBalance (
    @Json(name = "balance")
    val balance: Float,
    @Json(name = "limit")
    val limit: Float,
    @Json(name = "available")
    val available: Float,
    @Json(name = "currency")
    val currency: CurrencyId? = null
)

