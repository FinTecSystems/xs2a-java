
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
    @JvmField
    val balance: Float,
    @Json(name = "limit")
    @JvmField
    val limit: Float,
    @Json(name = "available")
    @JvmField
    val available: Float,
    @Json(name = "currency")
    @JvmField
    val currency: CurrencyId? = null
)

