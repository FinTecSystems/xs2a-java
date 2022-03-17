
package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.common.CountryId
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
    var holder: String,
    @Json(name = "iban")
    var iban: String,
    @Json(name = "bic")
    var bic: String? = null,
    @Json(name = "country_id")
    var countryId: CountryId? = null,
    /* name of the bank */
    @Json(name = "bank_name")
    var bankName: String,
    @Json(name = "type")
    var type: String
)

