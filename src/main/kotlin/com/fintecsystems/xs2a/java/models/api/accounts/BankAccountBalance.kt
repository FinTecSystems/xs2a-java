package com.fintecsystems.xs2a.java.models.api.accounts

import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param id Bank Account ID
 * @param available The available amount. This can be null, if the available amount is not known.
 * @param limit The limit of the account. This can be null, if the limit is not known.
 * @param balance The current account balance.
 * @param currency The bank accounts currency code
 * @param date The date the balance was seen on.
 * @param createdAt Date of creation
 */

data class BankAccountBalance(
    @Json(name = "id")
    var id: String,
    @Json(name = "available")
    var available: Float? = null,
    @Json(name = "limit")
    var limit: Float? = null,
    @Json(name = "balance")
    var balance: Float,
    @Json(name = "currency")
    var currency: CurrencyId,
    @Json(name = "date")
    var date: OffsetDateTime,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime,
)