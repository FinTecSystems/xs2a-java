
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param holder name of the account holder
 * @param iban 
 * @param bic 
 * @param countryId 
 * @param bankName name of the bank
 * @param type 
 */

data class OtherAccountsObject (
    /* name of the account holder */
    @Json(name = "holder")
    val holder: String,
    @Json(name = "iban")
    val iban: String,
    @Json(name = "bic")
    val bic: String? = null,
    @Json(name = "country_id")
    val countryId: CountryId? = null,
    /* name of the bank */
    @Json(name = "bank_name")
    val bankName: String,
    @Json(name = "type")
    val type: String
)

