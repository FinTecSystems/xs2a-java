package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param checks Indicates which checks were performed
 * @param checkDays Range in days that were used to calculated and gather the desired information
 * @param results
 * @param `object` Object type, in this case a  xs2a_credit_check
 * @param createdAt Creation date of the object
 */

data class Xs2aCreditCheckResponse(
    /* Indicates which checks were performed */
    @Json(name = "checks")
    @JvmField
    val checks: List<String>,
    /* Range in days that were used to calculated and gather the desired information */
    @Json(name = "check_days")
    @JvmField
    val checkDays: Int,
    @Json(name = "results")
    @JvmField
    val results: Xs2aCreditCheckResponseResults,
    /* Object type, in this case a  xs2a_credit_check */
    @Json(name = "object")
    @JvmField
    val `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime
)

