package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param `object` Object type, in this case a xs2a_balance_check
 * @param checkAmount Account balance amount to be checked against
 * @param checkCurrencyId Currency id of check_amount, e.g. EUR
 * @param checkPassed Indicates whether or not the check was successful
 * @param createdAt Creation date of the object
 */

data class Xs2aBalanceCheckResponse(
    /* Object type, in this case a xs2a_balance_check */
    @Json(name = "object")
    @JvmField
    val `object`: String,
    /* Account balance amount to be checked against */
    @Json(name = "check_amount")
    @JvmField
    val checkAmount: Float,
    /* Currency id of check_amount, e.g. EUR */
    @Json(name = "check_currency_id")
    @JvmField
    val checkCurrencyId: CurrencyId? = null,
    /* Indicates whether or not the check was successful */
    @Json(name = "check_passed")
    @JvmField
    val checkPassed: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime
)

