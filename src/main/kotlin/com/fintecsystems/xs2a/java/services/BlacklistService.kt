package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.blacklist.BlacklistAdd
import com.fintecsystems.xs2a.java.models.blacklist.BlacklistObject
import okhttp3.OkHttpClient

@Suppress("unused")
class BlacklistService(
    apiKey: String,
    client: OkHttpClient,
    backendUrl: String = "https://api.xs2a.com"
) : ServiceBase(
    apiKey,
    client = client,
    backendUrl = backendUrl
) {

    constructor(apiKey: String) : this(apiKey, OkHttpClient())

    constructor(apiKey: String, backendUrl: String) : this(apiKey, OkHttpClient(), backendUrl)

    fun add(body: BlacklistAdd): BlacklistObject {
        val response = apiService.post("blacklist", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }

    fun get(id: String): BlacklistObject {
        val response = apiService.get("blacklist/$id")

        return JsonSerializer.parseJson(response)
    }

    fun delete(id: String): BlacklistObject {
        val response = apiService.delete("blacklist/$id")

        return JsonSerializer.parseJson(response)
    }
}