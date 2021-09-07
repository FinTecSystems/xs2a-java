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
    val bookingDate: LocalDateTime,
    @Json(name = "amount")
    val amount: Float,
    @Json(name = "currency")
    val currency: CurrencyId? = null,
    @Json(name = "purpose")
    val purpose: List<String>,
    @Json(name = "counter_iban")
    val counterIban: String? = null,
    @Json(name = "counter_bic")
    val counterBic: String? = null,
    @Json(name = "counter_holder")
    val counterHolder: String? = null,
)

