
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param code 
 * @param message 
 */

data class Xs2ariskuploadjson500 (
    @Json(name = "code")
    var code: Int,
    @Json(name = "message")
    var message: String
)

