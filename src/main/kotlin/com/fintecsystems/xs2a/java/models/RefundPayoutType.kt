package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * The type is payout or refund.
 * Values: refund,payout
 */
enum class RefundPayoutType(var value: String) {
    @Json(name = "refund")
    REFUND("refund"),
    @Json(name = "payout")
    PAYOUT("payout");

    override fun toString() = value
}