
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param transaction Internal XS2A transaction id. This id will be the same for the whole transaction.
 * @param amount The amount of a given payout or refund.
 * @param type The type is payout or refund.
 */

data class RefundPayoutTransactions (
    /* Internal XS2A transaction id. This id will be the same for the whole transaction. */
    @Json(name = "transaction")
    var transaction: String,
    /* The amount of a given payout or refund. */
    @Json(name = "amount")
    var amount: Float,
    /* The type is payout or refund. */
    @Json(name = "type")
    var type: Type
) {

    /**
     * The type is payout or refund.
     * Values: refund,payout
     */
    enum class Type(var value: String) {
        @Json(name = "refund") REFUND("refund"),
        @Json(name = "payout") PAYOUT("payout");

        override fun toString() = value
    }
}

