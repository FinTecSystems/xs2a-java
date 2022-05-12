package com.fintecsystems.xs2a.java.models.risk.uploadJson

import com.fintecsystems.xs2a.java.helper.OffsetDate
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param bookingDate
 * @param amount
 * @param currencyId
 * @param purpose
 * @param counterIban
 * @param counterBic
 * @param counterHolder
 */

data class Xs2aRiskUploadJsonTurnoversTurnover(
    @Json(name = "booking_date")
    @OffsetDate
    var bookingDate: OffsetDateTime,
    @Json(name = "amount")
    var amount: Float,
    @Json(name = "currency_id")
    var currencyId: CurrencyId,
    @Json(name = "purpose")
    var purpose: List<String>,
    @Json(name = "counter_iban")
    var counterIban: String,
    @Json(name = "counter_bic")
    var counterBic: String,
    @Json(name = "counter_holder")
    var counterHolder: String,
)