package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.CurrencyId
import com.squareup.moshi.Json
import java.time.LocalDate
import java.time.LocalDateTime

/**
 *
 * @param checkAmount Account balance amount to be checked against
 * @param checkCurrencyId Currency id of check_amount, e.g. EUR
 * @param startDate An optional field. The date format is \"YYYY-mm-dd\". If a start_date is given, the field \"end_date\" has to be set as well. The start date can be no earlier than the day after the transaction.  In case the start date is invalid or not set, the earliest bank work  day will be used.
 * @param endDate An optional field. The date format is \"YYYY-mm-dd\". The end date has to be at lest 3 days after the start date and can be a maximum of 30 days into the  future. If there is no end date given, the maximum of 30 days will be used.
 * @param recommendation This field represents the response from our system. The values will either be ANY,  DATE or REJECT. If ANY is returned, it should be save to execute the direct debit at  any time. If DATE is returned, we suggest a date for executing the direct debit  in the field recommendation_date. In case of a REJECT it is not recommended to  execute a direct debit, because the amount is likely not be covered. For a REJECT  the returned recommendation_date will always be \"0000-00-00\".
 * @param recommendationDate If the recommendation is DATE, this will be the recommended time to execute  a direct debit. In some cases, this date might be out of the start-/end-date  range supplied (reasons might be holidays etc.). In case of REJECT this field  will always be set as \"0000-00-00\".
 * @param `object` Object type, in this case a  xs2a_direct_debit_check
 * @param createdAt Creation date of the object
 */

data class Xs2aDirectDebitCheckResponse(
    /* Account balance amount to be checked against */
    @Json(name = "check_amount")
    var checkAmount: Float,
    /* Currency id of check_amount, e.g. EUR */
    @Json(name = "check_currency_id")
    var checkCurrencyId: CurrencyId,
    /* An optional field. The date format is \"YYYY-mm-dd\". If a start_date is given, the field \"end_date\" has to be set as well. The start date can be no earlier than the day after the transaction.  In case the start date is invalid or not set, the earliest bank work  day will be used. */
    @Json(name = "start_date")
    var startDate: LocalDate? = null,
    /* An optional field. The date format is \"YYYY-mm-dd\". The end date has to be at lest 3 days after the start date and can be a maximum of 30 days into the  future. If there is no end date given, the maximum of 30 days will be used. */
    @Json(name = "end_date")
    var endDate: LocalDate? = null,
    /* This field represents the response from our system. The values will either be ANY,  DATE or REJECT. If ANY is returned, it should be save to execute the direct debit at  any time. If DATE is returned, we suggest a date for executing the direct debit  in the field recommendation_date. In case of a REJECT it is not recommended to  execute a direct debit, because the amount is likely not be covered. For a REJECT  the returned recommendation_date will always be \"0000-00-00\". */
    @Json(name = "recommendation")
    var recommendation: String,
    /* If the recommendation is DATE, this will be the recommended time to execute  a direct debit. In some cases, this date might be out of the start-/end-date  range supplied (reasons might be holidays etc.). In case of REJECT this field  will always be set as \"0000-00-00\". */
    @Json(name = "recommendation_date")
    var recommendationDate: LocalDate? = null,
    /* Object type, in this case a  xs2a_direct_debit_check */
    @Json(name = "object")
    var `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: LocalDateTime
)

