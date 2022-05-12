package com.fintecsystems.xs2a.java.helper

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonQualifier

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class NullableBoolean

object BooleanAdapter {
    @FromJson
    fun fromJson(fieldToParse: Any): Boolean = when (fieldToParse) {
        is String -> fieldToParse.toBooleanStrictOrNull() ?: (fieldToParse.toInt() == 1)
        is Boolean -> fieldToParse
        is Int -> fieldToParse == 1
        else -> false
    }
}
