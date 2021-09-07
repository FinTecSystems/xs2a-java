
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param holder name of the account holder
 * @param description 
 * @param iban 
 * @param bic 
 * @param countryId 
 */

data class BankAccountObject (
    /* name of the account holder */
    @Json(name = "holder")
    @JvmField
    val holder: String,
    @Json(name = "description")
    @JvmField
    val description: String,
    @Json(name = "iban")
    @JvmField
    val iban: String,
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
)

