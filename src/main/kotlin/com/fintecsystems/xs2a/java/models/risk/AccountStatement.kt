
package com.fintecsystems.xs2a.java.models.risk

import com.squareup.moshi.Json

/**
 * 
 * @param account 
 * @param balance 
 * @param turnovers 
 */

data class AccountStatement (
    @Json(name = "account")
    var account: AccountStatementAccount,
    @Json(name = "balance")
    var balance: AccountStatementBalance,
    @Json(name = "turnovers")
    var turnovers: AccountStatementTurnovers
)

