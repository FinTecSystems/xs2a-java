package com.fintecsystems.xs2a.java.models

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
    val expectHolders: Array<String>,
    @Json(name = "accounts")
    val accounts: List<AccountHoldersObject>,
    /* Object type, in this case a  xs2a_holder_identification_check */
    @Json(name = "object")
    val `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    val createdAt: LocalDateTime
)

