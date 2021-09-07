
package com.fintecsystems.xs2a.java.models

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
    /* Can be IBAN or other Identifier of the account */
    @Json(name = "identifier")
    @JvmField
    val identifier: String,
    /* Holder name */
    @Json(name = "holder")
    @JvmField
    val holder: String,
    @Json(name = "description")
    @JvmField
    val description: String,
    /* IBAN */
    @Json(name = "iban")
    @JvmField
    val iban: String,
    /* BIC */
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    /* Account number */
    @Json(name = "account_number")
    @JvmField
    val accountNumber: String? = null,
    /* Bank code */
    @Json(name = "bank_code")
    @JvmField
    val bankCode: String,
    /* Bank name */
    @Json(name = "bank_name")
    @JvmField
    val bankName: String,
    /* Country Id */
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
    /* Joint Account */
    @Json(name = "joint_account")
    @JvmField
    val jointAccount: String,
    @Json(name = "transaction_possible")
    @JvmField
    val transactionPossible: String,
    /* Account type */
    @Json(name = "account_type")
    @JvmField
    val accountType: String,
    /* Balance */
    @Json(name = "balance")
    @JvmField
    val balance: Float,
    /* Available */
    @Json(name = "available")
    @JvmField
    val available: Float,
    /* Limit */
    @Json(name = "limit")
    @JvmField
    val limit: Float,
    /* Currency */
    @Json(name = "currency_id")
    @JvmField
    val currencyId: CurrencyId? = null,
    /* Turnover days */
    @Json(name = "turnover_days")
    @JvmField
    val turnoverDays: Int,
    /* Turnover available days */
    @Json(name = "turnover_available_days")
    @JvmField
    val turnoverAvailableDays: Int,
    /* Turnover count */
    @Json(name = "turnover_count")
    @JvmField
    val turnoverCount: Int,
    /* Average account usage */
    @Json(name = "average_account_usage")
    @JvmField
    val averageAccountUsage: String,
    /* Overdraft days */
    @Json(name = "overdraft_days")
    @JvmField
    val overdraftDays: Int,
    /* Overdraft limit days */
    @Json(name = "overdraft_limit_days")
    @JvmField
    val overdraftLimitDays: Int,
    @Json(name = "completeness")
    @JvmField
    val completeness: UserAccountsObjectCompleteness,
    @Json(name = "account_data_available")
    @JvmField
    val accountDataAvailable: String
)

