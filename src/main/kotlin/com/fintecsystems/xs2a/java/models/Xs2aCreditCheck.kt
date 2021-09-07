
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * The XS2A.credit_check gathers various information about a customer. The check was designed for example to be used in a loan application process without the need to resort to some other medium.
 * @param checks 
 */

data class Xs2aCreditCheck (
    @Json(name = "checks")
    val checks: List<String>
)

