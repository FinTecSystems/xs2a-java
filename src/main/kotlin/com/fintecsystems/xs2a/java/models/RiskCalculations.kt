package com.fintecsystems.xs2a.java.models


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
    val tags: List<String>,
    @Json(name = "categories")
    val categories: List<String>,
    @Json(name = "functions")
    val functions: List<String>,
    /* A name for this calculation */
    @Json(name = "name")
    val name: String,
    /* Days */
    @Json(name = "days")
    val days: Int? = null,
    /* Starting date */
    @Json(name = "from")
    val from: LocalDate? = null,
    /* Ending date */
    @Json(name = "to")
    val to: LocalDate? = null,
    /* Full months */
    @Json(name = "full_months")
    val fullMonths: String? = null,
    /* Children categories */
    @Json(name = "children_categories")
    val childrenCategories: Boolean? = null,
    /* Match tags with categories */
    @Json(name = "match_tags_with_categories")
    val matchTagsWithCategories: Boolean? = null,
)

