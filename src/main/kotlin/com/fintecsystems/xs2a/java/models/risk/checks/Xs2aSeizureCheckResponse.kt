package com.fintecsystems.xs2a.java.models.risk.checks


import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param isSeizure 1 if the customers account is a seizure account, 0 if otherwise
 * @param days The limit of turnover days for this check
 * @param `object` Object type, in this case a  xs2a_seizure_check
 * @param createdAt Creation date of the object
 */

data class Xs2aSeizureCheckResponse(
    /* True if the customers account is a seizure account, False if otherwise */
    @Json(name = "is_seizure")
    var isSeizure: Boolean,
    /* The limit of turnover days for this check */
    @Json(name = "days")
    var days: Int? = null,
    /* Object type, in this case a  xs2a_seizure_check */
    @Json(name = "object")
    var `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

