package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.blacklist.BlacklistAdd
import com.fintecsystems.xs2a.java.models.blacklist.BlacklistObject
import okhttp3.OkHttpClient

class BlacklistService(
    apiKey: String,
    client: OkHttpClient,
) : ServiceBase(apiKey, client = client) {

    constructor(apiKey: String) : this(apiKey, OkHttpClient());

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