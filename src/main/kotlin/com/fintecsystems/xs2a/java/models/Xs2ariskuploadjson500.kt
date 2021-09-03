
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param code 
 * @param message 
 */

data class Xs2ariskuploadjson500 (
    @Json(name = "code")
    val code: Int,
    @Json(name = "message")
    val message: String
)

