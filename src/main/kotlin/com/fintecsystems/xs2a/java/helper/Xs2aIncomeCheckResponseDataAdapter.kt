package com.fintecsystems.xs2a.java.helper

import com.fintecsystems.xs2a.java.models.risk.checks.Xs2aIncomeCheckResponseData
import com.fintecsystems.xs2a.java.models.risk.checks.Xs2aIncomeCheckResponseDataField
import com.squareup.moshi.FromJson

@Suppress("unused")
object Xs2aIncomeCheckResponseDataAdapter {
    private const val fullMonthsCountKey = "full_months_count"

    @FromJson
    fun fromJson(data: Map<String, Any>): Xs2aIncomeCheckResponseData {
        @Suppress("UNCHECKED_CAST")
        return Xs2aIncomeCheckResponseData(
            fullMonthsCount = (data[fullMonthsCountKey] as Double).toInt(),
            results = data.filterKeys { it != fullMonthsCountKey } as Map<String, Xs2aIncomeCheckResponseDataField>
        )
    }
}

