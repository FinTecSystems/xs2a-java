package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param available The available amount. This can be null, if the available amount is not known.
 * @param limit The limit of the account. This can be null, if the limit is not known.
 * @param balance The current account balance.
 * @param currency The bank accounts currency code
 * @param date The date the balance was seen on.
 */

data class AccountStatementBalance(
    @Json(name = "available")
    var available: Float? = null,
    @Json(name = "limit")
    var limit: Float? = null,
    @Json(name = "balance")
    var balance: Float? = null,
    @Json(name = "currency")
    var currency: CurrencyId,
    @Json(name = "date")
    var date: OffsetDateTime
)

