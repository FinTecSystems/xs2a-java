
package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.common.Tag
import com.squareup.moshi.Json

/**
 * 
 * @param tags 
 * @param categories 
 * @param name 
 * @param minAmount 
 * @param maxAmount 
 */

data class Xs2aFactSheetListsFields (
    @Json(name = "tags")
    var tags: List<Tag>,
    @Json(name = "categories")
    var categories: List<Category>,
    @Json(name = "name")
    var name: String,
    @Json(name = "min_amount")
    var minAmount: Float? = null,
    @Json(name = "max_amount")
    var maxAmount: Float? = null,
)

