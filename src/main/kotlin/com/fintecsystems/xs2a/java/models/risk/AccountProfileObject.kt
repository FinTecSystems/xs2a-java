
package com.fintecsystems.xs2a.java.models.risk


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
    var cashWithdrawals: Int,
    /* Number of cash deposits */
    @Json(name = "cash_deposits")
    var cashDeposits: Int,
    @Json(name = "payment_gez")
    var paymentGez: String,
    @Json(name = "payment_schufa")
    var paymentSchufa: String,
    @Json(name = "payment_donation")
    var paymentDonation: String,
    @Json(name = "payment_party")
    var paymentParty: String,
    @Json(name = "payment_club")
    var paymentClub: String
)

