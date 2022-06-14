package com.fintecsystems.xs2a.java.models.events

import com.fintecsystems.xs2a.java.models.common.PaginatedList

class EventObjectList(
    total: Int, perPage: Int, currentPage: Int, lastPage: Int, from: Int, to: Int, data: List<EventObject>
): PaginatedList<EventObject>(total, perPage, currentPage, lastPage, from, to, data)