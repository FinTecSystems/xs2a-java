package com.fintecsystems.xs2a.java.models.api.connections

import com.fintecsystems.xs2a.java.helper.OffsetDate
import com.fintecsystems.xs2a.java.models.common.CountryId
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param id Bank Connection ID
 * @param transaction Internally used XS2A transaction id.
 * @param bic BIC of the bank of the bank connection
 * @param bankName The name of the bank of the bank connection
 * @param countryId 2 letter country ID
 * @param syncMode The mode how the bank connection is synced. full, shared or none.
 * @param syncActive Indicates whether the sync is active
 * @param syncMessage ???
 * @param syncFailCounter A counter of failed syncs for this connection
 * @param lastSynced The date when the connection was last synced
 * @param consentValidUntil The consent is valid until the given date (Format: YYYY-MM-DD).
 * @param testmode Indicates whether this bank connection is in test mode
 * @param createdAt Date of creation
 */

data class BankConnection(
    @Json(name = "id")
    var id: String,
    @Json(name = "transaction")
    var transaction: String,
    @Json(name = "bic")
    var bic: String? = null,
    @Json(name = "bank_name")
    var bankName: String,
    @Json(name = "country_id")
    var countryId: CountryId? = null,
    @Json(name = "sync_mode")
    var syncMode: SyncMode? = null,
    @Json(name = "sync_active")
    var syncActive: Boolean,
    @Json(name = "sync_message")
    var syncMessage: String,
    @Json(name = "sync_fail_counter")
    var syncFailCounter: Int,
    @Json(name = "last_synced")
    var lastSynced: OffsetDateTime,
    @Json(name = "consent_valid_until")
    @OffsetDate
    var consentValidUntil: OffsetDateTime? = null,
    @Json(name = "testmode")
    var testmode: Boolean,
    @Json(name = "created_at")
    var createdAt: OffsetDateTime,
)