package com.fintecsystems.xs2a.java.models.api.accounts

import com.fintecsystems.xs2a.java.models.common.PaginatedList

class BankAccountList(
    total: Int, perPage: Int, currentPage: Int, lastPage: Int, from: Int, to: Int, data: List<BankAccount>
): PaginatedList<BankAccount>(total, perPage, currentPage, lastPage, from, to, data)