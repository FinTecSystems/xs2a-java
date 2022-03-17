package com.fintecsystems.xs2a.java.models.blacklist

import com.squareup.moshi.Json

/**
 *
 * @param data A valid IBAN to blacklist.
 */

data class BlacklistAdd (
    /* A valid IBAN to blacklist. */
    @Json(name = "data")
    var data: String
)