package com.fintecsystems.xs2a.java.models


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
    @JvmField
    val id: String,
    /* Internally used XS2A transaction id. */
    @Json(name = "transaction")
    @JvmField
    val transaction: String,
    /* BIC of the bank of the bank connection */
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    /* The name of the bank of the bank connection */
    @Json(name = "bank_name")
    @JvmField
    val bankName: String,
    /* 2 letter country ID */
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
    /* The mode how the bank connection is synced. full, shared or none. */
    @Json(name = "sync_mode")
    @JvmField
    val syncMode: SyncMode? = null,
    /* Indicates whether the sync is active */
    @Json(name = "sync_active")
    @JvmField
    val syncActive: Boolean,
    /* ??? */
    @Json(name = "sync_message")
    @JvmField
    val syncMessage: String,
    /* A counter of failed syncs for this connection */
    @Json(name = "sync_fail_counter")
    @JvmField
    val syncFailCounter: Int,
    /* The date when the connection was last synced */
    @Json(name = "last_synced")
    @JvmField
    val lastSynced: LocalDateTime,
    /* The consent is valid until the given date (Format: YYYY-MM-DD). */
    @Json(name = "consent_valid_until")
    @JvmField
    val consentValidUntil: LocalDate? = null,
    /* Indicates whether this bank connection is in test mode */
    @Json(name = "testmode")
    @JvmField
    val testmode: Boolean,
    /* Date of creation */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime,
    /* The value bank_connection */
    @Json(name = "object")
    @JvmField
    val `object`: String
) {

    /**
     * The mode, how to sync the bank connection. full, shared or none.
     * Values: full,shared,none
     */
    enum class SyncMode(@JvmField
    val value: String) {
        @Json(name = "full")
        FULL("full"),

        @Json(name = "shared")
        SHARED("shared"),

        @Json(name = "none")
        NONE("none");
    }

    /**
     * Mode of account selection. If \"all\" is given, all available accounts from this bankconnection will be used. If \"single\"/\"multi\" is given, the customer can pick single/multiple accounts from this connection which will be used.
     * Values: all,multi,single
     */
    enum class AccountSelection(@JvmField
    val value: String) {
        @Json(name = "all")
        ALL("all"),

        @Json(name = "multi")
        MULTI("multi"),

        @Json(name = "single")
        SINGLE("single");
    }

    /**
     * Desired language in which the customer interface will be rendered with.
     * Values: de,en,fr,es,it
     */
    enum class Language(@JvmField
    val value: String) {
        @Json(name = "de")
        DE("de"),

        @Json(name = "en")
        EN("en"),

        @Json(name = "fr")
        FR("fr"),

        @Json(name = "es")
        ES("es"),

        @Json(name = "it")
        IT("it");
    }
}

