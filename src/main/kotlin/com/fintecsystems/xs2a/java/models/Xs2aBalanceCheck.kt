
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param checkAmount Account balance amount to be checked against
 * @param checkCurrencyId Currency id of check_amount, e.g. EUR
 */

data class Xs2aBalanceCheck (
    /* Account balance amount to be checked against */
    @Json(name = "check_amount")
    val checkAmount: Float,
    /* Currency id of check_amount, e.g. EUR */
    @Json(name = "check_currency_id")
    val checkCurrencyId: CurrencyId? = null
)

