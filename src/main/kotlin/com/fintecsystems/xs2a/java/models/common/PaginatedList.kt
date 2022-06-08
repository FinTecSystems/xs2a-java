package com.fintecsystems.xs2a.java.models.common

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.events.EventObject
import com.squareup.moshi.FromJson
import com.squareup.moshi.Json
import com.squareup.moshi.ToJson
import jdk.jfr.Event
import kotlin.reflect.typeOf

/**
 *
 * @param total Total number of results.
 * @param perPage Number of objects per page
 * @param currentPage Current page.
 * @param lastPage Last page, usually the total of available pages.
 * @param from Showing results from index element.
 * @param to Showing results to index element.
 * @param data
 */

data class PaginatedList<T>(
    @Json(name = "total")
    var total: Int,
    @Json(name = "per_page")
    var perPage: Int,
    @Json(name = "current_page")
    var currentPage: Int,
    @Json(name = "last_page")
    var lastPage: Int,
    @Json(name = "from")
    var from: Int,
    @Json(name = "to")
    var to: Int,
    @Json(name = "data")
    var data: List<T>
) {
    companion object Adapter {
        @FromJson
        inline fun <reified T> fromJson(data: Map<String, Any>): PaginatedList<T> {
            println("Was? ${data["data"]} ${data["data"]!!::class}")

            return PaginatedList(
                (data["total"] as Double).toInt(),
                (data["perPage"] as Double).toInt(),
                (data["currentPage"] as Double).toInt(),
                (data["lastPage"] as Double).toInt(),
                (data["from"] as Double).toInt(),
                (data["to"] as Double).toInt(),
                emptyList()
            )
        }

        @ToJson
        inline fun <reified T> toJson(value: PaginatedList<T>) = value.toString()
    }
}
