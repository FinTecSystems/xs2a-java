
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param account 
 * @param balance 
 * @param turnovers 
 */

data class AccountStatement (
    @Json(name = "account")
    val account: AccountStatementAccount,
    @Json(name = "balance")
    val balance: AccountStatementBalance,
    @Json(name = "turnovers")
    val turnovers: AccountStatementTurnovers
)

