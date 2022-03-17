
package com.fintecsystems.xs2a.java.models.risk

import com.squareup.moshi.Json

/**
 * The keys are the names of the requested checks.
 * @param income 
 * @param rent 
 */

data class Xs2aCreditCheckResponseResults (
    @Json(name = "income")
    var income: ChecksResult? = null,
    @Json(name = "rent")
    var rent: ChecksResult? = null,
)

