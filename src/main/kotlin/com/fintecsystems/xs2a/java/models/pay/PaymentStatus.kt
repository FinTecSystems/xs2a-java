package com.fintecsystems.xs2a.java.models.pay

import com.squareup.moshi.Json

enum class PaymentStatus(var value: String) {
    @Json(name = "RECEIVED")
    RECEIVED("RECEIVED"),

    @Json(name = "LOSS")
    LOSS("LOSS"),

    @Json(name = "NONE")
    NONE("NONE");

    override fun toString() = value
}