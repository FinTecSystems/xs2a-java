
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * The keys are the names of the requested checks.
 * @param income 
 * @param rent 
 */

data class Xs2aCreditCheckResponseResults (
    @Json(name = "income")
    val income: ChecksResult? = null,
    @Json(name = "rent")
    val rent: ChecksResult? = null,
)

