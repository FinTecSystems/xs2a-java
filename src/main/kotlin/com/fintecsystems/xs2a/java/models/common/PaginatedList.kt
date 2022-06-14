package com.fintecsystems.xs2a.java.models.common

import com.squareup.moshi.Json

/**
 *
 * @param total Total number of results.
 * @param perPage Number of objects per page
 * @param currentPage Current page.
 * @param lastPage Last page, usually the total of available pages.
 * @param from Showing results from index element.
 * @param to Showing results to index element.
 * @param data
 */

abstract class PaginatedList<T>(
    @Json(name = "total")
    var total: Int,
    @Json(name = "per_page")
    var perPage: Int,
    @Json(name = "current_page")
    var currentPage: Int,
    @Json(name = "last_page")
    var lastPage: Int,
    @Json(name = "from")
    var from: Int,
    @Json(name = "to")
    var to: Int,
    @Json(name = "data")
    var data: List<T>
)
