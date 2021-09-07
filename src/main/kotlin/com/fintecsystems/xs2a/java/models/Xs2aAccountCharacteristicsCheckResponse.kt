package com.fintecsystems.xs2a.java.models

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
    @JvmField
    val chargebacks: ChargebacksObject,
    @Json(name = "encashment")
    @JvmField
    val encashment: EncashmentObject,
    @Json(name = "account_profile")
    @JvmField
    val accountProfile: AccountProfileObject,
    @Json(name = "loans")
    @JvmField
    val loans: LoansObject,
    @Json(name = "flags")
    @JvmField
    val flags: Map<String, String>,
    /* Object type, in this case a  xs2a_account_characteristics_check */
    @Json(name = "object")
    @JvmField
    val `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime
)

