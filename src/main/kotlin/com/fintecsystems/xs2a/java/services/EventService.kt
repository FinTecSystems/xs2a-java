package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.events.EventObject
import com.fintecsystems.xs2a.java.models.events.EventsList
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class EventService (
    private val apiKey: String
) {
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
        from: LocalDateTime? = null,
        to: LocalDateTime? = null,
    ): EventsList {
        val response = ApiService(apiKey).get(
            "events",
            mutableMapOf(
                "transaction_id" to transaction_id,
                "type" to type,
                "per_page" to per_page.toString(),
                "page" to page.toString(),
                "from" to from?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                "to" to to?.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME),
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
        val response = ApiService(apiKey).get("events/$eventId")

        return JsonSerializer.parseJson(response)
    }
}