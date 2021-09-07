package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param data
 * @param createdAt Creation date of the object
 */

data class Xs2aIncomeCheckResponse(
    @Json(name = "data")
    @JvmField
    val data: Xs2aIncomeCheckResponseData,
    /* Creation date of the object */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime
)

