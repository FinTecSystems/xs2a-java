
package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.CountryId
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
    var holder: String,
    /* credit card number, shaded */
    @Json(name = "iban")
    var iban: String,
    @Json(name = "bic")
    var bic: String? = null,
    @Json(name = "country_id")
    var countryId: CountryId? = null,
    /* name of the bank */
    @Json(name = "bank_name")
    var bankName: String,
    /* type of the credit card */
    @Json(name = "description")
    var description: String
)

