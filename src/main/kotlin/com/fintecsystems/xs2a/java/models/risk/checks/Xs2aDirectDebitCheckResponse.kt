package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.helper.OffsetDate
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param checkAmount Account balance amount to be checked against
 * @param checkCurrencyId Currency id of check_amount, e.g. EUR
 * @param startDate An optional field. The date format is \"YYYY-mm-dd\". If a start_date is given, the field \"end_date\" has to be set as well. The start date can be no earlier than the day after the transaction.  In case the start date is invalid or not set, the earliest bank work  day will be used.
 * @param endDate An optional field. The date format is \"YYYY-mm-dd\". The end date has to be at lest 3 days after the start date and can be a maximum of 30 days into the  future. If there is no end date given, the maximum of 30 days will be used.
 * @param recommendation This field represents the response from our system. The values will either be ANY,  DATE or REJECT. If ANY is returned, it should be save to execute the direct debit at  any time. If DATE is returned, we suggest a date for executing the direct debit  in the field recommendation_date. In case of a REJECT it is not recommended to  execute a direct debit, because the amount is likely not be covered. For a REJECT  the returned recommendation_date will always be \"0000-00-00\".
 * @param recommendationDate If the recommendation is DATE, this will be the recommended time to execute  a direct debit. In some cases, this date might be out of the start-/end-date  range supplied (reasons might be holidays etc.). In case of REJECT this field  will always be set as \"0000-00-00\".
 * @param createdAt Creation date of the object
 */

data class Xs2aDirectDebitCheckResponse(
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
    @Json(name = "recommendation")
    var recommendation: Xs2aDirectDebitCheckRecommendation,
    @Json(name = "recommendation_date")
    @OffsetDate
    var recommendationDate: OffsetDateTime? = null,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

