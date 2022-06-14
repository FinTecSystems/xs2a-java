package com.fintecsystems.xs2a.java.models.api.connections

import com.fintecsystems.xs2a.java.models.common.PaginatedList
import com.squareup.moshi.Json

class BankConnectionList(
    @Json(name = "total")
    total: Int,
    @Json(name = "per_page")
    perPage: Int,
    @Json(name = "current_page")
    currentPage: Int,
    @Json(name = "last_page")
    lastPage: Int,
    @Json(name = "from")
    from: Int? = null,
    @Json(name = "to")
    to: Int? = null,
    @Json(name = "data")
    data: List<BankConnection>
): PaginatedList<BankConnection>(total, perPage, currentPage, lastPage, from, to, data)