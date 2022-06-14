package com.fintecsystems.xs2a.java.models.api.connections

import com.fintecsystems.xs2a.java.models.common.PaginatedList

class BankConnectionList(
    total: Int, perPage: Int, currentPage: Int, lastPage: Int, from: Int, to: Int, data: List<BankConnection>
): PaginatedList<BankConnection>(total, perPage, currentPage, lastPage, from, to, data)