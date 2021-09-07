package com.fintecsystems.xs2a.java.models

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
    val id: String,
    /* The transaction ID this object belongs to. May be null for some events. */
    @Json(name = "transaction")
    val transaction: String,
    /* The type of event. transaction.created or transaction.updated */
    @Json(name = "type")
    val type: String,
    /* The object, that this event relates to. This is usually a transaction object. */
    @Json(name = "data")
    val data: Any,
    /* Indicates whether or not this event belongs to a test transaction */
    @Json(name = "testmode")
    val testmode: Boolean,
    /* A human readable message that describes this event. */
    @Json(name = "message")
    val message: String,
    /* The date the event was fired. */
    @Json(name = "created_at")
    val createdAt: LocalDateTime,
    /* xs2a_event for event objects. */
    @Json(name = "object")
    val `object`: String
)

enum class ReportFormat(val value: String) {
    @Json(name = "html")
    HTML("html"),

    @Json(name = "pdf")
    PDF("pdf"),

    @Json(name = "json")
    JSON("json");
}

enum class ReportLocale(val value: String) {
    @Json(name = "en")
    EN("en"),

    @Json(name = "de")
    DE("de");
}

