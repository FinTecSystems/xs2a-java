package com.fintecsystems.xs2a.java.models.risk.checks

import com.fintecsystems.xs2a.java.models.risk.AccountProfileObject
import com.fintecsystems.xs2a.java.models.risk.ChargebacksObject
import com.fintecsystems.xs2a.java.models.risk.EncashmentObject
import com.fintecsystems.xs2a.java.models.risk.LoansObject
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param chargebacks
 * @param encashment
 * @param accountProfile
 * @param loans
 * @param flags
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
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)