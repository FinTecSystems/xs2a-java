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
    @JvmField
    val name: String,
    @Json(name = "months_with_salaries_count")
    @JvmField
    val monthsWithSalariesCount: Int,
    @Json(name = "booking_date_first_salary")
    @JvmField
    val bookingDateFirstSalary: LocalDateTime,
    @Json(name = "booking_date_last_salary")
    @JvmField
    val bookingDateLastSalary: LocalDateTime,
    @Json(name = "months_sums_median")
    @JvmField
    val monthsSumsMedian: Float,
    @Json(name = "months_sums_minimum")
    @JvmField
    val monthsSumsMinimum: Float,
    @Json(name = "public_employer")
    @JvmField
    val publicEmployer: Boolean,
    @Json(name = "current_employer")
    @JvmField
    val currentEmployer: Boolean
)

