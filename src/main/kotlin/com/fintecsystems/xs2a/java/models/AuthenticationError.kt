
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param code status code to indicate whether the request was successful
 * @param message Descriptive message for the status code
 */

data class AuthenticationError (
    /* status code to indicate whether the request was successful */
    @Json(name = "code")
    @JvmField
    val code: Int,
    /* Descriptive message for the status code */
    @Json(name = "message")
    @JvmField
    val message: String
)

