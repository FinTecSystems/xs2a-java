
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
    var holder: String,
    /* Name of the account */
    @Json(name = "description")
    var description: String,
    /* IBAN of the account */
    @Json(name = "iban")
    var iban: String,
    /* BIC of the account */
    @Json(name = "bic")
    var bic: String? = null,
    /* 2-letter country code of the account */
    @Json(name = "country_id")
    var countryId: CountryId? = null,
    /* Indicates whether this is a joint account */
    @Json(name = "joint_account")
    var jointAccount: Boolean
)

