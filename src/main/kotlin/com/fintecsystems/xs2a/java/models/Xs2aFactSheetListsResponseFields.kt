
package com.fintecsystems.xs2a.java.models


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
    val name: String,
    @Json(name = "tags")
    val tags: List<String>,
    @Json(name = "categories")
    val categories: List<String>,
    @Json(name = "min_amount")
    val minAmount: Float? = null,
    @Json(name = "max_amount")
    val maxAmount: Float? = null,
)

