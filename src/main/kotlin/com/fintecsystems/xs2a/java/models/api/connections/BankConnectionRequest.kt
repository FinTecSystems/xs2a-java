package com.fintecsystems.xs2a.java.models.api.connections

import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.Language
import com.squareup.moshi.Json

/**
 *
 * @param syncMode The mode, how to sync the bank connection. full, shared or none.
 * @param bic The BIC of the bank, if known already.
 * @param countryId The country ID of the bank, if known already.
 * @param days Number of days for collecting turnovers from bank account
 * @param limitDays Number of days to limit the resulting account. After every sync the account will be limited to that amount of days.
 * @param accountSelection Mode of account selection. If \"all\" is given, all available accounts from this bankconnection will be used. If \"single\"/\"multi\" is given, the customer can pick single/multiple accounts from this connection which will be used.
 * @param language Desired language in which the customer interface will be rendered with.
 * @param fintsProductId The fints product ID can be enclosed in the initial request. If you have an eIDAS certificate, then you have to send it with every request.
 */

data class BankConnectionRequest (
    /* The mode, how to sync the bank connection. full, shared or none. */
    @Json(name = "sync_mode")
    var syncMode: SyncMode? = null,
    /* The BIC of the bank, if known already. */
    @Json(name = "bic")
    var bic: String? = null,
    /* The country ID of the bank, if known already. */
    @Json(name = "country_id")
    var countryId: CountryId? = null,
    /* Number of days for collecting turnovers from bank account */
    @Json(name = "days")
    var days: Int? = null,
    /* Number of days to limit the resulting account. After every sync the account will be limited to that amount of days. */
    @Json(name = "limit_days")
    var limitDays: Int? = null,
    /* Mode of account selection. If \"all\" is given, all available accounts from this bankconnection will be used. If \"single\"/\"multi\" is given, the customer can pick single/multiple accounts from this connection which will be used. */
    @Json(name = "account_selection")
    var accountSelection: AccountSelection? = null,
    /* Desired language in which the customer interface will be rendered with. */
    @Json(name = "language")
    var language: Language? = null,
    /* The fints product ID can be enclosed in the initial request. If you have an eIDAS certificate, then you have to send it with every request. */
    @Json(name = "fints_product_id")
    var fintsProductId: String? = null,
)