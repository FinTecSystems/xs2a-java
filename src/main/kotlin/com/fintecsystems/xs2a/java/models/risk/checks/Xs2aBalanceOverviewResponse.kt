package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param balance Current balance
 * @param available Current available
 * @param limit Current limit (overdraft)
 * @param currencyId Currency id of above values
 * @param createdAt Creation date of the object
 */

data class Xs2aBalanceOverviewResponse(
    @Json(name = "balance")
    var balance: Float,
    @Json(name = "available")
    var available: Float? = null,
    @Json(name = "limit")
    var limit: Float? = null,
    @Json(name = "currency_id")
    var currencyId: CurrencyId,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

