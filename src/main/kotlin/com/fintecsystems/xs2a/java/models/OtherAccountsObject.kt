
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
    @JvmField
    val holder: String,
    @Json(name = "iban")
    @JvmField
    val iban: String,
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
    /* name of the bank */
    @Json(name = "bank_name")
    @JvmField
    val bankName: String,
    @Json(name = "type")
    @JvmField
    val type: String
)

