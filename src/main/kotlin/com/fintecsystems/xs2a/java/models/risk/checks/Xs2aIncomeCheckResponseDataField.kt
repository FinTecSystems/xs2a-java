package com.fintecsystems.xs2a.java.models.risk.checks

import com.fintecsystems.xs2a.java.models.risk.Employer
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param monthlySums
 * @param monthsSumsMedian
 * @param monthsSumsMinimum
 * @param minDate
 * @param maxDate
 * @param currentPayment
 * @param forecast
 * @param forecastMonthCount
 * @param currentEmployers
 * @param employer
 */

data class Xs2aIncomeCheckResponseDataField(
    @Json(name = "monthly_sums")
    var monthlySums: Map<String, Float>,
    @Json(name = "months_sums_median")
    var monthsSumsMedian: Float,
    @Json(name = "months_sums_minimum")
    var monthsSumsMinimum: Float,
    @Json(name = "min_date")
    var minDate: OffsetDateTime,
    @Json(name = "max_date")
    var maxDate: OffsetDateTime,
    @Json(name = "current_payment")
    var currentPayment: Boolean,
    @Json(name = "forecast")
    var forecast: Float,
    @Json(name = "forecast_month_count")
    var forecastMonthCount: Int,
    @Json(name = "current_employers")
    var currentEmployers: Int,
    @Json(name = "employer")
    var employer: Employer
)

