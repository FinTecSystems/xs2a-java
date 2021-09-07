
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param taxIds 
 * @param profitLoss 
 */

data class Xs2aProfitLossCheckResponseResult (
    @Json(name = "tax_ids")
    @JvmField
    val taxIds: List<String>,
    @Json(name = "profit_loss")
    @JvmField
    val profitLoss: Xs2aProfitLossCheckResponseResultProfitLoss
)

