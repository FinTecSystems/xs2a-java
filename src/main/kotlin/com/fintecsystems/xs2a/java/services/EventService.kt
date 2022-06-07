package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.helper.OffsetDateTimeAdapter
import com.fintecsystems.xs2a.java.models.common.PaginatedList
import com.fintecsystems.xs2a.java.models.events.EventObject
import java.time.OffsetDateTime

class EventService (
    apiKey: String
) : ServiceBase(apiKey) {
    /**
     * Get all events for a xs2a transaction object
     *
     * @param transaction_id transaction id for which all events are to be retrieved for. (optional)
     * @param type The type of event e.g. transaction.created or transaction.updated etc. (optional)
     * @param per_page Items per page (optional)
     * @param page Which page to display (optional)
     * @param from Filter by date.
     * @param to Filter by date.
     * @return EventsList
     */
    fun list(
        transaction_id: String? = null,
        type: String? = null,
        per_page: Int = 15,
        page: Int = 1,
        from: OffsetDateTime? = null,
        to: OffsetDateTime? = null,
    ): PaginatedList<EventObject> {
        val response = apiService.get(
            "events",
            mutableMapOf(
                "transaction_id" to transaction_id,
                "type" to type,
                "per_page" to per_page.toString(),
                "page" to page.toString(),
                "from" to from?.let { OffsetDateTimeAdapter.toJson(it) },
                "to" to to?.let { OffsetDateTimeAdapter.toJson(it) },
            )
        )

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a specific event by id
     * @param eventId event Id to get
     * @return EventObject
     */
    fun get(eventId: String): EventObject {
        val response = apiService.get("events/$eventId")

        return JsonSerializer.parseJson(response)
    }
}