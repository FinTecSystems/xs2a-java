
package com.fintecsystems.xs2a.java.models.risk.checks


import com.fintecsystems.xs2a.java.models.common.Tag
import com.fintecsystems.xs2a.java.models.risk.Category
import com.squareup.moshi.Json

/**
 * The XS2A.credit_check gathers various information about a customer. The check was designed for example to be used in a loan application process without the need to resort to some other medium.
 * @param checks
 * @param categories
 * @param withSubcategory
 */

data class Xs2aCreditCheck (
    @Json(name = "checks")
    var checks: List<Tag>,
    @Json(name = "categories")
    var categories: List<Category>? = null,
    @Json(name = "with_subcategory")
    var withSubcategory: Boolean? = null,
)

