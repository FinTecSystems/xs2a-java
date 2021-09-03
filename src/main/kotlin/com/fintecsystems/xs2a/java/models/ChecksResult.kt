
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param amount 
 * @param currency 
 */

data class ChecksResult (
    @Json(name = "amount")
    val amount: Float,
    @Json(name = "currency")
    val currency: CurrencyId? = null
)

