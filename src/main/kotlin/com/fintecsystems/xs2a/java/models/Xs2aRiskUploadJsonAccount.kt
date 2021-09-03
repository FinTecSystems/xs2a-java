
package com.fintecsystems.xs2a.java.models


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
    val holder: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "iban")
    val iban: String? = null,
    @Json(name = "country_id")
    val countryId: CountryId? = null,
    @Json(name = "bic")
    val bic: String? = null,
    @Json(name = "bank_name")
    val bankName: String,
    @Json(name = "joint_account")
    val jointAccount: Boolean
)

