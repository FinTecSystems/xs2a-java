
package com.fintecsystems.xs2a.java.models.risk

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

data class RisksTransactionList (
    /* Total number of results. */
    @Json(name = "total")
    var total: Int,
    /* Number of objects per page */
    @Json(name = "per_page")
    var perPage: Int,
    /* Current page. */
    @Json(name = "current_page")
    var currentPage: Int,
    /* Last page, usually the total of available pages. */
    @Json(name = "last_page")
    var lastPage: Int,
    /* Showing results from index element. */
    @Json(name = "from")
    var from: Int,
    /* Showing results to index element. */
    @Json(name = "to")
    var to: Int,
    @Json(name = "data")
    var data: List<RiskObject>
)

