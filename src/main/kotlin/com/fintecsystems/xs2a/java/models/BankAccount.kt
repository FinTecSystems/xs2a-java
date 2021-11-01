package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param id Bank Account ID
 * @param bankConnectionId Id of the originating BankConnection.
 * @param holder Name of the account holder as reported by the bank
 * @param iban IBAN of the bank account
 * @param description Description of the bank account
 * @param bic BIC of the bank account
 * @param accountNumber Number of the account
 * @param bankCode bank code of the bank
 * @param bankName name of the bank
 * @param countryId 2 letter country ID
 * @param type The type of the bank of the bank connection
 * @param jointAccount Indicates whether this account has more than one owner.
 * @param transactionPossible Indicates whether this account places payments.
 * @param createdAt Date of creation
 * @param `object` The value bank_account
 */

data class BankAccount(
    /* Bank Account ID */
    @Json(name = "id")
    var id: String,
    /* Id of the originating BankConnection. */
    @Json(name = "bank_connection_id")
    var bankConnectionId: String,
    /* Name of the account holder as reported by the bank */
    @Json(name = "holder")
    var holder: String,
    /* IBAN of the bank account */
    @Json(name = "iban")
    var iban: String,
    /* Description of the bank account */
    @Json(name = "description")
    var description: String,
    /* BIC of the bank account */
    @Json(name = "bic")
    var bic: String? = null,
    /* Number of the account */
    @Json(name = "account_number")
    var accountNumber: String? = null,
    /* bank code of the bank */
    @Json(name = "bank_code")
    var bankCode: String,
    /* name of the bank */
    @Json(name = "bank_name")
    var bankName: String,
    /* 2 letter country ID */
    @Json(name = "country_id")
    var countryId: CountryId? = null,
    /* The type of the bank of the bank connection */
    @Json(name = "type")
    var type: AccountType,
    /* Indicates whether this account has more than one owner. */
    @Json(name = "joint_account")
    var jointAccount: Boolean,
    /* Indicates whether this account places payments. */
    @Json(name = "transaction_possible")
    var transactionPossible: Boolean,
    /* Date of creation */
    @Json(name = "created_at")
    var createdAt: LocalDateTime,
    /* The value bank_account */
    @Json(name = "object")
    var `object`: String
)
