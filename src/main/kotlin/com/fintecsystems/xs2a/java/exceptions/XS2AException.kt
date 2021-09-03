package com.fintecsystems.xs2a.java.exceptions

import okio.IOException

class XS2AException(
    message: String?,
    private val statusCode: Int?
) : IOException(message) {
    fun getStatusCode() = statusCode
}
