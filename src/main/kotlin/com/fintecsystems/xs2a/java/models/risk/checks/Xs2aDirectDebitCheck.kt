package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.helper.OffsetDate
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param checkAmount Account balance amount to be checked against
 * @param checkCurrencyId Currency id of check_amount
 * @param startDate Date format is \"YYYY-mm-dd\". An optional field. If a start_date is given, the field \"end_date\" has to be set as well. The start date can be no earlier than the day after the transaction. In case the start date is invalid or not set, the earliest bank work day will be used.
 * @param endDate Date format is \"YYYY-mm-dd\". An optional field. The end date has to be at lest 3 days after the start date and can be a maximum of 30 days into the future. If there is no end date given, the maximum of 30 days will be used.
 */

data class Xs2aDirectDebitCheck(
    @Json(name = "check_amount")
    var checkAmount: Float,
    @Json(name = "check_currency_id")
    var checkCurrencyId: CurrencyId,
    @Json(name = "start_date")
    @OffsetDate
    var startDate: OffsetDateTime? = null,
    @Json(name = "end_date")
    @OffsetDate
    var endDate: OffsetDateTime? = null,
)

