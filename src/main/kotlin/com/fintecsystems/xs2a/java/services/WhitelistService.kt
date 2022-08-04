package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.whitelist.WhitelistObject
import com.fintecsystems.xs2a.java.models.whitelist.WhitelistAdd
import okhttp3.OkHttpClient

@Suppress("unused")
class WhitelistService(
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

    fun add(body: WhitelistAdd): WhitelistObject {
        val response = apiService.post("whitelist", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }

    fun get(id: String): WhitelistObject {
        val response = apiService.get("whitelist/$id")

        return JsonSerializer.parseJson(response)
    }

    fun delete(id: String): WhitelistObject {
        val response = apiService.delete("whitelist/$id")

        return JsonSerializer.parseJson(response)
    }
}