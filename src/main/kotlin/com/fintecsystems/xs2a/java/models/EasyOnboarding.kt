
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * An array of a success/abort_link to overwrite the statically stored values in the easyOboarding.
 * @param successLink 
 * @param abortLink 
 */

data class EasyOnboarding (
    @Json(name = "success_link")
    val successLink: String,
    @Json(name = "abort_link")
    val abortLink: String
)

