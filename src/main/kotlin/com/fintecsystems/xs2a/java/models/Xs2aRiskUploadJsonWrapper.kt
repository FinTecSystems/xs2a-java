
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param account 
 * @param balance 
 * @param turnovers 
 */

data class Xs2aRiskUploadJsonWrapper (
    @Json(name = "account")
    val account: Xs2aRiskUploadJsonAccount,
    @Json(name = "balance")
    val balance: Xs2aRiskUploadJsonBalance,
    @Json(name = "turnovers")
    val turnovers: List<Xs2aRiskUploadJsonTurnoversTurnover>
)

