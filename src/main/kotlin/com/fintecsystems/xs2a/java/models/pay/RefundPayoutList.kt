package com.fintecsystems.xs2a.java.models.pay

import com.fintecsystems.xs2a.java.models.common.PaginatedList

class RefundPayoutObjectList(
    total: Int, perPage: Int, currentPage: Int, lastPage: Int, from: Int, to: Int, data: List<RefundPayoutObject>
): PaginatedList<RefundPayoutObject>(total, perPage, currentPage, lastPage, from, to, data)