package com.fintecsystems.xs2a.java.models.risk.checks

import com.fintecsystems.xs2a.java.helper.OffsetDate
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.fintecsystems.xs2a.java.models.risk.BankAccountObject
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param senderAccount
 * @param recipientAccount
 * @param amount Amount to transfer
 * @param currency Currency id of amount
 * @param purpose Purpose of the transfer
 * @param frequency Frequency of standing order, d = daily, w = weekly, m = monthly, y = yearly
 * @param frequencyInterval Frequency interval, in case of frequency daily or weekly  the range is 1-7 (1 = Monday, 7 = Sunday). In case of monthly  or yearly it is 1-31. 0 in case for a non standardized format.
 * @param day Day of the execution, 1-31. 31 is used in case of execute on the last day of the month.
 * @param startExecution Date of the first or next execution of the standing order, format YYYY-mm-dd.
 * @param endExecution Date of the last execution of the standing order, format YYYY-mm-dd.
 */

data class Xs2aStandingOrdersCheckResponseStandingOrders(
    @Json(name = "sender_account")
    var senderAccount: BankAccountObject,
    @Json(name = "recipient_account")
    var recipientAccount: BankAccountObject,
    @Json(name = "amount")
    var amount: Float,
    @Json(name = "currency")
    var currency: CurrencyId,
    @Json(name = "purpose")
    var purpose: String,
    @Json(name = "frequency")
    var frequency: Xs2aStandingOrdersCheckResponseStandingOrdersFrequency,
    @Json(name = "frequency_interval")
    var frequencyInterval: Int,
    @Json(name = "day")
    var day: Int,
    @Json(name = "start_execution")
    @OffsetDate
    var startExecution: OffsetDateTime? = null,
    @Json(name = "end_execution")
    @OffsetDate
    var endExecution: OffsetDateTime? = null,
)

