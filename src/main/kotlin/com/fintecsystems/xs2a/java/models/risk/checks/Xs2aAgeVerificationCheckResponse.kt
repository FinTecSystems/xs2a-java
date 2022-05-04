package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param confirmed Verify legal age of account holder
 * @param createdAt Creation date of the object
 */

data class Xs2aAgeVerificationCheckResponse(
    @Json(name = "confirmed")
    var confirmed: Boolean,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime,
)

