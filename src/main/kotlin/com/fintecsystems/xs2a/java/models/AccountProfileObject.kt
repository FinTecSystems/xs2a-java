
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param cashWithdrawals Number of cash withdrawals
 * @param cashDeposits Number of cash deposits
 * @param paymentGez 
 * @param paymentSchufa 
 * @param paymentDonation 
 * @param paymentParty 
 * @param paymentClub 
 */

data class AccountProfileObject (
    /* Number of cash withdrawals */
    @Json(name = "cash_withdrawals")
    @JvmField
    val cashWithdrawals: Int,
    /* Number of cash deposits */
    @Json(name = "cash_deposits")
    @JvmField
    val cashDeposits: Int,
    @Json(name = "payment_gez")
    @JvmField
    val paymentGez: String,
    @Json(name = "payment_schufa")
    @JvmField
    val paymentSchufa: String,
    @Json(name = "payment_donation")
    @JvmField
    val paymentDonation: String,
    @Json(name = "payment_party")
    @JvmField
    val paymentParty: String,
    @Json(name = "payment_club")
    @JvmField
    val paymentClub: String
)

