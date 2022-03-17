
package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.CurrencyId
import com.squareup.moshi.Json

/**
 * 
 * @param month Relative month, e.g. current is 0, previous month is -1 and so on
 * @param incoming Amount of this month incoming transactions
 * @param outgoing Amount of this month outgoing transactions
 * @param minimumBalance The minimum (lowest) balance of the account in that month
 * @param incomingTransactions A count of this month incoming transactions
 * @param outgoingTransactions A count of this month outgoing transactions
 * @param currencyId Currency id of above values, e.g. EUR
 */

data class Xs2aCashflowObject (
    /* Relative month, e.g. current is 0, previous month is -1 and so on */
    @Json(name = "month")
    var month: Int,
    /* Amount of this month incoming transactions */
    @Json(name = "incoming")
    var incoming: Float,
    /* Amount of this month outgoing transactions */
    @Json(name = "outgoing")
    var outgoing: Float,
    /* The minimum (lowest) balance of the account in that month */
    @Json(name = "minimum_balance")
    var minimumBalance: Float,
    /* A count of this month incoming transactions */
    @Json(name = "incoming_transactions")
    var incomingTransactions: Int,
    /* A count of this month outgoing transactions */
    @Json(name = "outgoing_transactions")
    var outgoingTransactions: Int,
    /* Currency id of above values, e.g. EUR */
    @Json(name = "currency_id")
    var currencyId: CurrencyId? = null
)

