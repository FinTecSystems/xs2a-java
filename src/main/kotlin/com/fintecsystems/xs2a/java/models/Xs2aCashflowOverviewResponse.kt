package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param createdAt Creation date of the object
 * @param `object` Object type, in this case a  xs2a_cashflow_overview
 * @param cashflow
 */

data class Xs2aCashflowOverviewResponse(
    /* Creation date of the object */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime,
    /* Object type, in this case a  xs2a_cashflow_overview */
    @Json(name = "object")
    @JvmField
    val `object`: String,
    @Json(name = "cashflow")
    @JvmField
    val cashflow: List<Xs2aCashflowObject>
)

