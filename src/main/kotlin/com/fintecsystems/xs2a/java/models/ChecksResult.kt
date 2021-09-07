
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param amount 
 * @param currency 
 */

data class ChecksResult (
    @Json(name = "amount")
    @JvmField
    val amount: Float,
    @Json(name = "currency")
    @JvmField
    val currency: CurrencyId? = null
)

