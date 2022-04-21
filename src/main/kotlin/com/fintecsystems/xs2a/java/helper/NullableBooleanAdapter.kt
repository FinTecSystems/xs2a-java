package com.fintecsystems.xs2a.java.helper

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson

object NullableBooleanAdapter {
    @FromJson
    @NullableBoolean
    fun fromJson(fieldToParse: Any): Boolean? = BooleanAdapter.fromJson(fieldToParse)

    @ToJson
    fun toJson(@NullableBoolean booleanToSerialize: Boolean?) = booleanToSerialize.toString()
}