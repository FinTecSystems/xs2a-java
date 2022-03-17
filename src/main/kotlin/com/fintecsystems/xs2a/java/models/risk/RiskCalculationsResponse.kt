package com.fintecsystems.xs2a.java.models.risk

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
    var tags: List<String>,
    @Json(name = "categories")
    var categories: List<String>,
    @Json(name = "functions")
    var functions: List<String>,
    /* A name for this calculation. */
    @Json(name = "name")
    var name: String,
    /* Days */
    @Json(name = "days")
    var days: Int? = null,
    /* Starting date */
    @Json(name = "from")
    var from: LocalDateTime? = null,
    /* Ending date */
    @Json(name = "to")
    var to: LocalDateTime? = null,
    /* Full months */
    @Json(name = "full_months")
    var fullMonths: String? = null,
    @Json(name = "results")
    var results: Map<String, Any>
)

