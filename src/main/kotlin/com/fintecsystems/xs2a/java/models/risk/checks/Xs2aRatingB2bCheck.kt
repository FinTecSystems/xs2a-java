package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

data class Xs2aRatingB2bCheck (
    @Json(name = "days")
    var days: Int? = null,
)
