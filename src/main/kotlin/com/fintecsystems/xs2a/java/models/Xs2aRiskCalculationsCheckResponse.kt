package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param calculations
 * @param createdAt Creation date of the object
 * @param `object` Object type, in this case a  xs2a_risk_calculations_check
 */

data class Xs2aRiskCalculationsCheckResponse(
    @Json(name = "calculations")
    val calculations: List<RiskCalculationsResponse>,
    /* Creation date of the object */
    @Json(name = "created_at")
    val createdAt: LocalDateTime,
    /* Object type, in this case a  xs2a_risk_calculations_check */
    @Json(name = "object")
    val `object`: String
)

