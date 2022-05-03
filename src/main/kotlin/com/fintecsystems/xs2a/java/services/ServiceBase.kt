package com.fintecsystems.xs2a.java.services

abstract class ServiceBase(
    apiKey: String,
    endpointVersion: String = "v1"
) {
    protected val apiService = ApiService(apiKey, endpointVersion)
}