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
    val id: String,
    /* Id of the originating BankConnection. */
    @Json(name = "bank_connection_id")
    val bankConnectionId: String,
    /* Name of the account holder as reported by the bank */
    @Json(name = "holder")
    val holder: String,
    /* IBAN of the bank account */
    @Json(name = "iban")
    val iban: String,
    /* Description of the bank account */
    @Json(name = "description")
    val description: String,
    /* BIC of the bank account */
    @Json(name = "bic")
    val bic: String? = null,
    /* Number of the account */
    @Json(name = "account_number")
    val accountNumber: String? = null,
    /* bank code of the bank */
    @Json(name = "bank_code")
    val bankCode: String,
    /* name of the bank */
    @Json(name = "bank_name")
    val bankName: String,
    /* 2 letter country ID */
    @Json(name = "country_id")
    val countryId: CountryId? = null,
    /* The type of the bank of the bank connection */
    @Json(name = "type")
    val type: BankAccountType,
    /* Indicates whether this account has more than one owner. */
    @Json(name = "joint_account")
    val jointAccount: Boolean,
    /* Indicates whether this account places payments. */
    @Json(name = "transaction_possible")
    val transactionPossible: Boolean,
    /* Date of creation */
    @Json(name = "created_at")
    val createdAt: LocalDateTime,
    /* The value bank_account */
    @Json(name = "object")
    val `object`: String
) {
    enum class BankAccountType(val value: String) {
        @Json(name = "giro")
        GIRO("giro"),

        @Json(name = "creditcard")
        CREDITCARD("creditcard"),

        @Json(name = "savings")
        SAVINGS("savings"),

        @Json(name = "loan")
        LOAN("loan"),

        @Json(name = "securities")
        SECURITIES("securities"),

        @Json(name = "wallet")
        WALLET("wallet"),

        @Json(name = "other")
        OTHER("other");
    }
}
