
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * The keys are the names of the requested checks.
 * @param income 
 * @param rent 
 */

data class Xs2aCreditCheckResponseResults (
    @Json(name = "income")
    @JvmField
    val income: ChecksResult? = null,
    @Json(name = "rent")
    @JvmField
    val rent: ChecksResult? = null,
)

