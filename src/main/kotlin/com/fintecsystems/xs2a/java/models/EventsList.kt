
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param total Total number of results.
 * @param perPage Number of objects per page
 * @param currentPage Current page.
 * @param lastPage Last page, usually the total of available pages.
 * @param nextPageUrl URI to next page.
 * @param prevPageUrl URI to previous page.
 * @param from Showing results from index element.
 * @param to Showing results to index element.
 * @param data 
 */

data class EventsList (
    /* Total number of results. */
    @Json(name = "total")
    val total: Int,
    /* Number of objects per page */
    @Json(name = "per_page")
    val perPage: Int,
    /* Current page. */
    @Json(name = "current_page")
    val currentPage: Int,
    /* Last page, usually the total of available pages. */
    @Json(name = "last_page")
    val lastPage: Int,
    /* URI to next page. */
    @Json(name = "next_page_url")
    val nextPageUrl: String? = null,
    /* URI to previous page. */
    @Json(name = "prev_page_url")
    val prevPageUrl: String? = null,
    /* Showing results from index element. */
    @Json(name = "from")
    val from: Int? = null,
    /* Showing results to index element. */
    @Json(name = "to")
    val to: Int? = null,
    @Json(name = "data")
    val data: List<EventObject>
)

