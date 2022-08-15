
package com.fintecsystems.xs2a.java.models.pay

import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.CurrencyId
import com.fintecsystems.xs2a.java.models.common.EasyOnboarding
import com.fintecsystems.xs2a.java.models.common.Language
import com.squareup.moshi.Json

/**
 * 
 * @param amount The amount to be transferred (depending on `currency_id`). This is a float, meaning for i.e. 1,50 Euro, you would send `1.5`, and for 15 Euro, you would send `15.0`.
 * @param currencyId 
 * @param purpose We suggest to keep the purpose as short as possible (between 5 and 140 characters) and to place critical information at the beginning of the purpose. The reason for this suggestion is that we might have to limit the length of your given purpose. A SEPA purpose can be up to 140 characters. However some banks only offer a reference field which is limited to 35 characters. If your purpose is longer than bank supported purpose field, we will shorten it to the maximum length supported by that bank. Not all characters are supported for the purpose field. Sender banks impose different rules for the purpose field, therefore we suggest to limit the character set to a-z, A-Z, 0-9. If you use other characters please be advised that we might have to remove or replace characters considered invalid by the sender bank. We usually will replace the invalid characters with a whitespace or normalize the characters.
 * @param recipientHolder Sender banks impose different rules for the recipient_holder field, we suggest to limit the character set to a-z, A-Z, 0-9. If you use other characters please be advised that we might have to remove or replace characters considered invalid by the sender bank. We usually will replace the invalid characters with a whitespace or normalize the characters.
 * @param recipientIban IBAN of the recipient account
 * @param metadata 
 * @param language 
 * @param merchantId The internal ID of your merchant, if any. You may fill this field with the internal ID your merchant, if you are a PSP.
 * @param fintsProductId The fints product ID can be enclosed in the initial request. If you have an eIDAS certificate, then you have to send it with every request.
 * @param easyOnboarding 
 * @param senderHolder Name of the sender account holder. If this is set, the account holder will be pinned and validated for the current session. The customer will not be able to choose an account with a different name than provided. The name will be compared with our XS2A.name_check module. A match is not only string equals. To a certain point changes in the name will be tolerated. (i.e. a prepending academic title will not break the match)
 * @param senderIban IBAN of the sender account. If it is a valid IBAN, the IBAN will be pinned for the current session. The customer will not be able to choose a different account, even if there are more accounts available to chose from. If the given IBAN is not in the customer list of accounts, the transaction will be aborted. In the case of an invalid IBAN XS2A will return a validation error with HTTP status code 422.
 * @param senderBic BIC of the sender account. If the given BIC is valid, the step/page for entering a bank code will be skipped.
 * @param senderCountryId Two letter country code id of the sender account, e.g. AT, CH, DE
 * @param recipientBic BIC of the recipient account
 * @param recipientStreet Street of the recipient account. **Required if `sender_country_id` is `CH`**
 * @param recipientZip Zip-code of the recipient account. **Required if `sender_country_id` is `CH`**
 * @param recipientCity City of the recipient account. **Required if `sender_country_id` is `CH`**
 * @param recipientCountryId Two letter country code id, e.g. AT, CH, DE
 */
data class Xs2aPay (
    @Json(name = "amount")
    var amount: Float,
    @Json(name = "currency_id")
    var currencyId: CurrencyId,
    @Json(name = "purpose")
    var purpose: String,
    @Json(name = "recipient_holder")
    var recipientHolder: String,
    @Json(name = "recipient_iban")
    var recipientIban: String,
    @Json(name = "metadata")
    var metadata: Map<String, Any>? = null,
    @Json(name = "language")
    var language: Language? = null,
    @Json(name = "merchant_id")
    var merchantId: String? = null,
    @Json(name = "fints_product_id")
    var fintsProductId: String? = null,
    @Json(name = "easy_onboarding")
    var easyOnboarding: EasyOnboarding? = null,
    @Json(name = "sender_holder")
    var senderHolder: String? = null,
    @Json(name = "sender_iban")
    var senderIban: String? = null,
    @Json(name = "sender_bic")
    var senderBic: String? = null,
    @Json(name = "sender_country_id")
    var senderCountryId: CountryId? = null,
    @Json(name = "recipient_bic")
    var recipientBic: String? = null,
    @Json(name = "recipient_street")
    var recipientStreet: String? = null,
    @Json(name = "recipient_zip")
    var recipientZip: String? = null,
    @Json(name = "recipient_city")
    var recipientCity: String? = null,
    @Json(name = "recipient_country_id")
    var recipientCountryId: CountryId? = null,
)

