
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
    val type: String,
    /* holder */
    @Json(name = "holder")
    val holder: String,
    @Json(name = "iban")
    val iban: String,
    @Json(name = "matches")
    val matches: List<MatchesObject>
)

