
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * The polling attribute indicates whether the transaction status needs to be polled. This is usually the case when your customer has to approve a payment via the bankâ€™s mobile app.  If polling is an empty object no action is required. If interval is set you need to POST a request every interval milliseconds to the wizard API endpoint providing the wizard session key as well as the parameter action=poll until you receive the finish response. 
 * @param interval The inverval in milliseconds
 */

data class Polling (
    /* The interval in milliseconds */
    @Json(name = "interval")
    val interval: Int? = null,
)

