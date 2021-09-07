
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
    @JvmField
    val holder: String,
    /* credit card number, shaded */
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
    /* type of the credit card */
    @Json(name = "description")
    @JvmField
    val description: String
)

