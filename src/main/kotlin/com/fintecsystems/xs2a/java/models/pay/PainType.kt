package com.fintecsystems.xs2a.java.models.pay

import com.squareup.moshi.Json

/**
 * The format of pain file.
 * Values: painPeriod001Period001Period03
 */
enum class PainType(var value: String) {
    @Json(name = "pain.001.001.03") PAIN001001003("pain.001.001.03");

    override fun toString() = value
}