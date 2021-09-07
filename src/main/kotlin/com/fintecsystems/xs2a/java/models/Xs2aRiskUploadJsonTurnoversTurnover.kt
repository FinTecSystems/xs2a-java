package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param bookingDate
 * @param amount
 * @param currency
 * @param purpose
 * @param counterIban
 * @param counterBic
 * @param counterHolder
 */

data class Xs2aRiskUploadJsonTurnoversTurnover(
    @Json(name = "booking_date")
    @JvmField
    val bookingDate: LocalDateTime,
    @Json(name = "amount")
    @JvmField
    val amount: Float,
    @Json(name = "currency")
    @JvmField
    val currency: CurrencyId? = null,
    @Json(name = "purpose")
    @JvmField
    val purpose: List<String>,
    @Json(name = "counter_iban")
    @JvmField
    val counterIban: String? = null,
    @Json(name = "counter_bic")
    @JvmField
    val counterBic: String? = null,
    @Json(name = "counter_holder")
    @JvmField
    val counterHolder: String? = null,
)

