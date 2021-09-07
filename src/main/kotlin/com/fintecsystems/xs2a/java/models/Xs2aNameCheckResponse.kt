package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

data class Xs2aNameCheckResponse (
    /* Name used for the comparison. Usually the surname. */
    @Json(name = "name")
    @JvmField
    val name: String,
    /* Firstname used for the comparison. */
    @Json(name = "firstname")
    @JvmField
    val firstname: String,
    /* Indicates if it's a match ("1") or not ("0") */
    @Json(name = "match")
    @JvmField
    val match: String,
    /* Indicates the similarity with the provided and actual name. */
    @Json(name = "similarity")
    @JvmField
    val similarity: Int,
    @Json(name = "created_at")
    @JvmField
    val created_at: String,
    /* The name of this object */
    @Json(name = "object")
    @JvmField
    val `object`: String,
)