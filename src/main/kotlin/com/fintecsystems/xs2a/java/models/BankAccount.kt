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
    @JvmField
    val id: String,
    /* Id of the originating BankConnection. */
    @Json(name = "bank_connection_id")
    @JvmField
    val bankConnectionId: String,
    /* Name of the account holder as reported by the bank */
    @Json(name = "holder")
    @JvmField
    val holder: String,
    /* IBAN of the bank account */
    @Json(name = "iban")
    @JvmField
    val iban: String,
    /* Description of the bank account */
    @Json(name = "description")
    @JvmField
    val description: String,
    /* BIC of the bank account */
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    /* Number of the account */
    @Json(name = "account_number")
    @JvmField
    val accountNumber: String? = null,
    /* bank code of the bank */
    @Json(name = "bank_code")
    @JvmField
    val bankCode: String,
    /* name of the bank */
    @Json(name = "bank_name")
    @JvmField
    val bankName: String,
    /* 2 letter country ID */
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
    /* The type of the bank of the bank connection */
    @Json(name = "type")
    @JvmField
    val type: BankAccountType,
    /* Indicates whether this account has more than one owner. */
    @Json(name = "joint_account")
    @JvmField
    val jointAccount: Boolean,
    /* Indicates whether this account places payments. */
    @Json(name = "transaction_possible")
    @JvmField
    val transactionPossible: Boolean,
    /* Date of creation */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime,
    /* The value bank_account */
    @Json(name = "object")
    @JvmField
    val `object`: String
) {
    enum class BankAccountType(@JvmField
    val value: String) {
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

