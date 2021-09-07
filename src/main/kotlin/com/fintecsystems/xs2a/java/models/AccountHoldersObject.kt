
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param type Giro
 * @param holder holder
 * @param iban 
 * @param matches 
 */

data class AccountHoldersObject (
    /* Giro */
    @Json(name = "type")
    @JvmField
    val type: String,
    /* holder */
    @Json(name = "holder")
    @JvmField
    val holder: String,
    @Json(name = "iban")
    @JvmField
    val iban: String,
    @Json(name = "matches")
    @JvmField
    val matches: List<MatchesObject>
)

