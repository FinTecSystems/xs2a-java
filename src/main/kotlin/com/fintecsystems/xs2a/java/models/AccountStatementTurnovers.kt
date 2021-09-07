package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 * array of turnovers
 * @param turnovers
 * @param date Date of the account snapshot
 * @param days Indicates how many days the account snapshot includes
 * @param filters Array of filters applied
 */

data class AccountStatementTurnovers(
    @Json(name = "turnovers")
    val turnovers: List<Turnover>,
    /* Date of the account snapshot */
    @Json(name = "date")
    val date: LocalDateTime,
    /* Indicates how many days the account snapshot includes */
    @Json(name = "days")
    val days: Int? = null,
    /* Array of filters applied */
    @Json(name = "filters")
    val filters: List<String>
)

