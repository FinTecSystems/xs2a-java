
package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json

/**
 * 
 * @param checkAmount Account balance amount to be checked against
 * @param checkCurrencyId Currency id of check_amount
 */

data class Xs2aBalanceCheck (
    @Json(name = "check_amount")
    var checkAmount: Float,
    @Json(name = "check_currency_id")
    var checkCurrencyId: CurrencyId
)

