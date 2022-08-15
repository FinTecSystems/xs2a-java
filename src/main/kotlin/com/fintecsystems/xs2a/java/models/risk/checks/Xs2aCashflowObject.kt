
package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json

/**
 * 
 * @param month Relative month, e.g. current is 0, previous month is -1 and so on
 * @param incoming Amount of this month incoming transactions
 * @param outgoing Amount of this month outgoing transactions
 * @param minimumBalance The minimum (lowest) balance of the account in that month
 * @param incomingTransactions A count of this month incoming transactions
 * @param outgoingTransactions A count of this month outgoing transactions
 * @param currencyId Currency id of above values
 */

data class Xs2aCashflowObject (
    @Json(name = "month")
    var month: Int,
    @Json(name = "incoming")
    var incoming: Float,
    @Json(name = "outgoing")
    var outgoing: Float,
    @Json(name = "minimum_balance")
    var minimumBalance: Float,
    @Json(name = "incoming_transactions")
    var incomingTransactions: Int,
    @Json(name = "outgoing_transactions")
    var outgoingTransactions: Int,
    @Json(name = "currency_id")
    var currencyId: CurrencyId
)

