package com.fintecsystems.xs2a.java.services

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

abstract class ServiceBase(
    apiKey: String,
    endpointVersion: String = "v1",
    client: OkHttpClient = defaultClient,
    backendUrl: String = defaultBackendUrl
) {
    protected val apiService = ApiService(apiKey, endpointVersion, client, backendUrl)

    protected companion object {
        const val defaultBackendUrl = "https://api.xs2a.com"
        val defaultClient: OkHttpClient by lazy {
            OkHttpClient.Builder()
                .connectTimeout(0, TimeUnit.SECONDS)
                .writeTimeout(0, TimeUnit.SECONDS)
                .readTimeout(0, TimeUnit.SECONDS)
                .build()
        }
    }
}