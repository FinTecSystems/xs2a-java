
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
* The id of the currency to be used.
* Values: eUR,cHF
*/


enum class CurrencyId(var value: String) {


    @Json(name = "EUR")
    EUR("EUR"),

    @Json(name = "CHF")
    CHF("CHF");


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }
}

