package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.*

class ApiBankConnectionService (
    private val apiKey: String
) {
    /**
     * Create a xs2a.api bank user
     * @param body $request The bank user request
     * @return BankUser
     */
    fun create(body: BankConnectionRequest): WizardSessionResponse {
        val response = ApiService(apiKey).put("api/connections", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a list of all bank connections for a xs2a.api bank user
     *
     * @param per_page Items per page
     * @param page Which page to display
     */
    fun list(
        per_page: Int = 15,
        page: Int = 1,
    ): BankConnectionList {
        val response = ApiService(apiKey).get(
            "api/connections",
            mutableMapOf(
                "per_page" to per_page.toString(),
                "page" to page.toString(),
            )
        )

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a specific Bank Connection
     * @param connectionId The connection-id for the connection to be retrieved. You can also pass transaction
     * id here, which you get when you create a bank connection.
     * @return BankConnection
     */
    fun get(connectionId: String): BankConnection {
        val response = ApiService(apiKey).get("api/connections/$connectionId")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Delete a specific Bank Connection
     * @param connectionId id of connection to delete
     * @return String
     */
    fun delete(connectionId: String): String {
        return ApiService(apiKey).delete("api/connections/$connectionId")
    }

    /**
     * Sync a bank connection.
     * @param connectionId The connection-id for the connection to be synced.
     * @param request request parameters for the sync
     */
    fun sync(connectionId: String, request: BankConnectionSyncRequest? = null): String {
        return ApiService(apiKey).post("api/connections/$connectionId/sync", JsonSerializer.toJson(request))
    }

    /**
     * Reset a bank connection regardless of its sync mode.
     * @param connectionId The connection-id for the connection to be synced.
     */
    fun reset(connectionId: String): WizardSessionResponse {
        val response = ApiService(apiKey).post("api/connections/$connectionId/reset")

        return JsonSerializer.parseJson(response)
    }
}