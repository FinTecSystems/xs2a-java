package com.fintecsystems.xs2a.java.models.risk.checks

import com.fintecsystems.xs2a.java.models.risk.BankAccountObject
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param accounts
 * @param createdAt Creation date of the object
 */

data class Xs2aAllAccountsCheckResponse(
    @Json(name = "accounts")
    var accounts: List<BankAccountObject>,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime
)

