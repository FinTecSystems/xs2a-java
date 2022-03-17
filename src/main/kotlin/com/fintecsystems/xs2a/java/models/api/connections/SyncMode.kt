package com.fintecsystems.xs2a.java.models.api.connections

import com.squareup.moshi.Json

/**
 * The mode, how to sync the bank connection. full, shared or none.
 * Values: full,shared,none
 */
enum class SyncMode(var value: String) {
    @Json(name = "full")
    FULL("full"),

    @Json(name = "shared")
    SHARED("shared"),

    @Json(name = "none")
    NONE("none");

    override fun toString() = value
}