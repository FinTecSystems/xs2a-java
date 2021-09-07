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
    @JvmField
    val expectHolders: Array<String>,
    @Json(name = "accounts")
    @JvmField
    val accounts: List<AccountHoldersObject>,
    /* Object type, in this case a  xs2a_holder_identification_check */
    @Json(name = "object")
    @JvmField
    val `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Xs2aHolderIdentificationCheckResponse

        if (!expectHolders.contentEquals(other.expectHolders)) return false
        if (accounts != other.accounts) return false
        if (`object` != other.`object`) return false
        if (createdAt != other.createdAt) return false

        return true
    }

    override fun hashCode(): Int {
        var result = expectHolders.contentHashCode()
        result = 31 * result + accounts.hashCode()
        result = 31 * result + `object`.hashCode()
        result = 31 * result + createdAt.hashCode()
        return result
    }
}

