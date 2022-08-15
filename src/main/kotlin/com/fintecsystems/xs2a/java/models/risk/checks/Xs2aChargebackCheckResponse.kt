package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param chargebacksCount Total count of detected chargeback transactions
 * @param chargebacksCoverage Count of chargebacks which was triggered due insufficient funds
 * @param chargebacksRevoked Count of chargebacks which was triggered manually
 * @param chargebacksSumAmount Sum over the amount of all chargebacks
 * @param currencyId Currency id of above values
 * @param createdAt Creation date of the object
 */

data class Xs2aChargebackCheckResponse(
    @Json(name = "chargebacks_count")
    var chargebacksCount: Int,
    @Json(name = "chargebacks_coverage")
    var chargebacksCoverage: Int,
    @Json(name = "chargebacks_revoked")
    var chargebacksRevoked: Int,
    @Json(name = "chargebacks_sum_amount")
    var chargebacksSumAmount: Float,
    @Json(name = "currency_id")
    var currencyId: CurrencyId,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

