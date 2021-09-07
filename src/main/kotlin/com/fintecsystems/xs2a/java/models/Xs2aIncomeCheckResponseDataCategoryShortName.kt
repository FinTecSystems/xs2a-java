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
    @JvmField
    val monthlySums: Map<String, Float>,
    @Json(name = "months_sums_median")
    @JvmField
    val monthsSumsMedian: Float,
    @Json(name = "months_sums_minimum")
    @JvmField
    val monthsSumsMinimum: Float,
    @Json(name = "min_date")
    @JvmField
    val minDate: LocalDateTime,
    @Json(name = "max_date")
    @JvmField
    val maxDate: LocalDateTime,
    @Json(name = "current_payment")
    @JvmField
    val currentPayment: Float,
    @Json(name = "forecast")
    @JvmField
    val forecast: Float,
    @Json(name = "forecast_month_count")
    @JvmField
    val forecastMonthCount: Int,
    @Json(name = "current_employers")
    @JvmField
    val currentEmployers: Int,
    @Json(name = "employer")
    @JvmField
    val employer: Employer
)

