
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
    val holder: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "iban")
    val iban: String,
    @Json(name = "bic")
    val bic: String? = null,
    @Json(name = "country_id")
    val countryId: CountryId? = null,
)

