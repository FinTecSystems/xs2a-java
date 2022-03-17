
package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.CountryId
import com.squareup.moshi.Json

/**
 * 
 * @param holder 
 * @param description 
 * @param iban 
 * @param countryId 
 * @param bic 
 * @param bankName 
 * @param jointAccount 
 */

data class Xs2aRiskUploadJsonAccount (
    @Json(name = "holder")
    var holder: String,
    @Json(name = "description")
    var description: String,
    @Json(name = "iban")
    var iban: String,
    @Json(name = "country_id")
    var countryId: CountryId,
    @Json(name = "bic")
    var bic: String? = null,
    @Json(name = "bank_name")
    var bankName: String,
    @Json(name = "joint_account")
    var jointAccount: Boolean
)

