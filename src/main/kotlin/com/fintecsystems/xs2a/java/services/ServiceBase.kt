package com.fintecsystems.xs2a.java.services

import okhttp3.OkHttpClient

abstract class ServiceBase(
    apiKey: String,
    endpointVersion: String = "v1",
    client: OkHttpClient = OkHttpClient(),
    backendUrl: String = "https://api.xs2a.com"
) {
    protected val apiService = ApiService(apiKey, endpointVersion, client, backendUrl)
}