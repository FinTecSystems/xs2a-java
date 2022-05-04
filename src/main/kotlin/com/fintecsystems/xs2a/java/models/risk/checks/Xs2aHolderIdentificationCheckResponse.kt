package com.fintecsystems.xs2a.java.models.risk.checks

import com.fintecsystems.xs2a.java.models.risk.AccountHoldersObject
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param expectHolders
 * @param accounts
 * @param createdAt Creation date of the object
 */

data class Xs2aHolderIdentificationCheckResponse(
    @Json(name = "expect_holders")
    var expectHolders: List<String>,
    @Json(name = "accounts")
    var accounts: List<AccountHoldersObject>,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

