
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param collectionCount Number of all bookings to debt collection agencies / departments / lawyers.
 * @param collectionAmount Total of all bookings to debt collection agencies / departments.
 * @param collectionOfficeCount Number of different counterholders
 */

data class EncashmentObject (
    /* Number of all bookings to debt collection agencies / departments / lawyers. */
    @Json(name = "collection_count")
    var collectionCount: Int,
    /* Total of all bookings to debt collection agencies / departments. */
    @Json(name = "collection_amount")
    var collectionAmount: Float,
    /* Number of different counterholders */
    @Json(name = "collection_office_count")
    var collectionOfficeCount: Int
)

