package com.fintecsystems.xs2a.java.models.common

import com.squareup.moshi.Json

enum class ReportFormat(var value: String) {
    @Json(name = "html")
    HTML("html"),

    @Json(name = "pdf")
    PDF("pdf"),

    @Json(name = "json")
    JSON("json");

    override fun toString() = value
}