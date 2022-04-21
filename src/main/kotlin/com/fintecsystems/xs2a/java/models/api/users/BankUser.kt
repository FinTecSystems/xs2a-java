package com.fintecsystems.xs2a.java.models.api.users


import com.squareup.moshi.Json
import java.time.OffsetDateTime

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
    var id: String,
    /* Name of the user */
    @Json(name = "name")
    var name: String,
    /* E-Mail of the test user */
    @Json(name = "email")
    var email: String,
    /* True, if this user has been created with a testing API key, false otherwise. */
    @Json(name = "testmode")
    var testmode: Boolean,
    /* Date of creation */
    @Json(name = "created_at")
    var createdAt: OffsetDateTime,
    /* The value bank_user */
    @Json(name = "object")
    var `object`: String
)

