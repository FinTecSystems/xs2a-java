package com.fintecsystems.xs2a.java.models.common


import com.squareup.moshi.Json

/**
 * The id of the currency to be used.
 * Values: EUR,CHF
 */


enum class CurrencyId(var value: String) {

    @Json(name = "EUR")
    EUR("EUR"),

    @Json(name = "CHF")
    CHF("CHF");

    override fun toString() = value
}

