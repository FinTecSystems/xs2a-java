package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 * This module allows you to create a lists of filtered transaction data from the reference account. The request can be filtered using the appropriate filters based on a set number of days, categories and/or tags, min. and/or max. amount. As a result, several key characteristics are given per list: transaction total, available days, number of contra accounts, number of transactions. In addition, extensive lists of filtered turnovers, purposes and contra account holders can be downloaded using a specific endpoint.
 * @param fields
 * @param days
 * @param result
 * @param createdAt Creation date of the object
 * @param `object`
 */

data class Xs2aFactSheetListsResponse(
    @Json(name = "fields")
    val fields: List<Xs2aFactSheetListsResponseFields>,
    @Json(name = "days")
    val days: Int? = null,
    @Json(name = "result")
    val result: List<Any>,
    /* Creation date of the object */
    @Json(name = "created_at")
    val createdAt: LocalDateTime,
    @Json(name = "object")
    val `object`: String
)

