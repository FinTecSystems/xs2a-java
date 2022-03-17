package com.fintecsystems.xs2a.java.models.whitelist

import com.squareup.moshi.Json

/**
 *
 * @param id Whitelist item id
 * @param hash Hashed representation of iban
 */

data class WhitelistObject (
    /* Whitelist item id */
    @Json(name = "id")
    var id: String,
    /* Hashed representation of iban */
    @Json(name = "hash")
    var hash: String
)