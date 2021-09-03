package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.WhitelistObject
import com.fintecsystems.xs2a.java.models.WhitelistAdd

class WhitelistService(
    private val apiKey: String
) {

    fun add(body: WhitelistAdd): WhitelistObject {
        val response = ApiService(apiKey).post("whitelist", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }

    fun get(id: String): WhitelistObject {
        val response = ApiService(apiKey).get("whitelist/$id")

        return JsonSerializer.parseJson(response)
    }

    fun delete(id: String): WhitelistObject {
        val response = ApiService(apiKey).delete("whitelist/$id")

        return JsonSerializer.parseJson(response)
    }
}