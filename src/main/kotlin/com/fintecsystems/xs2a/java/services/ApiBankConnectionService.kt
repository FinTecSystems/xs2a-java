package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.api.connections.BankConnection
import com.fintecsystems.xs2a.java.models.api.connections.BankConnectionList
import com.fintecsystems.xs2a.java.models.api.connections.BankConnectionRequest
import com.fintecsystems.xs2a.java.models.api.connections.BankConnectionSyncParameters
import com.fintecsystems.xs2a.java.models.wizard.WizardSessionResponse
import okhttp3.OkHttpClient

class ApiBankConnectionService(
    apiKey: String,
    client: OkHttpClient,
) : ServiceBase(apiKey, client = client) {

    constructor(apiKey: String) : this(apiKey, OkHttpClient());

    /**
     * Create a xs2a.api bank user
     * @param body $request The bank user request
     * @return BankUser
     */
    fun create(body: BankConnectionRequest): WizardSessionResponse {
        val response = apiService.put("api/connections", JsonSerializer.toJson(body))

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
        val response = apiService.get(
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
        val response = apiService.get("api/connections/$connectionId")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Delete a specific Bank Connection
     * @param connectionId id of connection to delete
     */
    fun delete(connectionId: String) {
        apiService.delete("api/connections/$connectionId")
    }

    /**
     * Sync a bank connection.
     * @param connectionId The connection-id for the connection to be synced.
     * @param syncParameters request parameters for the sync
     *
     * @return null if the sync process will be executed without any user interaction.
     *         Otherwise, it will return the [WizardSessionResponse].
     */
    fun sync(connectionId: String, syncParameters: BankConnectionSyncParameters? = null): WizardSessionResponse? {
        val response = apiService.post("api/connections/$connectionId/sync", JsonSerializer.toJson(syncParameters))

        return if (response.isEmpty()) null else JsonSerializer.parseJson(response)
    }

    /**
     * Reset a bank connection regardless of its sync mode.
     * @param connectionId The connection-id for the connection to be synced.
     */
    fun reset(connectionId: String): WizardSessionResponse {
        val response = apiService.post("api/connections/$connectionId/reset")

        return JsonSerializer.parseJson(response)
    }
}