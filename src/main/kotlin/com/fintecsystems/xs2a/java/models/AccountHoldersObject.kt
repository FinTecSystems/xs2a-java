
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
    var type: String,
    /* holder */
    @Json(name = "holder")
    var holder: String,
    @Json(name = "iban")
    var iban: String,
    @Json(name = "matches")
    var matches: List<MatchesObject>
)

