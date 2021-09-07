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
    @JvmField
    val accountDetails: List<UserAccountsObject>,
    @Json(name = "other_accounts")
    @JvmField
    val otherAccounts: List<OtherAccountsObject>,
    @Json(name = "credit_cards")
    @JvmField
    val creditCards: List<CreditCardsObject>,
    /* The limit of turnover days for this check */
    @Json(name = "days")
    @JvmField
    val days: Int? = null,
    /* Shows the chosen option, with all accounts or not */
    @Json(name = "all_accounts")
    @JvmField
    val allAccounts: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime,
    /* Object type, in this case a xs2a_account_status_check */
    @Json(name = "object")
    @JvmField
    val `object`: String
)

