
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
    @JvmField
    val account: Xs2aRiskUploadJsonAccount,
    @Json(name = "balance")
    @JvmField
    val balance: Xs2aRiskUploadJsonBalance,
    @Json(name = "turnovers")
    @JvmField
    val turnovers: List<Xs2aRiskUploadJsonTurnoversTurnover>
)

