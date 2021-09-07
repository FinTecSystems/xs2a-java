
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param holder Name of the account holder
 * @param description Name of the account
 * @param iban IBAN of the account
 * @param bic BIC of the account
 * @param countryId 2-letter country code of the account
 * @param jointAccount Indicates whether this is a joint account
 */

data class AccountStatementAccount (
    /* Name of the account holder */
    @Json(name = "holder")
    @JvmField
    val holder: String,
    /* Name of the account */
    @Json(name = "description")
    @JvmField
    val description: String,
    /* IBAN of the account */
    @Json(name = "iban")
    @JvmField
    val iban: String,
    /* BIC of the account */
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    /* 2-letter country code of the account */
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
    /* Indicates whether this is a joint account */
    @Json(name = "joint_account")
    @JvmField
    val jointAccount: Boolean
)

