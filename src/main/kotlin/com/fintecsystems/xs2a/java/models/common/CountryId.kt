package com.fintecsystems.xs2a.java.models.common

import com.squareup.moshi.FromJson
import com.squareup.moshi.Json

enum class CountryId(var value: String) {
    @Json(name = "DE") DE("DE"),
    @Json(name = "AT") AT("AT"),
    @Json(name = "CH") CH("CH"),
    @Json(name = "FR") FR("FR"),
    @Json(name = "ES") ES("ES"),
    @Json(name = "IT") IT("IT"),
    @Json(name = "GB") GB("GB");

    override fun toString() = value

    companion object Adapter {
        private val valueMap = CountryId.values()
            .associateBy(CountryId::value)

        @FromJson
        fun fromJson(fieldToParse: String?) = valueMap[fieldToParse]
    }
}