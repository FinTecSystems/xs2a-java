
package com.fintecsystems.xs2a.java.models.risk.checks


import com.squareup.moshi.Json

/**
 * XS2a.seizure_check allows you to check for a seizire account.
 * @param days The limit of turnover days for this check
 */

data class Xs2aSeizureCheck (
    /* The limit of turnover days for this check */
    @Json(name = "days")
    var days: Int?
)

