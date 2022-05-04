package com.fintecsystems.xs2a.java.models.risk.checks

import com.fintecsystems.xs2a.java.models.risk.CreditCardsObject
import com.fintecsystems.xs2a.java.models.risk.OtherAccountsObject
import com.fintecsystems.xs2a.java.models.risk.UserAccountsObject
import com.squareup.moshi.Json
import java.time.OffsetDateTime

/**
 *
 * @param accountDetails
 * @param otherAccounts
 * @param creditCards
 * @param days The limit of turnover days for this check
 * @param allAccounts Shows the chosen option, with all accounts or not
 * @param createdAt Creation date of the object
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
    var createdAt: OffsetDateTime,
)

