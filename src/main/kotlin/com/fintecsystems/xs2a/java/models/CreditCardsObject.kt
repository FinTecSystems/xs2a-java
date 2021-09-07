
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param holder name of the account holder
 * @param iban credit card number, shaded
 * @param bic 
 * @param countryId 
 * @param bankName name of the bank
 * @param description type of the credit card
 */

data class CreditCardsObject (
    /* name of the account holder */
    @Json(name = "holder")
    val holder: String,
    /* credit card number, shaded */
    @Json(name = "iban")
    val iban: String,
    @Json(name = "bic")
    val bic: String? = null,
    @Json(name = "country_id")
    val countryId: CountryId? = null,
    /* name of the bank */
    @Json(name = "bank_name")
    val bankName: String,
    /* type of the credit card */
    @Json(name = "description")
    val description: String
)

