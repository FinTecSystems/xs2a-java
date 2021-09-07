
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
    @JvmField
    val account: AccountStatementAccount,
    @Json(name = "balance")
    @JvmField
    val balance: AccountStatementBalance,
    @Json(name = "turnovers")
    @JvmField
    val turnovers: AccountStatementTurnovers
)

