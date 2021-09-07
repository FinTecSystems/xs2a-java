package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param available The available amount. This can be null, if the available amount is not known.
 * @param limit The limit of the account. This can be null, if the limit is not known.
 * @param balance The current account balance.
 * @param currency The bank accounts currency code (three-digit, e.g. EUR)
 * @param date The date the balance was seen on.
 */

data class AccountStatementBalance(
    /* The available amount. This can be null, if the available amount is not known. */
    @Json(name = "available")
    var available: Float,
    /* The limit of the account. This can be null, if the limit is not known. */
    @Json(name = "limit")
    var limit: Float,
    /* The current account balance. */
    @Json(name = "balance")
    var balance: Float,
    /* The bank accounts currency code (three-digit, e.g. EUR) */
    @Json(name = "currency")
    var currency: CurrencyId? = null,
    /* The date the balance was seen on. */
    @Json(name = "date")
    var date: LocalDateTime
)

