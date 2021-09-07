
package com.fintecsystems.xs2a.java.models


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
    @JvmField
    val month: Int,
    /* Amount of this month incoming transactions */
    @Json(name = "incoming")
    @JvmField
    val incoming: Float,
    /* Amount of this month outgoing transactions */
    @Json(name = "outgoing")
    @JvmField
    val outgoing: Float,
    /* The minimum (lowest) balance of the account in that month */
    @Json(name = "minimum_balance")
    @JvmField
    val minimumBalance: Float,
    /* A count of this month incoming transactions */
    @Json(name = "incoming_transactions")
    @JvmField
    val incomingTransactions: Int,
    /* A count of this month outgoing transactions */
    @Json(name = "outgoing_transactions")
    @JvmField
    val outgoingTransactions: Int,
    /* Currency id of above values, e.g. EUR */
    @Json(name = "currency_id")
    @JvmField
    val currencyId: CurrencyId? = null
)

