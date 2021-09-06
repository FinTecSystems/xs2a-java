
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
    val transaction: String,
    /* The amount of a given payout or refund. */
    @Json(name = "amount")
    val amount: Float,
    /* The type is payout or refund. */
    @Json(name = "type")
    val type: Type
) {

    /**
     * The type is payout or refund.
     * Values: refund,payout
     */
    enum class Type(val value: String) {
        @Json(name = "refund") REFUND("refund"),
        @Json(name = "payout") PAYOUT("payout");
    }
}
