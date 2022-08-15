package com.fintecsystems.xs2a.java.models.common


import com.squareup.moshi.Json

/**
 * The id of the currency to be used.
 * Values: EUR,CHF,USD
 */


enum class CurrencyId(var value: String) {

    @Json(name = "EUR")
    EUR("EUR"),

    @Json(name = "CHF")
    CHF("CHF"),

    @Json(name = "USD")
    USD("USD");

    override fun toString() = value
}

