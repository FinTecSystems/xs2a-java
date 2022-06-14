package com.fintecsystems.xs2a.java.models.pay

import com.fintecsystems.xs2a.java.models.common.PaginatedList
import com.squareup.moshi.Json

class RefundPayoutObjectList(
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
    data: List<RefundPayoutObject>
): PaginatedList<RefundPayoutObject>(total, perPage, currentPage, lastPage, from, to, data)