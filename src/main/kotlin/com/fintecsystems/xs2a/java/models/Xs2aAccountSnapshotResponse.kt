package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDate
import java.time.LocalDateTime

/**
 *
 * @param `object` Object type, in this case a xs2a_account_snapshot
 * @param days Range in days that were used
 * @param from The start date in the format yyyy-mm-dd
 * @param to The end date in the format yyyy-mm-dd
 * @param filters Filter account statements
 * @param allTags 1, if the turnovers were fully categorized, 0 otherwise
 * @param createdAt Creation date of the object
 */

data class Xs2aAccountSnapshotResponse(
    /* Object type, in this case a xs2a_account_snapshot */
    @Json(name = "object")
    val `object`: String,
    /* Range in days that were used */
    @Json(name = "days")
    val days: Int? = null,
    /* The start date in the format yyyy-mm-dd */
    @Json(name = "from")
    val from: LocalDate? = null,
    /* The end date in the format yyyy-mm-dd */
    @Json(name = "to")
    val to: LocalDate? = null,
    /* Filter account statements */
    @Json(name = "filters")
    val filters: List<String>? = null,
    /* 1, if the turnovers were fully categorized, 0 otherwise */
    @Json(name = "all_tags")
    val allTags: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    val createdAt: LocalDateTime
)

