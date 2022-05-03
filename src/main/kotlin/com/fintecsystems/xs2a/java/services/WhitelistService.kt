package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.whitelist.WhitelistObject
import com.fintecsystems.xs2a.java.models.whitelist.WhitelistAdd

class WhitelistService(
    apiKey: String
) : ServiceBase(apiKey) {

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