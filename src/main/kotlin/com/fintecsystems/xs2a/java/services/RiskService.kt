package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer.parseJson
import com.fintecsystems.xs2a.java.helper.JsonSerializer.toJson
import com.fintecsystems.xs2a.java.models.common.CountryId
import com.fintecsystems.xs2a.java.models.common.ReportFormat
import com.fintecsystems.xs2a.java.models.common.ReportLocale
import com.fintecsystems.xs2a.java.models.events.EventsList
import com.fintecsystems.xs2a.java.models.risk.*
import com.fintecsystems.xs2a.java.models.risk.uploadJson.Xs2aRiskUploadJsonSuccess
import com.fintecsystems.xs2a.java.models.risk.uploadJson.Xs2aRiskUploadJsonWrapper
import com.fintecsystems.xs2a.java.models.wizard.WizardSessionResponse
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

@Suppress("unused")
class RiskService(
    private val apiKey: String
) {

    /**
     * Create xs2a.risk object
     * Create a xs2a.risk object and receive a wizard session key in return.
     * @param body XS2A.risk allows you to collect and validate a bank connection. Additionally, a range of predefined
     * checks can be applied using the retrieved account information. For more information about the predefined checks
     * see XS2A.risk.
     * @return WizardSessionResponse
     */
    fun create(body: Xs2aRisk): WizardSessionResponse {
        val response = ApiService(apiKey).post("risks", toJson(body))

        return parseJson(response)
    }

    /**
     * Get a xs2a.risk transaction object
     * @param transactionId ID of the transaction to be retrieved.
     * @return RiskObject
     */
    fun get(transactionId: String): RiskObject {
        val response = ApiService(apiKey).get("risks/$transactionId")

        return parseJson(response)
    }

    /**
     * Download an Account Snapshot
     * An account snapshot can be downloaded in several formats. The response object  described here details the JSON2
     * response.
     * @param transactionId ID of the transaction to be retrieved.
     * pdf, csv, json and json2. This call defaults to  pdf if the format parameter is omitted. Please note that you
     * have to use  json2 as format if the all_accounts parameter was set to true. (optional)
     * @return Array<AccountStatement>
     */
    fun getAccountSnapshot(
        transactionId: String
    ): Array<AccountStatement> {
        val response =
            ApiService(apiKey).get("risks/$transactionId/accountSnapshot", mutableMapOf("format" to "json2"))

        return parseJson(response)
    }

    /**
     * XS2A.risk.fullpdf is a wonderful way to show you all the checks in one pdf.
     * Only the risk-checks will be shown in this pdf, which were selected in the transaction (WizardSession).
     * So if xs2a_account_snapshot and xs2a_name_check has been selected, only this information of these checks,
     * can be found in the fullpdf.
     * @param transactionId id of the transaction to get the full PDF for
     */
    fun getFullPDF(transactionId: String): String {
        return ApiService(apiKey).get("risks/$transactionId/fullpdf")
    }

    /**
     * Download a Report
     *
     * @param transactionId ID of the transaction to be retrieved.
     * @param reportId ID of the report to be retrieved. If not present, current default report will be used.
     * @param format The format parameter is optional. The report is available in the following formats: html, pdf and
     * json. This call defaults to JSON if the format parameter is omitted. (optional)
     * @param locale Locale in which the report will be rendered. This has no effect when using json format. (optional)
     */
    fun getReport(
        transactionId: String,
        reportId: String = "",
        format: ReportFormat = ReportFormat.JSON,
        locale: ReportLocale = ReportLocale.EN
    ): Any {
        var uri = "risks/$transactionId/report"

        if (reportId.isNotEmpty()) {
            uri = "$uri/$reportId"
        }

        val queryParameters: MutableMap<String, Any?> = mutableMapOf(
            "format" to format.value,
            "locale" to locale.value,
        )

        return ApiService(apiKey).get(uri, queryParameters)
    }

    /**
     * Get all events for a xs2a.risk transaction object
     *
     * @param transactionId ID of the transaction for which all events are to be retrieved for.
     * @param perPage Items per page (optional)
     * @param page Which page to display (optional)
     * @return EventsList
     */
    fun getEvents(
        transactionId: String,
        perPage: Int = 15,
        page: Int = 1
    ): EventsList {
        val queryParameters: MutableMap<String, Any?> = mutableMapOf(
            "per_page" to perPage.toString(),
            "page" to page.toString(),
        )

        val response = ApiService(apiKey).get("risks/$transactionId/events", queryParameters)

        return parseJson(response)
    }

    /**
     * Complete xs2a.risk by uploading account data to our systems.
     * This action will complete the started wizard_session and can **not** be done in testmode.
     * @param wizardSessionId Wizard-session-id which was received using &#x60;POST /risks&#x60;
     * @param body Upload an account-snapshot to finalize your transaction.
     * @return Xs2aRiskUploadJsonSuccess
     */
    fun completeManually(
        wizardSessionId: String,
        body: Xs2aRiskUploadJsonWrapper
    ): Xs2aRiskUploadJsonSuccess {
        val response = ApiService(apiKey).post("risks/upload/$wizardSessionId", toJson(body))

        return parseJson(response)
    }

    /**
     * Delete a xs2a.risk transaction object
     * Transaction data also can be deleted manually by sending a DELETE request for that transaction.
     * @param transactionId Transaction data also can be deleted manually by sending a DELETE request for that
     * transaction.
     */
    fun delete(transactionId: String): Map<String, Any?> {
        val response = ApiService(apiKey).delete("risks/$transactionId")

        return parseJson(response)
    }

    /**
     * Get a list of all xs2a.risk transaction objects
     *
     * @param account_holder Filter using account holder of the account (optional)
     * @param iban Filter using iban (optional)
     * @param bic Filter using bic (optional)
     * @param country_id Filter using two-letter country id (optional)
     * @param merchant_id Filter by merchant_id (optional)
     * @param per_page Items per page (optional)
     * @param page Which page to display (optional)
     * @param from Filter by date. Pass ISO8861 conform dates (yyyy-mm-ddThh:mm:ss-zzzz). The time and
     * timezone portions are optional and may be omitted (e.g. yyyy-mm-dd or yyyy-mm-ddThh:mm:ss). (optional)
     * @param to Filter by date. Pass ISO8861 conform dates (yyyy-mm-ddThh:mm:ss-zzzz). The time and timezone
     * portions are optional and may be omitted (e.g. yyyy-mm-dd or yyyy-mm-ddThh:mm:ss). (optional)
     */
    fun list(
        account_holder: String? = null,
        iban: String? = null,
        bic: String? = null,
        country_id: CountryId? = null,
        merchant_id: String? = null,
        per_page: Int = 15,
        page: Int = 1,
        from: OffsetDateTime? = null,
        to: OffsetDateTime? = null,
    ): RisksTransactionList {
        var fromToUse: String? = null
        var toToUse: String? = null
        if (from !== null) {
            fromToUse = from.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        }
        if (to !== null) {
            toToUse = to.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        }

        val response = ApiService(apiKey).get(
            "risks",
            mutableMapOf(
                "account_holder" to account_holder,
                "iban" to iban,
                "bic" to bic,
                "country_id" to (country_id?.value ?: ""),
                "merchant_id" to merchant_id,
                "per_page" to per_page.toString(),
                "page" to page.toString(),
                "from" to fromToUse,
                "to" to toToUse,
            )
        )

        return parseJson(response)
    }
}