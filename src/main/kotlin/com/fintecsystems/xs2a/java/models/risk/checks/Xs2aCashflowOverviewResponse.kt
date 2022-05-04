package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param createdAt Creation date of the object
 * @param cashflow
 */

data class Xs2aCashflowOverviewResponse(
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime,
    @Json(name = "cashflow")
    var cashflow: List<Xs2aCashflowObject>
)

