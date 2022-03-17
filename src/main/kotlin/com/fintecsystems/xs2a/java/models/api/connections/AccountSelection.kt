package com.fintecsystems.xs2a.java.models.api.connections

import com.squareup.moshi.Json

/**
 * Mode of account selection. If \"all\" is given, all available accounts from this bankconnection will be used. If \"single\"/\"multi\" is given, the customer can pick single/multiple accounts from this connection which will be used.
 * Values: all,multi,single
 */
enum class AccountSelection(var value: String) {
    @Json(name = "all")
    ALL("all"),

    @Json(name = "multi")
    MULTI("multi"),

    @Json(name = "single")
    SINGLE("single");

    override fun toString() = value
}