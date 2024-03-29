package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param bookingDays Count of booking days in the date range found
 * @param overdraftLimitDays Count of days the account used the overdraft limit
 * @param maximumOverdraftUsed Maximum amount the overdraft was used in that date range
 * @param averageOverdraftUsed Average amount the overdraft was used in that date range
 * @param medianOverdraftUsed Median amount the overdraft was used in that date range
 * @param currencyId Currency id of above values
 * @param createdAt Creation date of the object
 */

data class Xs2aOverdraftLimitCheckResponse(
    @Json(name = "booking_days")
    var bookingDays: Int,
    @Json(name = "overdraft_limit_days")
    var overdraftLimitDays: Int,
    @Json(name = "maximum_overdraft_used")
    var maximumOverdraftUsed: Float,
    @Json(name = "average_overdraft_used")
    var averageOverdraftUsed: Float,
    @Json(name = "median_overdraft_used")
    var medianOverdraftUsed: Float,
    @Json(name = "currency_id")
    var currencyId: CurrencyId,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

