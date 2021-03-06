package com.fintecsystems.xs2a.java.models.risk.checks

import com.fintecsystems.xs2a.java.models.common.Tag
import com.fintecsystems.xs2a.java.models.risk.Category
import com.squareup.moshi.Json
import java.time.OffsetDateTime

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
    var tags: List<Tag>,
    @Json(name = "categories")
    var categories: List<Category>,
    @Json(name = "functions")
    var functions: List<Xs2aRiskCalculationsCheckFunction>,
    /* A name for this calculation. */
    @Json(name = "name")
    var name: String,
    /* Days */
    @Json(name = "days")
    var days: Int? = null,
    /* Starting date */
    @Json(name = "from")
    var from: OffsetDateTime? = null,
    /* Ending date */
    @Json(name = "to")
    var to: OffsetDateTime? = null,
    /* Full months */
    @Json(name = "full_months")
    var fullMonths: String? = null,
    @Json(name = "results")
    var results: Map<Xs2aRiskCalculationsCheckFunction, Any>
)

