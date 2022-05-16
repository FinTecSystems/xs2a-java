package com.fintecsystems.xs2a.java.models.api.connections

import com.squareup.moshi.Json

/**
 *
 * @param credentials **Only required** if the sync mode is *shared*: Your part of the shared credentials.
 * @param force If an error occurred during syncing, you may force a retry. If the sync_fail_counter goes up to 3 no more syncs are allowed.
 */
data class BankConnectionSyncParameters (
    @Json(name = "credentials")
    var credentials: String? = null,
    @Json(name = "force")
    var force: Boolean
)