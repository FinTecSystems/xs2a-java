
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param childrenAtAccountHolder Calculated count of children
 */

data class Xs2aChildrenCheckResponse (
    /* Calculated count of children */
    @Json(name = "children_at_account_holder")
    val childrenAtAccountHolder: Int
)

