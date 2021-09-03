package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

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

data class Xs2aIncomeCheckResponseDataCategoryShortName(
    @Json(name = "monthly_sums")
    val monthlySums: Map<String, Float>,
    @Json(name = "months_sums_median")
    val monthsSumsMedian: Float,
    @Json(name = "months_sums_minimum")
    val monthsSumsMinimum: Float,
    @Json(name = "min_date")
    val minDate: LocalDateTime,
    @Json(name = "max_date")
    val maxDate: LocalDateTime,
    @Json(name = "current_payment")
    val currentPayment: Float,
    @Json(name = "forecast")
    val forecast: Float,
    @Json(name = "forecast_month_count")
    val forecastMonthCount: Int,
    @Json(name = "current_employers")
    val currentEmployers: Int,
    @Json(name = "employer")
    val employer: Employer
)

