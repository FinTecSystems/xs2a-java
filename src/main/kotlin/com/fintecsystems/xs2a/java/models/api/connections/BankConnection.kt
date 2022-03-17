package com.fintecsystems.xs2a.java.models.api.connections

import com.fintecsystems.xs2a.java.models.common.CountryId
import com.squareup.moshi.Json
import java.time.LocalDate
import java.time.LocalDateTime

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
 * @param `object` The value bank_connection
 */

data class BankConnection(
    /* Bank Connection ID */
    @Json(name = "id")
    var id: String,
    /* Internally used XS2A transaction id. */
    @Json(name = "transaction")
    var transaction: String,
    /* BIC of the bank of the bank connection */
    @Json(name = "bic")
    var bic: String? = null,
    /* The name of the bank of the bank connection */
    @Json(name = "bank_name")
    var bankName: String,
    /* 2 letter country ID */
    @Json(name = "country_id")
    var countryId: CountryId? = null,
    /* The mode how the bank connection is synced. full, shared or none. */
    @Json(name = "sync_mode")
    var syncMode: SyncMode? = null,
    /* Indicates whether the sync is active */
    @Json(name = "sync_active")
    var syncActive: Boolean,
    /* ??? */
    @Json(name = "sync_message")
    var syncMessage: String,
    /* A counter of failed syncs for this connection */
    @Json(name = "sync_fail_counter")
    var syncFailCounter: Int,
    /* The date when the connection was last synced */
    @Json(name = "last_synced")
    var lastSynced: LocalDateTime,
    /* The consent is valid until the given date (Format: YYYY-MM-DD). */
    @Json(name = "consent_valid_until")
    var consentValidUntil: LocalDate? = null,
    /* Indicates whether this bank connection is in test mode */
    @Json(name = "testmode")
    var testmode: Boolean,
    /* Date of creation */
    @Json(name = "created_at")
    var createdAt: LocalDateTime,
    /* The value bank_connection */
    @Json(name = "object")
    var `object`: String
)