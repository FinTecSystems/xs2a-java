
package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

/**
 * XS2A.risk_calculations_check allows you many things
 * @param calculations Array of objects containing many manditory fields.
 */

data class Xs2aRiskCalculationsCheck (
    /* Array of objects containing many manditory fields. */
    @Json(name = "calculations")
    var calculations: List<RiskCalculations>
)

