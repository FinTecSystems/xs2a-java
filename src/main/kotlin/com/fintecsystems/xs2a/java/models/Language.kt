
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
* The initial language.
* Values: de,en,es,fr
*/


enum class Language(val value: String) {


    @Json(name = "de")
    DE("de"),

    @Json(name = "en")
    EN("en"),

    @Json(name = "es")
    ES("es"),

    @Json(name = "fr")
    FR("fr"),

    @Json(name = "it")
    IT("it");


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }
}

