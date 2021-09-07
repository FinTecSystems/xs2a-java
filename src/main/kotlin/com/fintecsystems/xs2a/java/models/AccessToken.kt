package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param id access Token ID
 * @param token The Access Token
 * @param validUntil The date-time this token expires. Note that the access token is valid for one hour. After one hour you have to refresh the token, to be valid another hour.
 * @param createdAt Date of creation
 * @param `object` The value bank_user_access_token
 */

data class AccessToken(
    /* access Token ID */
    @Json(name = "id")
    var id: String,
    /* The Access Token */
    @Json(name = "token")
    var token: String,
    /* The date-time this token expires. Note that the access token is valid for one hour. After one hour you have to refresh the token, to be valid another hour. */
    @Json(name = "valid_until")
    var validUntil: LocalDateTime? = null,
    /* Date of creation */
    @Json(name = "created_at")
    var createdAt: LocalDateTime,
    /* The value bank_user_access_token */
    @Json(name = "object")
    var `object`: String
)

