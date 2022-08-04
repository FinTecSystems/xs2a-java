package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.exceptions.XS2AException
import okhttp3.*
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request.*
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException


class ApiService(
    private val apiKey: String,
    private val endpointVersion: String = "v1",
    private val client: OkHttpClient = OkHttpClient()
) {
    private val basePath = "https://api.xs2a.com/$endpointVersion"
    private val mediaType: MediaType = "application/json; charset=utf-8".toMediaType()

    @Throws(IOException::class)
    fun post(path: String, jsonString: String = ""): String {
        val body = jsonString.toRequestBody(mediaType)
        val request = constructRequest(path) { it.post(body) }

        return processResponse(request)
    }

    @Throws(IOException::class)
    fun put(path: String, jsonString: String = ""): String {
        val body = jsonString.toRequestBody(mediaType)
        val request = constructRequest(path) { it.put(body) }

        return processResponse(request)
    }

    @Throws(IOException::class)
    fun patch(path: String, jsonString: String = ""): String {
        val body = jsonString.toRequestBody(mediaType)
        val request = constructRequest(path) { it.patch(body) }

        return processResponse(request)
    }

    @Throws(IOException::class)
    fun get(path: String, queryParameters: MutableMap<String, Any?> = mutableMapOf()): String {
        /* Remove all key-value pairs where the value is null */
        queryParameters.values.removeAll(sequenceOf(null))
        val urlToRequest: HttpUrl = HttpUrl.Builder()
            .scheme("https")
            .host("api.xs2a.com")
            .addPathSegment(endpointVersion)
            .addEncodedPathSegments(path)
            .apply {
                queryParameters.forEach { (k, v) ->
                    addQueryParameter(k, v.toString())
                }
            }
            .build()

        val request = constructRequest(urlToRequest) { it.get() }

        return processResponse(request)
    }

    @Throws(IOException::class)
    fun delete(path: String): String {
        val request = constructRequest(path) { it.delete() }

        return processResponse(request)
    }

    private fun executeRequest(request: Request) = client.newCall(request).execute()

    private fun constructRequest(
        path: String,
        middleware: (Builder) -> Builder = { it }
    ) = constructRequest("$basePath/$path".toHttpUrl(), middleware)

    private fun constructRequest(
        url: HttpUrl,
        middleware: (Builder) -> Builder = { it }
    ) = Builder()
        .url(url)
        .addHeader("Authorization", Credentials.basic("api", apiKey))
        .let { middleware(it) }
        .build()

    private fun processResponse(request: Request) = processResponse(executeRequest(request))

    @Throws(IOException::class)
    private fun processResponse(response: Response) = response.use {
        when {
            it.isSuccessful -> it.body!!.string()
            else -> throw XS2AException(
                it.body?.string(),
                it.code
            )
        }
    }
}