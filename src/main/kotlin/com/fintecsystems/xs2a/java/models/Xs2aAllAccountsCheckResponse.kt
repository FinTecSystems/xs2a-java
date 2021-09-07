package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param accounts
 * @param `object` Object type, in this case a  xs2a_all_accounts_check
 * @param createdAt Creation date of the object
 */

data class Xs2aAllAccountsCheckResponse(
    @Json(name = "accounts")
    @JvmField
    val accounts: List<BankAccountObject>,
    /* Object type, in this case a  xs2a_all_accounts_check */
    @Json(name = "object")
    @JvmField
    val `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime
)

