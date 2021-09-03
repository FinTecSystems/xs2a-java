package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

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
    val id: String,
    /* The available amount. This can be null, if the available amount is not known. */
    @Json(name = "available")
    val available: Float,
    /* The limit of the account. This can be null, if the limit is not known. */
    @Json(name = "limit")
    val limit: Float,
    /* The current account balance. */
    @Json(name = "balance")
    val balance: Float,
    /* The bank accounts currency code (three-digit, e.g. EUR) */
    @Json(name = "currency_id")
    val currencyId: CurrencyId? = null,
    /* The date the balance was seen on. */
    @Json(name = "date")
    val date: LocalDateTime,
    /* Date of creation */
    @Json(name = "created_at")
    val createdAt: LocalDateTime,
    /* The value bank_account */
    @Json(name = "object")
    val `object`: String
)

