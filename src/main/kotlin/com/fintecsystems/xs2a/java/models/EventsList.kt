
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
    @JvmField
    val total: Int,
    /* Number of objects per page */
    @Json(name = "per_page")
    @JvmField
    val perPage: Int,
    /* Current page. */
    @Json(name = "current_page")
    @JvmField
    val currentPage: Int,
    /* Last page, usually the total of available pages. */
    @Json(name = "last_page")
    @JvmField
    val lastPage: Int,
    /* URI to next page. */
    @Json(name = "next_page_url")
    @JvmField
    val nextPageUrl: String? = null,
    /* URI to previous page. */
    @Json(name = "prev_page_url")
    @JvmField
    val prevPageUrl: String? = null,
    /* Showing results from index element. */
    @Json(name = "from")
    @JvmField
    val from: Int? = null,
    /* Showing results to index element. */
    @Json(name = "to")
    @JvmField
    val to: Int? = null,
    @Json(name = "data")
    @JvmField
    val data: List<EventObject>
)

