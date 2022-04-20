
package com.fintecsystems.xs2a.java.models.risk

import com.squareup.moshi.Json

/**
 * 
 * @param type
 * @param holder
 * @param iban 
 * @param matches 
 */

data class AccountHoldersObject (
    @Json(name = "type")
    var type: String,
    @Json(name = "holder")
    var holder: String,
    @Json(name = "iban")
    var iban: String,
    @Json(name = "matches")
    var matches: List<MatchesObject>
)

