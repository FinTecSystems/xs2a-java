package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param accountDetails
 * @param otherAccounts
 * @param creditCards
 * @param days The limit of turnover days for this check
 * @param allAccounts Shows the chosen option, with all accounts or not
 * @param createdAt Creation date of the object
 * @param `object` Object type, in this case a xs2a_account_status_check
 */

data class Xs2aAccountStatusCheckResponse(
    @Json(name = "account_details")
    var accountDetails: List<UserAccountsObject>,
    @Json(name = "other_accounts")
    var otherAccounts: List<OtherAccountsObject>,
    @Json(name = "credit_cards")
    var creditCards: List<CreditCardsObject>,
    /* The limit of turnover days for this check */
    @Json(name = "days")
    var days: Int? = null,
    /* Shows the chosen option, with all accounts or not */
    @Json(name = "all_accounts")
    var allAccounts: Boolean,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: LocalDateTime,
    /* Object type, in this case a xs2a_account_status_check */
    @Json(name = "object")
    var `object`: String
)

