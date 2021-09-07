package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param id transaction ID
 * @param name Name of the user
 * @param email E-Mail of the test user
 * @param testmode True, if this user has been created with a testing API key, false otherwise.
 * @param createdAt Date of creation
 * @param `object` The value bank_user
 */

data class BankUser(
    /* transaction ID */
    @Json(name = "id")
    @JvmField
    val id: String,
    /* Name of the user */
    @Json(name = "name")
    @JvmField
    val name: String,
    /* E-Mail of the test user */
    @Json(name = "email")
    @JvmField
    val email: String,
    /* True, if this user has been created with a testing API key, false otherwise. */
    @Json(name = "testmode")
    @JvmField
    val testmode: Boolean,
    /* Date of creation */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime,
    /* The value bank_user */
    @Json(name = "object")
    @JvmField
    val `object`: String
)

