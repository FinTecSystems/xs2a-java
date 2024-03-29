package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.helper.OffsetDateTimeAdapter
import com.fintecsystems.xs2a.java.models.api.users.*
import okhttp3.OkHttpClient
import java.time.OffsetDateTime

@Suppress("unused")
class ApiBankUserService(
    apiKey: String,
    client: OkHttpClient = defaultClient,
    backendUrl: String = defaultBackendUrl
) : ServiceBase(
    apiKey,
    client = client,
    backendUrl = backendUrl
) {

    constructor(apiKey: String) : this(apiKey, defaultClient)

    constructor(apiKey: String, backendUrl: String) : this(apiKey, defaultClient, backendUrl)

    constructor(apiKey: String, client: OkHttpClient) : this(apiKey, client, defaultBackendUrl)

    /**
     * Create a xs2a.api bank user
     * @param body $request The bank user request
     * @return BankUser
     */
    fun create(body: BankUserCreationRequest): BankUser {
        val response = apiService.put("api/users", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a xs2a.api bank user by user-id
     * @param userId userId id of user to get
     * @return BankUser
     */
    fun get(userId: String): BankUser {
        val response = apiService.get("api/users/$userId")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Delete a xs2a.api bank user by user-id
     * @param userId userId id of user to delete
     * @return String
     */
    fun delete(userId: String): String {
        return apiService.delete("api/users/$userId").use { it.readUtf8() }
    }


    /**
     * Create an Access Token for a xs2a.api bank user
     * @param userId id of user to create access token for
     * @param validUntil The accesstoken will be valid until the given date (Format: YYYY-MM-DD hh:mm:ss).
     * @return AccessToken
     */
    fun createAccessToken(userId: String, validUntil: OffsetDateTime): AccessToken {
        val response = apiService.put(
            "api/users/$userId/accesstokens", JsonSerializer.toJson(
                mapOf(
                    "valid_until" to OffsetDateTimeAdapter.toJson(validUntil),
                )
            )
        )

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a list of all access tokens for a xs2a.bank user
     *
     * @param userId id of user
     */
    fun listAccessTokens(userId: String): AccessTokenList {
        val response = apiService.get("api/users/$userId/accesstokens")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a specific accesstoken for a xs2a.api bank user
     * @param userId The user-id for the user to retrieve a specific accesstoken for.
     * @param tokenId ID of the accesstoken to get.
     * @return AccessToken
     */
    fun getAccessToken(userId: String, tokenId: String): AccessToken {
        val response = apiService.get("api/users/$userId/accesstokens/$tokenId")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Refresh an accesstoken
     * @param userId The user-id for the user to refresh a specific accesstoken for.
     * @param tokenId ID of the accesstoken to refresh.
     * @param validUntil The accesstoken is valid until the given date (Format: YYYY-MM-DD hh:mm:ss).
     * @return AccessToken
     */
    fun refreshAccessToken(userId: String, tokenId: String, validUntil: OffsetDateTime): AccessToken {
        val response = apiService.patch(
            "api/users/$userId/accesstokens/$tokenId", JsonSerializer.toJson(
                mapOf(
                    "valid_until" to validUntil,
                )
            )
        )

        return JsonSerializer.parseJson(response)
    }

    /**
     * Delete an accesstoken
     * @param userId The user-id for the user to delete a specific accesstoken for.
     * @param tokenId ID of the accesstoken to delete.
     * @return String
     */
    fun deleteAccessToken(userId: String, tokenId: String): String {
        return apiService.delete("api/users/$userId/accesstokens/$tokenId").use { it.readUtf8() }
    }

    /**
     * Get a list of all xs2a.bank users
     *
     * @param per_page Items per page (optional)
     * @param page Which page to display (optional)
     */
    fun list(
        per_page: Int = 15,
        page: Int = 1,
    ): BankUserList {
        val response = apiService.get(
            "api/users", mutableMapOf(
                "per_page" to per_page.toString(),
                "page" to page.toString(),
            )
        )

        return JsonSerializer.parseJson(response)
    }
}