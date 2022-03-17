
package com.fintecsystems.xs2a.java.models.risk


import com.squareup.moshi.Json

/**
 * With XS2A.xs2a_account_status_check a list of accounts within the bank connection can be requested. Basically you have to decide if the account status data for the reference account or all accounts within the bank account should be collected. In addition the request can be filtered over a period in days. As result you get data about account or accountholder identification, current account balance, turnovers and the quality of the turnovers.
 * @param limitTurnoverDays If needed limit the fetched turnovers to create it. Default 365. Valid Range: 10 - 365
 * @param allAccounts True, if you want to receive all accounts including their turnovers
 */

data class Xs2aAccountStatusCheck (
    /* If needed limit the fetched turnovers to create it. Default 365. Valid Range: 10 - 365 */
    @Json(name = "limit_turnover_days")
    var limitTurnoverDays: Int? = null,
    /* True, if you want to receive all accounts including their turnovers */
    @Json(name = "all_accounts")
    var allAccounts: Boolean
)

