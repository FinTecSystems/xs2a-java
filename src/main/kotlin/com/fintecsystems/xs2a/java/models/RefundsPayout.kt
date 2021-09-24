package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

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
    var type: Type,
    /* '1', if this bank is a testbank */
    @Json(name = "testmode")
    var testmode: Boolean,
    @Json(name = "created_at")
    var createdAt: LocalDateTime
) {

    /**
     * The type is payout or refund.
     * Values: refund,payout
     */
    enum class Type(var value: String) {
        @Json(name = "refund")
        REFUND("refund"),

        @Json(name = "payout")
        PAYOUT("payout");

        override fun toString() = value
    }
}

