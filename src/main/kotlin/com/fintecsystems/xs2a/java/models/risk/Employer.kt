package com.fintecsystems.xs2a.java.models.risk


import com.squareup.moshi.Json
import java.time.OffsetDateTime

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
    var name: String,
    @Json(name = "months_with_salaries_count")
    var monthsWithSalariesCount: Int,
    @Json(name = "booking_date_first_salary")
    var bookingDateFirstSalary: OffsetDateTime,
    @Json(name = "booking_date_last_salary")
    var bookingDateLastSalary: OffsetDateTime,
    @Json(name = "months_sums_median")
    var monthsSumsMedian: Float,
    @Json(name = "months_sums_minimum")
    var monthsSumsMinimum: Float,
    @Json(name = "public_employer")
    var publicEmployer: Boolean,
    @Json(name = "current_employer")
    var currentEmployer: Boolean
)

