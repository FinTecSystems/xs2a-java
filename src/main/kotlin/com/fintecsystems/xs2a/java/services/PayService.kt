package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.events.EventsList
import com.fintecsystems.xs2a.java.models.common.ReportFormat
import com.fintecsystems.xs2a.java.models.common.ReportLocale
import com.fintecsystems.xs2a.java.models.pay.*
import com.fintecsystems.xs2a.java.models.wizard.WizardSessionResponse
import java.time.OffsetDateTime

@Suppress("unused")
class PayService(
    apiKey: String
) : ServiceBase(apiKey) {

    /**
     * Create xs2a.pay object
     * Create a xs2a.pay object and receive Wizard session key in return.
     * @param body the request
     * @return WizardSessionResponse
     */
    fun create(body: Xs2aPay): WizardSessionResponse {
        val response = apiService.post("payments", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a xs2a.pay object
     * Here you can retrieve a specific xs2a.pay object by its &#x60;transaction-id&#x60;.
     * @param transactionId Transaction data also can be deleted manually by sending a DELETE request for that transaction.
     * @return PayObject
     */
    fun get(transactionId: String): PayObject {
        val response = apiService.get("payments/$transactionId")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Change the payment status of a transaction
     *
     * @param transactionId
     * @param statusToSet
     * @return PayObject
     */
    fun updatePaymentStatus(transactionId: String, statusToSet: PaymentStatus): PayObject {
        val statusValue = statusToSet.value.lowercase()
        val response = apiService.post("payments/$transactionId/$statusValue")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Download a Report
     *
     * @param transactionId ID of the transaction to be retrieved.
     * @param reportId ID of the report to be retrieved.
     * @param format The format parameter is optional. The report is available in the following formats: html, pdf and json. This call defaults to html if the format parameter is omitted. (optional)
     * @param locale Locale in which the report will be rendered. This has no effect when using json format. (optional)
     * @return Map<String, Any?>
     */
    fun getReport(
        transactionId: String,
        reportId: String = "",
        format: ReportFormat = ReportFormat.JSON,
        locale: ReportLocale = ReportLocale.EN
    ): Any {
        var uri = "payments/$transactionId/report"

        if (reportId.isNotEmpty()) {
            uri = "$uri/$reportId"
        }

        val queryParameters: MutableMap<String, Any?> = mutableMapOf(
            "format" to format.value,
            "locale" to locale.value,
        )

        val response = apiService.get(uri, queryParameters)

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get all events for a xs2a.pay transaction object
     *
     * @param transactionId ID of the transaction for which all events are to be retrieved for.
     * @param perPage Items per page (optional)
     * @param page Which page to display (optional)
     * @return EventsList
     */
    fun getEvents(transactionId: String, perPage: Int = 15, page: Int = 1): EventsList {
        val queryParameters: MutableMap<String, Any?> = mutableMapOf(
            "per_page" to perPage.toString(),
            "page" to page.toString(),
        )

        val response = apiService.get("payments/$transactionId/events", queryParameters)

        return JsonSerializer.parseJson(response)
    }

    /**
     * Generates a pain file.
     * The payout & refund feature offers the possibility to initiate a payout or refund that are based on XS2A.pay
     * transactions. A SEPA pain file is created that can be processed by your bank.
     * @param body the request
     * @return RefundPayoutResponse
     */
    fun generatePainFile(body: RefundPayoutRequest): RefundPayoutResponse {
        val response = apiService.post("payments/refundPayout", JsonSerializer.toJson(body))

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a list of all refund and payout with their message_id.
     * @return RefundPayoutList
     */
    fun listRefundPayouts(perPage: Int = 15, page: Int = 1): RefundPayoutList {
        val queryParameters: MutableMap<String, Any?> = mutableMapOf(
            "per_page" to perPage.toString(),
            "page" to page.toString(),
        )

        val response = apiService.get("payments/refundPayout", queryParameters)

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a refund Payout of transaction.
     * Here you can retrieve a specific accumulated refund/payout of a transaction.
     * @param transactionId ID of the transaction to be retrieved.
     * @return RefundsPayout
     */
    fun getRefundPayout(transactionId: String): RefundsPayout {
        val response = apiService.get("payments/$transactionId/refundPayout")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a pain file.
     * Here you can retrieve a specific pain file by its &#x60;message_id&#x60;.
     * @param messageId The message_id is used to get the generated pain file.
     * @return String
     */
    fun getPainFile(messageId: String): String {
        return apiService.get("payments/refundPayout/$messageId")
    }

    /**
     * Delete a xs2a.pay transaction object
     * Transaction data also can be deleted manually by sending a DELETE request for that transaction.
     * @param transactionId Transaction data also can be deleted manually by sending a DELETE request for that transaction.
     * @return void
     */
    fun delete(transactionId: String): String {
        return apiService.delete("payments/$transactionId")
    }

    /**
     * Get a list of all xs2a.pay transaction objects
     * Get a list of all xs2a.pay transactions, or filter using query parameters.
     * @param senderHolder Holder of the sender account (optional)
     * @param senderIban IBAN of the sender account (optional)
     * @param senderBic BIC of the sender account (optional)
     * @param senderAccountNumber Account number of the sender account (optional)
     * @param senderBankCode National bank code of the sender account (optional)
     * @param senderCountryId Two letter country code id of the sender account, e.g. AT, CH, DE (optional)
     * @param recipientHolder Holder of the recipient account (optional)
     * @param recipientIban IBAN of the recipient account (optional)
     * @param recipientBic BIC of the recipient account (optional)
     * @param recipientCountryId Two letter country code id of the recipient account, e.g. AT, CH, DE (optional)
     * @param amount Amount to transfer (optional)
     * @param purpose Purpose of transfer (optional)
     * @param perPage Items per page (optional)
     * @param page Which page to display (optional)
     * @param from Filter by date. Pass ISO8601 conform dates (yyyy-mm-ddThh:mm:ss-zzzz). The time and timezone portions are optional and may be omitted (e.g yyyy-mm-dd or yyyy-mm-ddThh:mm:ss). (optional)
     * @param to Filter by date. Pass ISO8601 conform dates (yyyy-mm-ddThh:mm:ss-zzzz). The time and timezone portions are optional and may be omitted (e.g yyyy-mm-dd or yyyy-mm-ddThh:mm:ss). (optional)
     * @return PayTransactionList
     */
    fun list(
        senderHolder: String? = null,
        senderIban: String? = null,
        senderBic: String? = null,
        senderAccountNumber: String? = null,
        senderBankCode: String? = null,
        senderCountryId: String? = null,
        recipientHolder: String? = null,
        recipientIban: String? = null,
        recipientBic: String? = null,
        recipientCountryId: String? = null,
        amount: Float? = null,
        purpose: String? = null,
        perPage: Int? = null,
        page: Int? = null,
        from: OffsetDateTime? = null,
        to: OffsetDateTime? = null
    ): PayTransactionList {
        val amountToUse = if (amount !== null) amount.toString() else null
        val perPageToUse = if (perPage !== null) perPage.toString() else null
        val pageToUse = if (page !== null) page.toString() else null

        val response = apiService.get(
            "payments",
            mutableMapOf(
                "senderHolder" to senderHolder,
                "senderIban" to senderIban,
                "senderBic" to senderBic,
                "senderAccountNumber" to senderAccountNumber,
                "senderBankCode" to senderBankCode,
                "senderCountryId" to senderCountryId,
                "recipientHolder" to recipientHolder,
                "recipientIban" to recipientIban,
                "recipientBic" to recipientBic,
                "recipientCountryId" to recipientCountryId,
                "amount" to amountToUse,
                "purpose" to purpose,
                "per_page" to perPageToUse,
                "page" to pageToUse,
                "from" to from,
                "to" to to,
            )
        )

        return JsonSerializer.parseJson(response)
    }
}