package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param balance Current balance
 * @param available Current available
 * @param limit Current limit (overdraft)
 * @param currencyId Currency id of above values, e.g. EUR
 * @param createdAt Creation date of the object
 */

data class Xs2aBalanceOverviewResponse(
    /* Current balance */
    @Json(name = "balance")
    var balance: Float,
    /* Current available */
    @Json(name = "available")
    var available: Float? = null,
    /* Current limit (overdraft) */
    @Json(name = "limit")
    var limit: Float? = null,
    /* Currency id of above values, e.g. EUR */
    @Json(name = "currency_id")
    var currencyId: CurrencyId,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

