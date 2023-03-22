
package com.fintecsystems.xs2a.java.models.risk

import com.fintecsystems.xs2a.java.models.common.AccountType
import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json

/**
 * 
 * @param identifier Can be IBAN or other Identifier of the account
 * @param holder Holder name
 * @param description 
 * @param iban IBAN
 * @param bic BIC
 * @param accountNumber Account number
 * @param bankCode Bank code
 * @param bankName Bank name
 * @param countryId Country Id
 * @param jointAccount Joint Account
 * @param transactionPossible 
 * @param accountType Account type
 * @param balance Balance
 * @param available Available
 * @param limit Limit
 * @param currencyId Currency
 * @param turnoverDays Turnover days
 * @param turnoverAvailableDays Turnover available days
 * @param turnoverCount Turnover count
 * @param averageAccountUsage Average account usage
 * @param overdraftDays Overdraft days
 * @param overdraftLimitDays Overdraft limit days
 * @param completeness 
 * @param accountDataAvailable 
 */

data class UserAccountsObject (
    @Json(name = "identifier")
    var identifier: String,
    @Json(name = "holder")
    var holder: String,
    @Json(name = "description")
    var description: String,
    @Json(name = "iban")
    var iban: String,
    @Json(name = "bic")
    var bic: String? = null,
    @Json(name = "account_number")
    var accountNumber: String? = null,
    @Json(name = "bank_code")
    var bankCode: String,
    @Json(name = "bank_name")
    var bankName: String,
    @Json(name = "country_id")
    var countryId: CountryId? = null,
    @Json(name = "joint_account")
    var jointAccount: Boolean,
    @Json(name = "transaction_possible")
    var transactionPossible: Boolean,
    @Json(name = "account_type")
    var accountType: AccountType,
    @Json(name = "balance")
    var balance: Float? = null,
    @Json(name = "available")
    var available: Float? = null,
    @Json(name = "limit")
    var limit: Float? = null,
    @Json(name = "currency_id")
    var currencyId: CurrencyId,
    @Json(name = "turnover_days")
    var turnoverDays: Int,
    @Json(name = "turnover_available_days")
    var turnoverAvailableDays: Int,
    @Json(name = "turnover_count")
    var turnoverCount: Int,
    @Json(name = "average_account_usage")
    var averageAccountUsage: String,
    @Json(name = "overdraft_days")
    var overdraftDays: Int,
    @Json(name = "overdraft_limit_days")
    var overdraftLimitDays: Int,
    @Json(name = "completeness")
    var completeness: UserAccountsObjectCompleteness,
    @Json(name = "account_data_available")
    var accountDataAvailable: String
)

