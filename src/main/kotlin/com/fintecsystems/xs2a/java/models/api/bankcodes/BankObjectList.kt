package com.fintecsystems.xs2a.java.models.api.bankcodes

import com.fintecsystems.xs2a.java.models.common.PaginatedList

class BankObjectList(
    total: Int, perPage: Int, currentPage: Int, lastPage: Int, from: Int, to: Int, data: List<BankObject>
): PaginatedList<BankObject>(total, perPage, currentPage, lastPage, from, to, data)