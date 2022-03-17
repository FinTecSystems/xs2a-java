
package com.fintecsystems.xs2a.java.models.risk

import com.squareup.moshi.Json

/**
 * 
 * @param fullMonthsCount 
 * @param categoryShortName 
 */

data class Xs2aIncomeCheckResponseData (
    @Json(name = "full_months_count")
    var fullMonthsCount: Int,
    @Json(name = "category_short_name")
    var categoryShortName: Xs2aIncomeCheckResponseDataCategoryShortName? = null,
)

