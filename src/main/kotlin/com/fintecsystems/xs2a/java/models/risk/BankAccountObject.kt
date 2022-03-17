
package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.common.CountryId
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
    var holder: String,
    @Json(name = "description")
    var description: String,
    @Json(name = "iban")
    var iban: String,
    @Json(name = "bic")
    var bic: String? = null,
    @Json(name = "country_id")
    var countryId: CountryId? = null,
)

