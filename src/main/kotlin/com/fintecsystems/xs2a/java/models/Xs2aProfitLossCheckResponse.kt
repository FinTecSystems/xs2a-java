
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param result 
 */

data class Xs2aProfitLossCheckResponse (
    @Json(name = "result")
    @JvmField
    val result: Xs2aProfitLossCheckResponseResult
)

