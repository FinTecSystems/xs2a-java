
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param id Blacklist item id
 * @param type Type of the entry, e.g. iban
 * @param data IBAN
 */

data class BlacklistObject (
    /* Blacklist item id */
    @Json(name = "id")
    val id: String,
    /* Type of the entry, e.g. iban */
    @Json(name = "type")
    val type: String,
    /* IBAN */
    @Json(name = "data")
    val data: String
)

