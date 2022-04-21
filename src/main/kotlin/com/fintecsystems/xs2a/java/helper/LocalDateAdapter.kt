package com.fintecsystems.xs2a.java.helper

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.time.LocalDate
import java.time.format.DateTimeFormatter

object LocalDateAdapter {
    private val dateFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    @FromJson
    fun fromJson(string: String): LocalDate? =
        if (string.isNotEmpty() && string != "0000-00-00") LocalDate.parse(string, dateFormatter) else null

    @ToJson
    fun toJson(localDate: LocalDate): String = localDate.format(dateFormatter)
}