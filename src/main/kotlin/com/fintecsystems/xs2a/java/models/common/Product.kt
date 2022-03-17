package com.fintecsystems.xs2a.java.models.common

import com.squareup.moshi.Json

/**
 * Name of the used product.
 * Values: risk,pay, api
 */
enum class Product(var value: String) {
    @Json(name = "xs2a_risk")
    RISK("xs2a_risk"),

    @Json(name = "xs2a_pay")
    PAY("xs2a_pay"),

    @Json(name = "xs2a_api")
    API("xs2a_api");

    override fun toString() = value
}
