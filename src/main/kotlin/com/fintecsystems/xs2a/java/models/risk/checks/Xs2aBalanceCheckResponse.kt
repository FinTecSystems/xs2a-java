package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param checkAmount Account balance amount to be checked against
 * @param checkCurrencyId Currency id of check_amount
 * @param checkPassed Indicates whether or not the check was successful
 * @param createdAt Creation date of the object
 */

data class Xs2aBalanceCheckResponse(
    @Json(name = "check_amount")
    var checkAmount: Float,
    @Json(name = "check_currency_id")
    var checkCurrencyId: CurrencyId,
    @Json(name = "check_passed")
    var checkPassed: Boolean,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

