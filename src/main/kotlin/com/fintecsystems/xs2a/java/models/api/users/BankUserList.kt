package com.fintecsystems.xs2a.java.models.api.users

import com.fintecsystems.xs2a.java.models.common.PaginatedList

class BankUserList(
    total: Int, perPage: Int, currentPage: Int, lastPage: Int, from: Int, to: Int, data: List<BankUser>
): PaginatedList<BankUser>(total, perPage, currentPage, lastPage, from, to, data)