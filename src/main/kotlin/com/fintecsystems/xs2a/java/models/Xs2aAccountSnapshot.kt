package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDate

/**
 *
 * @param days Range in days which should be used (min value: 10, max value: 365)
 * @param from A date in the format yyyy-mm-dd
 * @param to A date in the format yyyy-mm-dd
 * @param filters
 * @param allAccounts True, if you want to receive all accounts including their turnovers
 * @param allTags True, if you want full categorization of the turnovers
 */
data class Xs2aAccountSnapshot(
    /* Range in days which should be used (min value: 10, max value: 365) */
    @Json(name = "days")
    var days: Int? = null,
    /* A date in the format yyyy-mm-dd */
    @Json(name = "from")
    var from: LocalDate? = null,
    /* A date in the format yyyy-mm-dd */
    @Json(name = "to")
    var to: LocalDate? = null,
    @Json(name = "filters")
    var filters: List<String>? = null,
    /* True, if you want to receive all accounts including their turnovers */
    @Json(name = "all_accounts")
    var allAccounts: Boolean,
    /* True, if you want full categorization of the turnovers */
    @Json(name = "all_tags")
    var allTags: Boolean
)

enum class AccountSnapshotFormat(var value: String) {
    @Json(name = "pdf")
    PDF("pdf"),

    @Json(name = "csv")
    CSV("csv"),

    @Json(name = "json")
    JSON("json"),

    @Json(name = "json2")
    JSON2("json2");

    override fun toString() = value
}