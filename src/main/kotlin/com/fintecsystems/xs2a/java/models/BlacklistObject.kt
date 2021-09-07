
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
    @JvmField
    val id: String,
    /* Type of the entry, e.g. iban */
    @Json(name = "type")
    @JvmField
    val type: String,
    /* IBAN */
    @Json(name = "data")
    @JvmField
    val data: String
)

