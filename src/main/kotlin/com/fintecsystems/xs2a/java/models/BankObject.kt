
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param bankCode bank code of the bank
 * @param bic BIC of the bank
 * @param name Name of the bank
 * @param shortName Abbreviated bank name
 * @param zipcode National ZIP code of the bank
 * @param city City
 * @param countryId Two letter country code id, e.g. AT, CH, DE
 * @param testmode '1', if this bank is a testbank
 * @param xs2aProducts array of xs2a products supported
 * @param xs2aSupported true, if this bank is supported by XS2A
 */

data class BankObject (
    /* bank code of the bank */
    @Json(name = "bank_code")
    val bankCode: String,
    /* BIC of the bank */
    @Json(name = "bic")
    val bic: String? = null,
    /* Name of the bank */
    @Json(name = "name")
    val name: String,
    /* Abbreviated bank name */
    @Json(name = "short_name")
    val shortName: String,
    /* National ZIP code of the bank */
    @Json(name = "zipcode")
    val zipcode: String? = null,
    /* City */
    @Json(name = "city")
    val city: String,
    /* Two letter country code id, e.g. AT, CH, DE */
    @Json(name = "country_id")
    val countryId: CountryId? = null,
    /* '1', if this bank is a testbank */
    @Json(name = "testmode")
    val testmode: Boolean,
    /* array of xs2a products supported */
    @Json(name = "xs2a_products")
    val xs2aProducts: List<String>,
    /* true, if this bank is supported by XS2A */
    @Json(name = "xs2a_supported")
    val xs2aSupported: Boolean
)

