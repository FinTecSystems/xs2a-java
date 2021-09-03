package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param id Bank Account ID
 * @param turnovers The list of turnovers.
 * @param days The number of days requested
 * @param date The date the turnovers were seen on.
 * @param createdAt Date of creation of the turnovers object.
 * @param `object` The value bank_account_turnovers
 */

data class BankAccountTurnovers(
    /* Bank Account ID */
    @Json(name = "id")
    val id: String,
    /* The list of turnovers. */
    @Json(name = "turnovers")
    val turnovers: List<Turnover>,
    /* The number of days requested */
    @Json(name = "days")
    val days: Int? = null,
    /* The date the turnovers were seen on. */
    @Json(name = "date")
    val date: LocalDateTime,
    /* Date of creation of the turnovers object. */
    @Json(name = "created_at")
    val createdAt: LocalDateTime,
    /* The value bank_account_turnovers */
    @Json(name = "object")
    val `object`: String
)

