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
    @JvmField
    val tags: List<String>,
    @Json(name = "categories")
    @JvmField
    val categories: List<String>,
    @Json(name = "functions")
    @JvmField
    val functions: List<String>,
    /* A name for this calculation. */
    @Json(name = "name")
    @JvmField
    val name: String,
    /* Days */
    @Json(name = "days")
    @JvmField
    val days: Int? = null,
    /* Starting date */
    @Json(name = "from")
    @JvmField
    val from: LocalDateTime? = null,
    /* Ending date */
    @Json(name = "to")
    @JvmField
    val to: LocalDateTime? = null,
    /* Full months */
    @Json(name = "full_months")
    @JvmField
    val fullMonths: String? = null,
    @Json(name = "results")
    @JvmField
    val results: RiskCalculationsResponseResults
)

