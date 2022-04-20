
package com.fintecsystems.xs2a.java.models.risk


import com.squareup.moshi.Json

/**
 * 
 * @param expectedHolder name of the expected holder
 * @param match 
 */

data class MatchesObject (
    /* name of the expected holder */
    @Json(name = "expected_holder")
    var expectedHolder: String,
    @Json(name = "match")
    var match: MatchType
)

