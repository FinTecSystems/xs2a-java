
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param limitTurnoverDays If needed limit the fetched turnovers to create a fact_sheet_lists. Default 365. Valid Range: 10 - 365
 * @param fields 
 */

data class Xs2aFactSheetLists (
    /* If needed limit the fetched turnovers to create a fact_sheet_lists. Default 365. Valid Range: 10 - 365 */
    @Json(name = "limit_turnover_days")
    @JvmField
    val limitTurnoverDays: Int? = null,
    @Json(name = "fields")
    @JvmField
    val fields: List<Xs2aFactSheetListsFields>
)

