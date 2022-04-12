package com.fintecsystems.xs2a.java.models.risk.checks

import com.fintecsystems.xs2a.java.models.risk.AccountHoldersObject
import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param expectHolders
 * @param accounts
 * @param `object` Object type, in this case a  xs2a_holder_identification_check
 * @param createdAt Creation date of the object
 */

data class Xs2aHolderIdentificationCheckResponse(
    @Json(name = "expect_holders")
    var expectHolders: List<String>,
    @Json(name = "accounts")
    var accounts: List<AccountHoldersObject>,
    /* Object type, in this case a  xs2a_holder_identification_check */
    @Json(name = "object")
    var `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: LocalDateTime
)

