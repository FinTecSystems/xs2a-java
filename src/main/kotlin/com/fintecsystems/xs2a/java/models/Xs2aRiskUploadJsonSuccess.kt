package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param id
 * @param transaction
 * @param accountHolder
 * @param iban
 * @param bic
 * @param bankName
 * @param countryId
 * @param testmode
 * @param createdAt
 * @param metadata
 * @param merchantId
 * @param `object`
 */

data class Xs2aRiskUploadJsonSuccess(
    @Json(name = "id")
    val id: String,
    @Json(name = "transaction")
    val transaction: String,
    @Json(name = "account_holder")
    val accountHolder: String,
    @Json(name = "iban")
    val iban: String? = null,
    @Json(name = "bic")
    val bic: String? = null,
    @Json(name = "bank_name")
    val bankName: String,
    @Json(name = "country_id")
    val countryId: CountryId? = null,
    @Json(name = "testmode")
    val testmode: Boolean,
    @Json(name = "created_at")
    val createdAt: LocalDateTime,
    @Json(name = "metadata")
    val metadata: String? = null,
    @Json(name = "merchant_id")
    val merchantId: String? = null,
    @Json(name = "object")
    val `object`: String
)

