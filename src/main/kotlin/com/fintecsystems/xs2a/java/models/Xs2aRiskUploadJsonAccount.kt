
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
    @JvmField
    val holder: String,
    @Json(name = "description")
    @JvmField
    val description: String,
    @Json(name = "iban")
    @JvmField
    val iban: String? = null,
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    @Json(name = "bank_name")
    @JvmField
    val bankName: String,
    @Json(name = "joint_account")
    @JvmField
    val jointAccount: Boolean
)

