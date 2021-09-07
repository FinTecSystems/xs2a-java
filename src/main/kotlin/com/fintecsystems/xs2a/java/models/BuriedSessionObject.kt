
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
    @JvmField
    val code: Int,
    /* The requested session was buried and is not accessible anymore. */
    @Json(name = "message")
    @JvmField
    val message: String
)

