
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
    @JvmField
    val name: String,
    @Json(name = "tags")
    @JvmField
    val tags: List<String>,
    @Json(name = "categories")
    @JvmField
    val categories: List<String>,
    @Json(name = "min_amount")
    @JvmField
    val minAmount: Float? = null,
    @Json(name = "max_amount")
    @JvmField
    val maxAmount: Float? = null,
)

