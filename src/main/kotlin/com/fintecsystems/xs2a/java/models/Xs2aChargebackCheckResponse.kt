package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param chargebacksCount Total count of detected chargeback transactions
 * @param chargebacksCoverage Count of chargebacks which was triggered due insufficient funds
 * @param chargebacksRevoked Count of chargebacks which was triggered manually
 * @param chargebacksSumAmount Sum over the amount of all chargebacks
 * @param currencyId Currency id of above values, e.g. EUR
 * @param `object` Object type, in this case a  xs2a_chargeback_check
 * @param createdAt Creation date of the object
 */

data class Xs2aChargebackCheckResponse(
    /* Total count of detected chargeback transactions */
    @Json(name = "chargebacks_count")
    val chargebacksCount: Int,
    /* Count of chargebacks which was triggered due insufficient funds */
    @Json(name = "chargebacks_coverage")
    val chargebacksCoverage: Int,
    /* Count of chargebacks which was triggered manually */
    @Json(name = "chargebacks_revoked")
    val chargebacksRevoked: Int,
    /* Sum over the amount of all chargebacks */
    @Json(name = "chargebacks_sum_amount")
    val chargebacksSumAmount: Float,
    /* Currency id of above values, e.g. EUR */
    @Json(name = "currency_id")
    val currencyId: CurrencyId? = null,
    /* Object type, in this case a  xs2a_chargeback_check */
    @Json(name = "object")
    val `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    val createdAt: LocalDateTime
)

