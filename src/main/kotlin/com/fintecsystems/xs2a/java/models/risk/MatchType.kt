package com.fintecsystems.xs2a.java.models.risk

import com.squareup.moshi.Json

@Suppress("unused")
enum class MatchType(var value: String) {
    @Json(name = "NONE")
    NONE("NONE"),

    @Json(name = "LAST_NAME")
    LAST_NAME("LAST_NAME"),

    @Json(name = "PERSON")
    PERSON("PERSON"),

    @Json(name = "COMPANY")
    COMPANY("COMPANY");

    override fun toString() = value
}