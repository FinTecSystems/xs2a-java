
package com.fintecsystems.xs2a.java.models.risk

import com.squareup.moshi.Json

/**
 * 
 * @param result 
 */

data class Xs2aProfitLossCheckResponse (
    @Json(name = "result")
    var result: Xs2aProfitLossCheckResponseResult
)

