
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param chargebacksCoverageCount Total number of chargebacks for lack of cover on all authorized accounts.
 * @param chargebacksCoverageAmount Total amount of money, the return debit due to lack of coverage on all authorized accounts.
 * @param chargebacksRevokeCount Total number of chargebacks initiated by the Account Holder on all authorized accounts.
 * @param chargebacksRevokeAmount Grand total of the chargebacks initiated by the Account Holder on all authorized accounts.
 */

data class ChargebacksObject (
    /* Total number of chargebacks for lack of cover on all authorized accounts. */
    @Json(name = "chargebacks_coverage_count")
    var chargebacksCoverageCount: Int,
    /* Total amount of money, the return debit due to lack of coverage on all authorized accounts. */
    @Json(name = "chargebacks_coverage_amount")
    var chargebacksCoverageAmount: Float,
    /* Total number of chargebacks initiated by the Account Holder on all authorized accounts. */
    @Json(name = "chargebacks_revoke_count")
    var chargebacksRevokeCount: Int,
    /* Grand total of the chargebacks initiated by the Account Holder on all authorized accounts. */
    @Json(name = "chargebacks_revoke_amount")
    var chargebacksRevokeAmount: Float
)

