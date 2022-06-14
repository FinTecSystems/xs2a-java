package com.fintecsystems.xs2a.java.models.risk

import com.fintecsystems.xs2a.java.models.common.PaginatedList

class RiskObjectList(
    total: Int, perPage: Int, currentPage: Int, lastPage: Int, from: Int, to: Int, data: List<RiskObject>
): PaginatedList<RiskObject>(total, perPage, currentPage, lastPage, from, to, data)