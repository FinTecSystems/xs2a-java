
package com.fintecsystems.xs2a.java.models.risk.checks

/**
 * 
 * @param fullMonthsCount
 * @param results
 */

data class Xs2aIncomeCheckResponseData (
    var fullMonthsCount: Int,
    var results: Map<String, Xs2aIncomeCheckResponseDataField>? = null,
)

