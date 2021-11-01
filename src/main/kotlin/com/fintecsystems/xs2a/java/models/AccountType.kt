package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

enum class AccountType(var value: String) {
    @Json(name = "giro")
    GIRO("giro"),

    @Json(name = "creditcard")
    CREDITCARD("creditcard"),

    @Json(name = "savings")
    SAVINGS("savings"),

    @Json(name = "loan")
    LOAN("loan"),

    @Json(name = "securities")
    SECURITIES("securities"),

    @Json(name = "wallet")
    WALLET("wallet"),

    @Json(name = "other")
    OTHER("other");

    override fun toString() = value
}