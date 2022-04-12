
package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

/**
 * 
 * @param taxIds 
 * @param profitLoss 
 */

data class Xs2aProfitLossCheckResponseResult (
    @Json(name = "tax_ids")
    var taxIds: List<String>,
    @Json(name = "profit_loss")
    var profitLoss: Xs2aProfitLossCheckResponseResultProfitLoss
)

