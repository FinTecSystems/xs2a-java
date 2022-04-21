package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param confirmed Verify legal age of account holder
 * @param createdAt Creation date of the object
 * @param `object` Object type, in this case a xs2a_age_verification_check
 */

data class Xs2aAgeVerificationCheckResponse(
    @Json(name = "confirmed")
    var confirmed: Boolean,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime,
    @Json(name = "object")
    var `object`: String
)

