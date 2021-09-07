package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDate

/**
 *
 * @param senderAccount
 * @param recipientAccount
 * @param amount Amount to transfer
 * @param currency Currency id of amount, e.g. EUR
 * @param purpose Purpose of the transfer
 * @param frequency Frequency of standing order, d = daily, w = weekly, m = monthly, y = yearly
 * @param frequencyInterval Frequency interval, in case of frequency daily or weekly  the range is 1-7 (1 = Monday, 7 = Sunday). In case of monthly  or yearly it is 1-31. 0 in case for a non standardized format.
 * @param day Day of the execution, 1-31. 31 is used in case of execute on the last day of the month.
 * @param startExecution Date of the first or next execution of the standing order, format YYYY-mm-dd.
 * @param endExecution Date of the last execution of the standing order, format YYYY-mm-dd.
 */

data class Xs2aStandingOrdersCheckResponseStandingOrders(
    @Json(name = "sender_account")
    @JvmField
    val senderAccount: BankAccountObject,
    @Json(name = "recipient_account")
    @JvmField
    val recipientAccount: BankAccountObject,
    /* Amount to transfer */
    @Json(name = "amount")
    @JvmField
    val amount: Float,
    /* Currency id of amount, e.g. EUR */
    @Json(name = "currency")
    @JvmField
    val currency: CurrencyId? = null,
    /* Purpose of the transfer */
    @Json(name = "purpose")
    @JvmField
    val purpose: String,
    /* Frequency of standing order, d = daily, w = weekly, m = monthly, y = yearly */
    @Json(name = "frequency")
    @JvmField
    val frequency: String,
    /* Frequency interval, in case of frequency daily or weekly  the range is 1-7 (1 = Monday, 7 = Sunday). In case of monthly  or yearly it is 1-31. 0 in case for a non standardized format. */
    @Json(name = "frequency_interval")
    @JvmField
    val frequencyInterval: Int,
    /* Day of the execution, 1-31. 31 is used in case of execute on the last day of the month. */
    @Json(name = "day")
    @JvmField
    val day: Int,
    /* Date of the first or next execution of the standing order, format YYYY-mm-dd. */
    @Json(name = "start_execution")
    @JvmField
    val startExecution: LocalDate? = null,
    /* Date of the last execution of the standing order, format YYYY-mm-dd. */
    @Json(name = "end_execution")
    @JvmField
    val endExecution: LocalDate? = null,
)

