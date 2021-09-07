
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param iban A valid IBAN to whitelist.
 */

data class WhitelistAdd (
    /* A valid IBAN to whitelist. */
    @Json(name = "iban")
    var iban: String
)

