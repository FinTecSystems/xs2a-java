
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
    @JvmField
    val bankCode: String,
    /* BIC of the bank */
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    /* Name of the bank */
    @Json(name = "name")
    @JvmField
    val name: String,
    /* Abbreviated bank name */
    @Json(name = "short_name")
    @JvmField
    val shortName: String,
    /* National ZIP code of the bank */
    @Json(name = "zipcode")
    @JvmField
    val zipcode: String? = null,
    /* City */
    @Json(name = "city")
    @JvmField
    val city: String,
    /* Two letter country code id, e.g. AT, CH, DE */
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
    /* '1', if this bank is a testbank */
    @Json(name = "testmode")
    @JvmField
    val testmode: Boolean,
    /* array of xs2a products supported */
    @Json(name = "xs2a_products")
    @JvmField
    val xs2aProducts: List<String>,
    /* true, if this bank is supported by XS2A */
    @Json(name = "xs2a_supported")
    @JvmField
    val xs2aSupported: Boolean
)

