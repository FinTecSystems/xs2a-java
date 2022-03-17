package com.fintecsystems.xs2a.java.models.api.accounts

import com.fintecsystems.xs2a.java.models.common.Turnover
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
    var id: String,
    /* The list of turnovers. */
    @Json(name = "turnovers")
    var turnovers: List<Turnover>,
    /* The number of days requested */
    @Json(name = "days")
    var days: Int? = null,
    /* The date the turnovers were seen on. */
    @Json(name = "date")
    var date: LocalDateTime,
    /* Date of creation of the turnovers object. */
    @Json(name = "created_at")
    var createdAt: LocalDateTime,
    /* The value bank_account_turnovers */
    @Json(name = "object")
    var `object`: String
)