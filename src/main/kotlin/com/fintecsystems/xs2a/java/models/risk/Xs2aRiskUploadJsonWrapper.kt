
package com.fintecsystems.xs2a.java.models.risk

import com.squareup.moshi.Json

/**
 * 
 * @param account 
 * @param balance 
 * @param turnovers 
 */

data class Xs2aRiskUploadJsonWrapper (
    @Json(name = "account")
    var account: Xs2aRiskUploadJsonAccount,
    @Json(name = "balance")
    var balance: Xs2aRiskUploadJsonBalance,
    @Json(name = "turnovers")
    var turnovers: List<Xs2aRiskUploadJsonTurnoversTurnover>
)

