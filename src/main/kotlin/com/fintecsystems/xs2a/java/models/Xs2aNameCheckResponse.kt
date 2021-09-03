package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

data class Xs2aNameCheckResponse (
    /* Name used for the comparison. Usually the surname. */
    @Json(name = "name")
    val name: String,
    /* Firstname used for the comparison. */
    @Json(name = "firstname")
    val firstname: String,
    /* Indicates if it's a match ("1") or not ("0") */
    @Json(name = "match")
    val match: String,
    /* Indicates the similarity with the provided and actual name. */
    @Json(name = "similarity")
    val similarity: Int,
    @Json(name = "created_at")
    val created_at: String,
    /* The name of this object */
    @Json(name = "object")
    val `object`: String,
)