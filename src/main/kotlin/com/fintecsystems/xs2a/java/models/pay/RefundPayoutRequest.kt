
package com.fintecsystems.xs2a.java.models.pay

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
    var painType: PainType,
    @Json(name = "transactions")
    var transactions: List<RefundPayoutTransactions>,
    @Json(name = "batch_booking")
    var batchBooking: Boolean? = null,
)

