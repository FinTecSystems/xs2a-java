package com.fintecsystems.xs2a.java.models.risk


import com.squareup.moshi.Json
import java.time.LocalDate

/**
 *
 * @param tags
 * @param categories
 * @param functions
 * @param name A name for this calculation
 * @param days Days
 * @param from Starting date
 * @param to Ending date
 * @param fullMonths Full months
 * @param childrenCategories Children categories
 * @param matchTagsWithCategories Match tags with categories
 */

data class RiskCalculations(
    @Json(name = "tags")
    var tags: List<String>,
    @Json(name = "categories")
    var categories: List<String>,
    @Json(name = "functions")
    var functions: List<String>,
    /* A name for this calculation */
    @Json(name = "name")
    var name: String,
    /* Days */
    @Json(name = "days")
    var days: Int? = null,
    /* Starting date */
    @Json(name = "from")
    var from: LocalDate? = null,
    /* Ending date */
    @Json(name = "to")
    var to: LocalDate? = null,
    /* Full months */
    @Json(name = "full_months")
    var fullMonths: String? = null,
    /* Children categories */
    @Json(name = "children_categories")
    var childrenCategories: Boolean? = null,
    /* Match tags with categories */
    @Json(name = "match_tags_with_categories")
    var matchTagsWithCategories: Boolean? = null,
)

