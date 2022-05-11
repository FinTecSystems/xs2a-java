package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.helper.OffsetDate
import com.fintecsystems.xs2a.java.models.common.Tag
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param days Range in days that were used
 * @param from The start date in the format yyyy-mm-dd
 * @param to The end date in the format yyyy-mm-dd
 * @param filters Filter account statements
 * @param allTags 1, if the turnovers were fully categorized, 0 otherwise
 * @param createdAt Creation date of the object
 */

data class Xs2aAccountSnapshotResponse(
    /* Range in days that were used */
    @Json(name = "days")
    var days: Int? = null,
    /* The start date in the format yyyy-mm-dd */
    @Json(name = "from")
    @OffsetDate
    var from: OffsetDateTime? = null,
    /* The end date in the format yyyy-mm-dd */
    @Json(name = "to")
    @OffsetDate
    var to: OffsetDateTime? = null,
    /* Filter account statements */
    @Json(name = "filters")
    var filters: List<Tag>? = null,
    /* 1, if the turnovers were fully categorized, 0 otherwise */
    @Json(name = "all_tags")
    var allTags: Boolean,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

