package com.fintecsystems.xs2a.java.models.risk.checks

import com.fintecsystems.xs2a.java.models.common.Tag
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param checks Indicates which checks were performed
 * @param checkDays Range in days that were used to calculated and gather the desired information
 * @param results
 * @param createdAt Creation date of the object
 */

data class Xs2aCreditCheckResponse(
    /* Indicates which checks were performed */
    @Json(name = "checks")
    var checks: List<Tag>,
    /* Range in days that were used to calculated and gather the desired information */
    @Json(name = "check_days")
    var checkDays: Int,
    @Json(name = "results")
    var results: Map<Tag, Xs2aCreditCheckResponseResult>,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

