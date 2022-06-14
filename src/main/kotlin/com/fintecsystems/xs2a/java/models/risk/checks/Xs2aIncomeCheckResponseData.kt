
package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.FromJson

/**
 * 
 * @param fullMonthsCount
 * @param results
 */

data class Xs2aIncomeCheckResponseData (
    var fullMonthsCount: Int,
    var results: Map<String, Xs2aIncomeCheckResponseDataField>? = null,
) {
    companion object Adapter {
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
}

