package com.fintecsystems.xs2a.java.models.risk

import com.fintecsystems.xs2a.java.models.AccountProfileObject
import com.fintecsystems.xs2a.java.models.ChargebacksObject
import com.fintecsystems.xs2a.java.models.EncashmentObject
import com.fintecsystems.xs2a.java.models.LoansObject
import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param chargebacks
 * @param encashment
 * @param accountProfile
 * @param loans
 * @param flags
 * @param `object` Object type, in this case a  xs2a_account_characteristics_check
 * @param createdAt Creation date of the object
 */

data class Xs2aAccountCharacteristicsCheckResponse(
    @Json(name = "chargebacks")
    var chargebacks: ChargebacksObject,
    @Json(name = "encashment")
    var encashment: EncashmentObject,
    @Json(name = "account_profile")
    var accountProfile: AccountProfileObject,
    @Json(name = "loans")
    var loans: LoansObject,
    @Json(name = "flags")
    var flags: Map<String, String>,
    /* Object type, in this case a  xs2a_account_characteristics_check */
    @Json(name = "object")
    var `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: LocalDateTime
)

