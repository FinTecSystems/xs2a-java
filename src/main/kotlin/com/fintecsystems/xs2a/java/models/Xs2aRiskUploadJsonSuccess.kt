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
    @JvmField
    val id: String,
    @Json(name = "transaction")
    @JvmField
    val transaction: String,
    @Json(name = "account_holder")
    @JvmField
    val accountHolder: String,
    @Json(name = "iban")
    @JvmField
    val iban: String? = null,
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    @Json(name = "bank_name")
    @JvmField
    val bankName: String,
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
    @Json(name = "testmode")
    @JvmField
    val testmode: Boolean,
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime,
    @Json(name = "metadata")
    @JvmField
    val metadata: String? = null,
    @Json(name = "merchant_id")
    @JvmField
    val merchantId: String? = null,
    @Json(name = "object")
    @JvmField
    val `object`: String
)

