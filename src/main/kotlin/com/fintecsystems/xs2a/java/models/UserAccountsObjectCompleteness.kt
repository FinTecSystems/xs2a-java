
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param counterHolder 
 * @param counterIban 
 * @param purpose 
 */

data class UserAccountsObjectCompleteness (
    @Json(name = "counter_holder")
    @JvmField
    val counterHolder: String,
    @Json(name = "counter_iban")
    @JvmField
    val counterIban: String,
    @Json(name = "purpose")
    @JvmField
    val purpose: String
)

