package com.fintecsystems.xs2a.java.models.risk

import com.squareup.moshi.Json

data class Xs2aIncomeCheck(
    @Json(name = "limit_turnover_days")
    var limitTurnoverDays: Int
)
