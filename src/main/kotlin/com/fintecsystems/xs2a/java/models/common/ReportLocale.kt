package com.fintecsystems.xs2a.java.models.common

import com.squareup.moshi.Json

enum class ReportLocale(var value: String) {
    @Json(name = "en")
    EN("en"),

    @Json(name = "de")
    DE("de");

    override fun toString() = value
}