package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param calculations
 * @param createdAt Creation date of the object
 */

data class Xs2aRiskCalculationsCheckResponse(
    @Json(name = "calculations")
    var calculations: List<RiskCalculationsResponse>,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime,
)

