package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

@Suppress("unused")
enum class Xs2aStandingOrdersCheckResponseStandingOrdersFrequency {
    @Json(name = "d")
    DAILY,

    @Json(name = "w")
    WEEKLY,

    @Json(name = "m")
    MONTHLY,

    @Json(name = "y")
    YEARLY;
}

