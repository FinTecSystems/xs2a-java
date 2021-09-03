package com.fintecsystems.xs2a.java.helper

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class NullableBoolean

object NullableBooleanAdapter {
    @FromJson
    @NullableBoolean
    fun fromJson(fieldToParse: Any): Boolean? = BooleanAdapter.fromJson(fieldToParse)

    @ToJson
    fun toJson(@NullableBoolean booleanToSerialize: Boolean?) = booleanToSerialize.toString()
}

object BooleanAdapter {
    @FromJson
    fun fromJson(fieldToParse: Any): Boolean = when (fieldToParse) {
        is String -> fieldToParse.toBooleanStrictOrNull() ?: (fieldToParse.toInt() == 1)
        is Boolean -> fieldToParse
        is Int -> fieldToParse == 1
        else -> false
    }

    @ToJson
    fun toJson(booleanToSerialize: Boolean) = booleanToSerialize.toString()
}
