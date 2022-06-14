package com.fintecsystems.xs2a.java.models.api.users

import com.fintecsystems.xs2a.java.models.common.PaginatedList
import com.squareup.moshi.Json

class AccessTokenList(
    @Json(name = "total")
    total: Int,
    @Json(name = "per_page")
    perPage: Int,
    @Json(name = "current_page")
    currentPage: Int,
    @Json(name = "last_page")
    lastPage: Int,
    @Json(name = "from")
    from: Int,
    @Json(name = "to")
    to: Int,
    @Json(name = "data")
    data: List<AccessToken>
): PaginatedList<AccessToken>(total, perPage, currentPage, lastPage, from, to, data)