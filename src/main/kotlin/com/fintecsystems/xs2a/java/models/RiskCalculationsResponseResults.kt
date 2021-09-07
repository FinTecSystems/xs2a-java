
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * Counts all appropriate results.
 * @param count 
 */

data class RiskCalculationsResponseResults (
    @Json(name = "count")
    var count: Int? = null,
)

