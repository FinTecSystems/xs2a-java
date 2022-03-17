package com.fintecsystems.xs2a.java.models.risk


import com.fintecsystems.xs2a.java.models.CountryId
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
    var id: String,
    @Json(name = "transaction")
    var transaction: String,
    @Json(name = "account_holder")
    var accountHolder: String,
    @Json(name = "iban")
    var iban: String? = null,
    @Json(name = "bic")
    var bic: String? = null,
    @Json(name = "bank_name")
    var bankName: String,
    @Json(name = "country_id")
    var countryId: CountryId? = null,
    @Json(name = "testmode")
    var testmode: Boolean,
    @Json(name = "created_at")
    var createdAt: LocalDateTime,
    @Json(name = "metadata")
    var metadata: String? = null,
    @Json(name = "merchant_id")
    var merchantId: String? = null,
    @Json(name = "object")
    var `object`: String
)

