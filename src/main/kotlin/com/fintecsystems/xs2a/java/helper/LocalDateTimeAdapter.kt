package com.fintecsystems.xs2a.java.helper

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.time.Instant
import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.temporal.ChronoField

object OffsetDateTimeAdapter {

    private val dateFormatter: DateTimeFormatter =
        DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd[[ ]['T'][HH][:mm][:ss][.SSSSSS]['Z']]")
            .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
            .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
            .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
            .parseDefaulting(
                ChronoField.OFFSET_SECONDS,
                // This is needed because of Summer-/Winter-time in germany.
                ZoneId.of("Europe/Berlin").rules.getOffset(Instant.now()).totalSeconds.toLong()
            )
            .toFormatter()

    @FromJson
    fun fromJson(string: String): OffsetDateTime? =
        if (string.isNotEmpty()) OffsetDateTime.parse(string, dateFormatter) else null

    @ToJson
    fun toJson(OffsetDateTime: OffsetDateTime): String = OffsetDateTime.format(dateFormatter)
}

