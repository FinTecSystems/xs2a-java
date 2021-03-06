
package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

/**
 * 
 * @param limitTurnoverDays If needed limit the fetched turnovers to create a fact_sheet_lists. Default 365. Valid Range: 10 - 365
 * @param fields 
 */

data class Xs2aFactSheetLists (
    @Json(name = "limit_turnover_days")
    var limitTurnoverDays: Int? = null,
    @Json(name = "fields")
    var fields: List<Xs2aFactSheetListsFields>
)

