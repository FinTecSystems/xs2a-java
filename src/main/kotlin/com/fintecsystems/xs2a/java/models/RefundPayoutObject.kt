package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param messageId The message id to get the pain file.
 * @param createdAt
 */

data class RefundPayoutObject(
    /* The message id to get the pain file. */
    @Json(name = "message_id")
    @JvmField
    val messageId: String,
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime
)

