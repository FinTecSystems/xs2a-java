package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param `object` Object type, in this case a xs2a_balance_check
 * @param checkAmount Account balance amount to be checked against
 * @param checkCurrencyId Currency id of check_amount, e.g. EUR
 * @param checkPassed Indicates whether or not the check was successful
 * @param createdAt Creation date of the object
 */

data class Xs2aBalanceCheckResponse(
    /* Object type, in this case a xs2a_balance_check */
    @Json(name = "object")
    var `object`: String,
    /* Account balance amount to be checked against */
    @Json(name = "check_amount")
    var checkAmount: Float,
    /* Currency id of check_amount, e.g. EUR */
    @Json(name = "check_currency_id")
    var checkCurrencyId: CurrencyId,
    /* Indicates whether or not the check was successful */
    @Json(name = "check_passed")
    var checkPassed: Boolean,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

