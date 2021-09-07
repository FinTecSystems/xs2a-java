
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param fullMonthsCount 
 * @param categoryShortName 
 */

data class Xs2aIncomeCheckResponseData (
    @Json(name = "full_months_count")
    val fullMonthsCount: Int,
    @Json(name = "category_short_name")
    val categoryShortName: Xs2aIncomeCheckResponseDataCategoryShortName? = null,
)

