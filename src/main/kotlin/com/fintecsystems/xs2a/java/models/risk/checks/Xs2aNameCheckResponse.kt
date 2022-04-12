package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

data class Xs2aNameCheckResponse (
    /* Name used for the comparison. Usually the surname. */
    @Json(name = "name")
    var name: String,
    /* Firstname used for the comparison. */
    @Json(name = "firstname")
    var firstname: String,
    /* Indicates if it's a match ("1") or not ("0") */
    @Json(name = "match")
    var match: Boolean,
    /* Indicates the similarity with the provided and actual name. */
    @Json(name = "similarity")
    var similarity: Int,
    @Json(name = "created_at")
    var created_at: String,
    /* The name of this object */
    @Json(name = "object")
    var `object`: String,
)