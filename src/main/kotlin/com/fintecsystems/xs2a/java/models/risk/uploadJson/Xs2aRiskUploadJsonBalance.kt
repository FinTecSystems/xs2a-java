package com.fintecsystems.xs2a.java.models.risk.uploadJson

import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json

/**
 *
 * @param balance
 * @param limit
 * @param available
 * @param currency
 */

data class Xs2aRiskUploadJsonBalance (
    @Json(name = "balance")
    var balance: Float,
    @Json(name = "limit")
    var limit: Float? = null,
    @Json(name = "available")
    var available: Float? = null,
    @Json(name = "currency")
    var currency: CurrencyId,
)