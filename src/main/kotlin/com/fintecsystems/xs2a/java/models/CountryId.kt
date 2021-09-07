package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

enum class CountryId(@JvmField
    val value: String) {
    @Json(name = "DE") DE("DE"),
    @Json(name = "AT") AT("AT"),
    @Json(name = "CH") CH("CH"),
    @Json(name = "FR") FR("FR"),
    @Json(name = "ES") ES("ES"),
    @Json(name = "IT") IT("IT"),
    @Json(name = "GB") GB("GB"),
}