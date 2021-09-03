package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param `object` Object type, in this case a xs2a_balance_overview
 * @param balance Current balance
 * @param available Current available
 * @param limit Current limit (overdraft)
 * @param currencyId Currency id of above values, e.g. EUR
 * @param createdAt Creation date of the object
 */

data class Xs2aBalanceOverviewResponse(
    /* Object type, in this case a xs2a_balance_overview */
    @Json(name = "object")
    val `object`: String,
    /* Current balance */
    @Json(name = "balance")
    val balance: Float,
    /* Current available */
    @Json(name = "available")
    val available: Float,
    /* Current limit (overdraft) */
    @Json(name = "limit")
    val limit: Float,
    /* Currency id of above values, e.g. EUR */
    @Json(name = "currency_id")
    val currencyId: CurrencyId? = null,
    /* Creation date of the object */
    @Json(name = "created_at")
    val createdAt: LocalDateTime
)

