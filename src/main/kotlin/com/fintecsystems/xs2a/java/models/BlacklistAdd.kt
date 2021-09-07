
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param data A valid IBAN to blacklist.
 */

data class BlacklistAdd (
    /* A valid IBAN to blacklist. */
    @Json(name = "data")
    @JvmField
    val data: String
)

