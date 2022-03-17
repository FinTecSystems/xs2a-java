
package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.Category
import com.fintecsystems.xs2a.java.models.Tag
import com.squareup.moshi.Json

/**
 * 
 * @param name 
 * @param tags 
 * @param categories 
 * @param minAmount 
 * @param maxAmount 
 */

data class Xs2aFactSheetListsResponseFields (
    @Json(name = "name")
    var name: String,
    @Json(name = "tags")
    var tags: List<Tag>,
    @Json(name = "categories")
    var categories: List<Category>,
    @Json(name = "min_amount")
    var minAmount: Float? = null,
    @Json(name = "max_amount")
    var maxAmount: Float? = null,
)

