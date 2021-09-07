
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param messageId The message id to get the pain file.
 */

data class RefundPayoutResponse (
    /* The message id to get the pain file. */
    @Json(name = "message_id")
    val messageId: String
)

