package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param name
 * @param monthsWithSalariesCount
 * @param bookingDateFirstSalary
 * @param bookingDateLastSalary
 * @param monthsSumsMedian
 * @param monthsSumsMinimum
 * @param publicEmployer
 * @param currentEmployer
 */

data class Employer(
    @Json(name = "name")
    val name: String,
    @Json(name = "months_with_salaries_count")
    val monthsWithSalariesCount: Int,
    @Json(name = "booking_date_first_salary")
    val bookingDateFirstSalary: LocalDateTime,
    @Json(name = "booking_date_last_salary")
    val bookingDateLastSalary: LocalDateTime,
    @Json(name = "months_sums_median")
    val monthsSumsMedian: Float,
    @Json(name = "months_sums_minimum")
    val monthsSumsMinimum: Float,
    @Json(name = "public_employer")
    val publicEmployer: Boolean,
    @Json(name = "current_employer")
    val currentEmployer: Boolean
)

