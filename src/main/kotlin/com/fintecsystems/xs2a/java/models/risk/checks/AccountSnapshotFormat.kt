package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.Json

@Suppress("unused")
enum class AccountSnapshotFormat(var value: String) {
    @Json(name = "pdf")
    PDF("pdf"),

    @Json(name = "csv")
    CSV("csv"),

    @Json(name = "json")
    JSON("json"),

    @Json(name = "json2")
    JSON2("json2");

    override fun toString() = value
}