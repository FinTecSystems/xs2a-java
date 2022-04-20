package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

@Suppress("unused")
enum class Xs2aDirectDebitCheckRecommendation {
    @Json(name = "DATE")
    DATE,
    @Json(name = "ANY")
    ANY,
    @Json(name = "REJECT")
    REJECT
}
