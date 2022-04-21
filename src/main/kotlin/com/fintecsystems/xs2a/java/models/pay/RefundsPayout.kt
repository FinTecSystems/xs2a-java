package com.fintecsystems.xs2a.java.models.pay


import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param transaction Internal XS2A transaction id. This id will be the same for the whole transaction.
 * @param amountIssued Sum payout or refund issued.
 * @param type The type is payout or refund.
 * @param testmode '1', if this bank is a testbank
 * @param createdAt
 */

data class RefundsPayout(
    /* Internal XS2A transaction id. This id will be the same for the whole transaction. */
    @Json(name = "transaction")
    var transaction: String,
    /* Sum payout or refund issued. */
    @Json(name = "amount_issued")
    var amountIssued: Float,
    /* The type is payout or refund. */
    @Json(name = "type")
    var type: RefundPayoutType,
    /* '1', if this bank is a testbank */
    @Json(name = "testmode")
    var testmode: Boolean,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)
