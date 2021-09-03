
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param code Response code
 * @param message The requested session was buried and is not accessible anymore.
 */

data class BuriedSessionObject (
    /* Response code */
    @Json(name = "code")
    val code: Int,
    /* The requested session was buried and is not accessible anymore. */
    @Json(name = "message")
    val message: String
)

