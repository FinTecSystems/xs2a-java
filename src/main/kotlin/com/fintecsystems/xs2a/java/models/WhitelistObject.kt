
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param id Whitelist item id
 * @param hash Hashed representation of iban
 */

data class WhitelistObject (
    /* Whitelist item id */
    @Json(name = "id")
    val id: String,
    /* Hashed representation of iban */
    @Json(name = "hash")
    val hash: String
)

