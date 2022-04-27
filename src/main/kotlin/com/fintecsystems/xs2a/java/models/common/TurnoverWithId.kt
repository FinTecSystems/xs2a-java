package com.fintecsystems.xs2a.java.models.common


import com.fintecsystems.xs2a.java.models.risk.Category
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 * Subclass of [Turnover], this class will be used if the required feature is activated on the backend.
 *
 * @param id The ID of the transaction.
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

class TurnoverWithId(
    @Json(name = "id")
    var id: String,
    bookingDate: OffsetDateTime,
    amount: Float,
    currency: CurrencyId? = null,
    purpose: List<String>,
    counterIban: String? = null,
    counterBic: String? = null,
    counterHolder: String? = null,
    prebooked: Boolean? = null,
    canceled: Boolean? = null,
    tags: List<Tag>? = null,
    categoryId: Category? = null,
    creditorId: String? = null,
    new: Boolean? = null,
) : Turnover(
    bookingDate,
    amount,
    currency,
    purpose,
    counterIban,
    counterBic,
    counterHolder,
    prebooked,
    canceled,
    tags,
    categoryId,
    creditorId,
    new
)

