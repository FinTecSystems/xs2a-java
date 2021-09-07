
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param code 
 * @param message 
 */

data class Xs2ariskuploadjson422 (
    @Json(name = "code")
    @JvmField
    val code: Int,
    @Json(name = "message")
    @JvmField
    val message: String
)

