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
 * @param currencyId The bank accounts currency code (three-digit, e.g. EUR)
 * @param date The date the balance was seen on.
 * @param createdAt Date of creation
 * @param `object` The value bank_account
 */

data class BankAccountBalance(
    /* Bank Account ID */
    @Json(name = "id")
    var id: String,
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
    @Json(name = "currency_id")
    var currencyId: CurrencyId? = null,
    /* The date the balance was seen on. */
    @Json(name = "date")
    var date: OffsetDateTime,
    /* Date of creation */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime,
    /* The value bank_account */
    @Json(name = "object")
    var `object`: String
)