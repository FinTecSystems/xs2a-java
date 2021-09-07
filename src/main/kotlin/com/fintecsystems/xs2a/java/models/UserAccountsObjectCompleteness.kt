
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
    val counterHolder: String,
    @Json(name = "counter_iban")
    val counterIban: String,
    @Json(name = "purpose")
    val purpose: String
)

