package com.fintecsystems.xs2a.java.models.risk

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param standingOrders
 * @param `object` Object type, in this case a  xs2a_standing_orders
 * @param createdAt Creation date of the object
 */

data class Xs2aStandingOrdersCheckResponse(
    @Json(name = "standing_orders")
    var standingOrders: List<Xs2aStandingOrdersCheckResponseStandingOrders>,
    /* Object type, in this case a  xs2a_standing_orders */
    @Json(name = "object")
    var `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: LocalDateTime
)

