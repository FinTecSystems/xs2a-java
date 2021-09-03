package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.*

class BlacklistService(
    private val apiKey: String
) {

    fun add(body: BlacklistAdd): BlacklistObject {
        val response = ApiService(apiKey).post("blacklist", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }

    fun get(id: String): BlacklistObject {
        val response = ApiService(apiKey).get("blacklist/$id")

        return JsonSerializer.parseJson(response)
    }

    fun delete(id: String): BlacklistObject {
        val response = ApiService(apiKey).delete("blacklist/$id")

        return JsonSerializer.parseJson(response)
    }
}