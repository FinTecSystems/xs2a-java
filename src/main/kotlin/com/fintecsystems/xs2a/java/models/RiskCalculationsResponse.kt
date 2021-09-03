package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param tags
 * @param categories
 * @param functions
 * @param name A name for this calculation.
 * @param days Days
 * @param from Starting date
 * @param to Ending date
 * @param fullMonths Full months
 * @param results
 */

data class RiskCalculationsResponse(
    @Json(name = "tags")
    val tags: List<String>,
    @Json(name = "categories")
    val categories: List<String>,
    @Json(name = "functions")
    val functions: List<String>,
    /* A name for this calculation. */
    @Json(name = "name")
    val name: String,
    /* Days */
    @Json(name = "days")
    val days: Int? = null,
    /* Starting date */
    @Json(name = "from")
    val from: LocalDateTime? = null,
    /* Ending date */
    @Json(name = "to")
    val to: LocalDateTime? = null,
    /* Full months */
    @Json(name = "full_months")
    val fullMonths: String? = null,
    @Json(name = "results")
    val results: RiskCalculationsResponseResults
)

