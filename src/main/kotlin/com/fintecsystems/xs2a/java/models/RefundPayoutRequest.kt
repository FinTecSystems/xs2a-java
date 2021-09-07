
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param painType The format of pain file.
 * @param transactions 
 * @param batchBooking 
 */

data class RefundPayoutRequest (
    /* The format of pain file. */
    @Json(name = "pain_type")
    val painType: RefundPayoutRequest.PainType,
    @Json(name = "transactions")
    val transactions: List<RefundPayoutTransactions>,
    @Json(name = "batch_booking")
    val batchBooking: Boolean? = null,
) {

    /**
     * The format of pain file.
     * Values: painPeriod001Period001Period03
     */
    enum class PainType(val value: String) {
        @Json(name = "pain.001.001.03") PAIN001001003("pain.001.001.03");
    }
}

