package com.fintecsystems.xs2a.java.helper

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson
import java.time.Instant
import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatterBuilder
import java.time.temporal.ChronoField

/**
 * Annotation to mark that this [OffsetDateTime] only contains a Date and thus serializes in a date only format.
 */
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION, AnnotationTarget.TYPE)
@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class OffsetDate

@Suppress("unused")
object OffsetDateTimeAdapter {
    // This is needed because of Summer-/Winter-time in germany.
    private val offsetSeconds = ZoneId.of("Europe/Berlin").rules.getOffset(Instant.now()).totalSeconds.toLong()

    private val dateTimeFormatter: DateTimeFormatter =
        DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd[[ ]['T'][HH][:mm][:ss][.SSSSSS][XXXXX]]")
            .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
            .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
            .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
            .parseDefaulting(ChronoField.OFFSET_SECONDS, offsetSeconds)
            .toFormatter()

    private val dateFormatter: DateTimeFormatter =
        DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd")
            .toFormatter()

    @FromJson
    fun fromJson(string: String): OffsetDateTime? =
        if (string.isNotEmpty()) OffsetDateTime.parse(string, dateTimeFormatter) else null

    @ToJson
    fun toJson(OffsetDateTime: OffsetDateTime): String = OffsetDateTime.format(dateTimeFormatter)


    @FromJson
    @OffsetDate
    fun offsetDateFromJson(string: String): OffsetDateTime? =
        if (string.isNotEmpty() && string != "0000-00-00") fromJson(string) else null

    @ToJson
    fun offsetDateToJson(@OffsetDate OffsetDateTime: OffsetDateTime): String = OffsetDateTime.format(dateFormatter)
}

