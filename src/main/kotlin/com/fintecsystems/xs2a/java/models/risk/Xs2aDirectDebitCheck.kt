package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.CurrencyId
import com.squareup.moshi.Json
import java.time.LocalDate

/**
 *
 * @param checkAmount Account balance amount to be checked against
 * @param checkCurrencyId Currency id of check_amount, e.g. EUR
 * @param startDate Date format is \"YYYY-mm-dd\". An optional field. If a start_date is given, the field \"end_date\" has to be set as well. The start date can be no earlier than the day after the transaction. In case the start date is invalid or not set, the earliest bank work day will be used.
 * @param endDate Date format is \"YYYY-mm-dd\". An optional field. The end date has to be at lest 3 days after the start date and can be a maximum of 30 days into the future. If there is no end date given, the maximum of 30 days will be used.
 */

data class Xs2aDirectDebitCheck(
    /* Account balance amount to be checked against */
    @Json(name = "check_amount")
    var checkAmount: Float,
    /* Currency id of check_amount, e.g. EUR */
    @Json(name = "check_currency_id")
    var checkCurrencyId: CurrencyId,
    /* Date format is \"YYYY-mm-dd\". An optional field. If a start_date is given, the field \"end_date\" has to be set as well. The start date can be no earlier than the day after the transaction. In case the start date is invalid or not set, the earliest bank work day will be used. */
    @Json(name = "start_date")
    var startDate: LocalDate? = null,
    /* Date format is \"YYYY-mm-dd\". An optional field. The end date has to be at lest 3 days after the start date and can be a maximum of 30 days into the future. If there is no end date given, the maximum of 30 days will be used. */
    @Json(name = "end_date")
    var endDate: LocalDate? = null,
)

