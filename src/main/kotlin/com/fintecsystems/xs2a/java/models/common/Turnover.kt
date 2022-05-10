package com.fintecsystems.xs2a.java.models.common


import com.fintecsystems.xs2a.java.helper.OffsetDateTimeAdapter
import com.fintecsystems.xs2a.java.models.risk.Category
import com.squareup.moshi.FromJson
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param id ID if feature is enabled always null otherwise.
 * @param bookingDate The booking date.
 * @param amount The turnover amount. Negative for expenditures.
 * @param currency The two-letter currency ID, e.g. 'EUR'
 * @param purpose A string array of purpose lines. The contents vary from bank to bank.
 * @param counterIban The counter IBAN of the booking. This is not always present.
 * @param counterBic The counter BIC of the booking. This is not always present.
 * @param counterHolder The counter holder of the booking. This is not always present.
 * @param prebooked True, if the turnover has not been booked yet
 * @param canceled True, if the turnover has been canceled.
 * @param tags An array of strings of tags for this turnover. Find all possible tags here: https://manage.xs2a.com/documentation/tags
 * @param categoryId The ID of the category found for this turnover.  The structure of this `category_id` string is hierarchical, meaning,  the more numbers there are, the more detailed the category is. For example, while `K.1` means \"expenses for wholesale and retail trade\", some  turnovers might be categorized more detailed as `K.1.1` (\"expenses in retail stores\"), or even as `K.1.1.1` (\"groceries full-range trader\"). You can find the complete list of categories [here](https://manage.xs2a.com/documentation/categories).  **NOTE**: As new categories are introduced and the categorization itself is improved constantly, it is possible that  the same turnover can be categorized with a different (more detailed) `category_id` at a future point in time. You should develop your application in such a way,  that, for example, if your logic relies on something happening when a `category_id` is `K.1.1`, but you get `K.1.2` for which no logic is in place (because it might be  a new `category_id` or the turnover is now categorized more detailed), **you should always fall back to the next higher level category**, in this case `K.1`. This way, your logic can  still handle the turnover based on a more general category, while not throwing an error.
 * @param creditorId The ID of the creditor.
 * @param new True, if this turnover is new since the last sync.
 */

data class Turnover(
    @Json(name = "id")
    var id: String? = null,
    /* The booking date. */
    @Json(name = "booking_date")
    var bookingDate: OffsetDateTime,
    /* The turnover amount. Negative for expenditures. */
    @Json(name = "amount")
    var amount: Float,
    /* The two-letter currency ID, e.g. 'EUR' */
    @Json(name = "currency")
    var currency: CurrencyId,
    /* A string array of purpose lines. The contents vary from bank to bank. */
    @Json(name = "purpose")
    var purpose: List<String>,
    /* The counter IBAN of the booking. This is not always present. */
    @Json(name = "counter_iban")
    var counterIban: String? = null,
    /* The counter BIC of the booking. This is not always present. */
    @Json(name = "counter_bic")
    var counterBic: String? = null,
    /* The counter holder of the booking. This is not always present. */
    @Json(name = "counter_holder")
    var counterHolder: String? = null,
    /* True, if the turnover has not been booked yet */
    @Json(name = "prebooked")
    var prebooked: Boolean? = null,
    /* True, if the turnover has been canceled. */
    @Json(name = "canceled")
    var canceled: Boolean? = null,
    /* An array of strings of tags for this turnover. Find all possible tags here: https://manage.xs2a.com/documentation/tags */
    @Json(name = "tags")
    var tags: List<Tag>? = null,
    /* The ID of the category found for this turnover.  The structure of this `category_id` string is hierarchical, meaning,  the more numbers there are, the more detailed the category is. For example, while `K.1` means \"expenses for wholesale and retail trade\", some  turnovers might be categorized more detailed as `K.1.1` (\"expenses in retail stores\"), or even as `K.1.1.1` (\"groceries full-range trader\"). You can find the complete list of categories [here](https://manage.xs2a.com/documentation/categories).  **NOTE**: As new categories are introduced and the categorization itself is improved constantly, it is possible that  the same turnover can be categorized with a different (more detailed) `category_id` at a future point in time. You should develop your application in such a way,  that, for example, if your logic relies on something happening when a `category_id` is `K.1.1`, but you get `K.1.2` for which no logic is in place (because it might be  a new `category_id` or the turnover is now categorized more detailed), **you should always fall back to the next higher level category**, in this case `K.1`. This way, your logic can  still handle the turnover based on a more general category, while not throwing an error. */
    @Json(name = "category_id")
    var categoryId: Category? = null,
    /* The ID of the creditor. */
    @Json(name = "creditor_id")
    var creditorId: String? = null,
    /* True, if this turnover is new since the last sync. */
    @Json(name = "new")
    var new: Boolean? = null,
) {
    companion object Adapter {
        @FromJson
        fun fromJson(data: Map<String, Any>): Turnover {
            @Suppress("UNCHECKED_CAST")
            return Turnover(
                id = data["id"] as String?,
                bookingDate = OffsetDateTimeAdapter.fromJson(data["booking_date"] as String)!!,
                amount = (data["amount"] as Double).toFloat(),
                currency = CurrencyId.valueOf((data["currency"] ?: data["currency_id"]) as String),
                purpose = data["purpose"] as List<String>,
                counterIban = data["counter_iban"] as String?,
                counterBic = data["counter_bic"] as String?,
                counterHolder = data["counter_holder"] as String?,
                prebooked = data["prebooked"] as Boolean?,
                tags = data["tags"] as List<Tag>?,
                categoryId = data["category_id"] as Category?,
                creditorId = data["creditor_id"] as String?,
                new = data["new"] as Boolean?,
            )
        }
    }
}

