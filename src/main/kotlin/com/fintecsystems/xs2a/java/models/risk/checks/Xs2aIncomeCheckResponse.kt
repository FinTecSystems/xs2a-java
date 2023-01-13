package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param data Resulting data of this Check. May be null if no data is available.
 * @param createdAt Creation date of the object
 */

data class Xs2aIncomeCheckResponse(
    @Json(name = "data")
    var data: Xs2aIncomeCheckResponseData? = null,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

