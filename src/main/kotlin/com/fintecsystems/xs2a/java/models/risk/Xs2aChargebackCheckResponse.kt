package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.CurrencyId
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
    var chargebacksCount: Int,
    /* Count of chargebacks which was triggered due insufficient funds */
    @Json(name = "chargebacks_coverage")
    var chargebacksCoverage: Int,
    /* Count of chargebacks which was triggered manually */
    @Json(name = "chargebacks_revoked")
    var chargebacksRevoked: Int,
    /* Sum over the amount of all chargebacks */
    @Json(name = "chargebacks_sum_amount")
    var chargebacksSumAmount: Float,
    /* Currency id of above values, e.g. EUR */
    @Json(name = "currency_id")
    var currencyId: CurrencyId? = null,
    /* Object type, in this case a  xs2a_chargeback_check */
    @Json(name = "object")
    var `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: LocalDateTime
)

