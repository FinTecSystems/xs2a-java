package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.blacklist.BlacklistAdd
import com.fintecsystems.xs2a.java.models.blacklist.BlacklistObject

class BlacklistService(
    apiKey: String
) : ServiceBase(apiKey) {

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