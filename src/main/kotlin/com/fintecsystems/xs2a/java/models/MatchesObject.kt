
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param expectedHolder name of the expected holder
 * @param match 
 */

data class MatchesObject (
    /* name of the expected holder */
    @Json(name = "expected_holder")
    @JvmField
    val expectedHolder: String,
    @Json(name = "match")
    @JvmField
    val match: MatchType
) {
    enum class MatchType(@JvmField
    val value: String) {
        @Json(name = "NONE")
        NONE("NONE"),

        @Json(name = "LAST_NAME")
        LAST_NAME("LAST_NAME"),

        @Json(name = "PERSON")
        PERSON("PERSON"),

        @Json(name = "COMPANY")
        COMPANY("COMPANY");
    }
}

