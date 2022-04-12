package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

/**
 * Model for a single result entry of an FactSheetLists-Check.
 *
 * @param fields
 * @param turnoversCount
 * @param sumAmounts
 * @param timespan
 * @param distinctCounterHolders
 * @param turnovers
 */
data class Xs2aFactSheetListsResponseResult(
    @Json(name = "fields")
    var fields: Xs2aFactSheetListsResponseFields,
    @Json(name = "turnovers_count")
    var turnoversCount: Int,
    @Json(name = "sum_amounts")
    var sumAmounts: Float,
    @Json(name = "timespan")
    var timespan: Int,
    @Json(name = "distinct_counter_holders")
    var distinctCounterHolders: Int,
    @Json(name = "turnovers")
    var turnovers: Int,
)
