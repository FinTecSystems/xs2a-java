
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
    var id: String,
    /* Type of the entry, e.g. iban */
    @Json(name = "type")
    var type: String,
    /* IBAN */
    @Json(name = "data")
    var data: String
)

