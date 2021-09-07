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
    @JvmField
    val id: String,
    /* The available amount. This can be null, if the available amount is not known. */
    @Json(name = "available")
    @JvmField
    val available: Float,
    /* The limit of the account. This can be null, if the limit is not known. */
    @Json(name = "limit")
    @JvmField
    val limit: Float,
    /* The current account balance. */
    @Json(name = "balance")
    @JvmField
    val balance: Float,
    /* The bank accounts currency code (three-digit, e.g. EUR) */
    @Json(name = "currency_id")
    @JvmField
    val currencyId: CurrencyId? = null,
    /* The date the balance was seen on. */
    @Json(name = "date")
    @JvmField
    val date: LocalDateTime,
    /* Date of creation */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime,
    /* The value bank_account */
    @Json(name = "object")
    @JvmField
    val `object`: String
)

