package com.fintecsystems.xs2a.java.helper

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.temporal.ChronoField

object LocalDateTimeAdapter {

    private val dateFormatter: DateTimeFormatter =
        DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd[[ ]['T'][HH][:mm][:ss][.SSSSSS]['Z']]")
            .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
            .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
            .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
            .toFormatter()

    @FromJson
    fun fromJson(string: String): LocalDateTime? =
        if (string.isNotEmpty()) LocalDateTime.parse(string, dateFormatter) else null

    @ToJson
    fun toJson(localDateTime: LocalDateTime): String = localDateTime.format(dateFormatter)
}

object LocalDateAdapter {
    private val dateFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    @FromJson
    fun fromJson(string: String): LocalDate? =
        if (string.isNotEmpty() && string != "0000-00-00") LocalDate.parse(string, dateFormatter) else null

    @ToJson
    fun toJson(localDate: LocalDate): String = localDate.format(dateFormatter)
}
