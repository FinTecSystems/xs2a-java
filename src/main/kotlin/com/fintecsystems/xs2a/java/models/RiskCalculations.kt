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
    @JvmField
    val tags: List<String>,
    @Json(name = "categories")
    @JvmField
    val categories: List<String>,
    @Json(name = "functions")
    @JvmField
    val functions: List<String>,
    /* A name for this calculation */
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
    val from: LocalDate? = null,
    /* Ending date */
    @Json(name = "to")
    @JvmField
    val to: LocalDate? = null,
    /* Full months */
    @Json(name = "full_months")
    @JvmField
    val fullMonths: String? = null,
    /* Children categories */
    @Json(name = "children_categories")
    @JvmField
    val childrenCategories: Boolean? = null,
    /* Match tags with categories */
    @Json(name = "match_tags_with_categories")
    @JvmField
    val matchTagsWithCategories: Boolean? = null,
)

