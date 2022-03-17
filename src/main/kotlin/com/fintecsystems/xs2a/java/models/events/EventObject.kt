package com.fintecsystems.xs2a.java.models.events

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param id Transaction id
 * @param transaction The transaction ID this object belongs to. May be null for some events.
 * @param type The type of event. transaction.created or transaction.updated
 * @param data The object, that this event relates to. This is usually a transaction object.
 * @param testmode Indicates whether or not this event belongs to a test transaction
 * @param message A human readable message that describes this event.
 * @param createdAt The date the event was fired.
 * @param `object` xs2a_event for event objects.
 */

data class EventObject(
    /* Transaction id */
    @Json(name = "id")
    var id: String,
    /* The transaction ID this object belongs to. May be null for some events. */
    @Json(name = "transaction")
    var transaction: String,
    /* The type of event. transaction.created or transaction.updated */
    @Json(name = "type")
    var type: String,
    /* The object, that this event relates to. This is usually a transaction object. */
    @Json(name = "data")
    var data: Any,
    /* Indicates whether or not this event belongs to a test transaction */
    @Json(name = "testmode")
    var testmode: Boolean,
    /* A human readable message that describes this event. */
    @Json(name = "message")
    var message: String,
    /* The date the event was fired. */
    @Json(name = "created_at")
    var createdAt: LocalDateTime,
    /* xs2a_event for event objects. */
    @Json(name = "object")
    var `object`: String
)
