
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
* The initial language.
* Values: de,en,es,fr
*/


enum class Language(var value: String) {

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

    override fun toString() = value
}

