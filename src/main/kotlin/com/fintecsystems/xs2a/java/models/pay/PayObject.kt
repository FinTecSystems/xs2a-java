
package com.fintecsystems.xs2a.java.models.pay


import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.squareup.moshi.Json

/**
 * 
 * @param id Transaction id
 * @param transaction Internal XS2A transaction id. This id will be the same for the whole transaction
 * @param senderHolder Account holder of the sender account
 * @param senderIban IBAN of the sender account
 * @param senderBic BIC of the sender account
 * @param senderBankName Name of the sender bank
 * @param senderCountryId Two letter country code id, e.g. AT, CH, DE or the sender account
 * @param recipientHolder Account holder of the recipient account
 * @param recipientIban IBAN of the recipient account
 * @param recipientBic BIC of the recipient account
 * @param recipientBankName Name of the recipient bank
 * @param recipientCountryId Two letter country code id, e.g. AT, CH, DE or the recipient account
 * @param purpose Purpose of transfer
 * @param amount Amount to transfer
 * @param currencyId Currency id of amount, e.g. 'EUR'
 * @param testmode Indicates whether or not it is a test transaction
 * @param paymentStatus Payment status of the transaction, values NONE, RECEIVED, LOSS
 * @param metadata Custom data will be returned unchanged. If no data was submitted, this field will be null
 * @param merchantId Data will be returned unchanged
 */

data class PayObject (
    @Json(name = "id")
    var id: String,
    @Json(name = "transaction")
    var transaction: String,
    @Json(name = "sender_holder")
    var senderHolder: String? = null,
    @Json(name = "sender_iban")
    var senderIban: String? = null,
    @Json(name = "sender_bic")
    var senderBic: String? = null,
    @Json(name = "sender_bank_name")
    var senderBankName: String? = null,
    @Json(name = "sender_country_id")
    var senderCountryId: CountryId? = null,
    @Json(name = "recipient_holder")
    var recipientHolder: String? = null,
    @Json(name = "recipient_iban")
    var recipientIban: String? = null,
    @Json(name = "recipient_bic")
    var recipientBic: String? = null,
    @Json(name = "recipient_bank_name")
    var recipientBankName: String? = null,
    @Json(name = "recipient_country_id")
    var recipientCountryId: CountryId? = null,
    @Json(name = "purpose")
    var purpose: String,
    @Json(name = "amount")
    var amount: Float,
    @Json(name = "currency_id")
    var currencyId: CurrencyId,
    @Json(name = "testmode")
    var testmode: Boolean,
    @Json(name = "payment_status")
    var paymentStatus: PaymentStatus,
    @Json(name = "metadata")
    var metadata: Map<String, Any>? = null,
    @Json(name = "merchant_id")
    var merchantId: String? = null,
)
