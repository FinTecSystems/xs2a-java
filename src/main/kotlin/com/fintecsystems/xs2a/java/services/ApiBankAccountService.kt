package com.fintecsystems.xs2a.java.services

import com.fintecsystems.xs2a.java.helper.JsonSerializer
import com.fintecsystems.xs2a.java.models.api.accounts.BankAccount
import com.fintecsystems.xs2a.java.models.api.accounts.BankAccountBalance
import com.fintecsystems.xs2a.java.models.api.accounts.BankAccountTurnovers
import com.fintecsystems.xs2a.java.models.api.accounts.BankAccountsList
import com.fintecsystems.xs2a.java.models.events.ReportFormat
import com.fintecsystems.xs2a.java.models.events.ReportLocale
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class ApiBankAccountService(
    private val apiKey: String
) {

    /**
     * Get a list of all accounts for a xs2a.bank user
     *
     * @param per_page Items per page (optional)
     * @param page Which page to display (optional)
     */
    fun list(
        per_page: Int = 15,
        page: Int = 1,
    ): BankAccountsList {
        val response = ApiService(apiKey).get(
            "api/accounts",
            mutableMapOf(
                "per_page" to per_page.toString(),
                "page" to page.toString(),
            )
        )

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a list of all accounts for a xs2a.bank user connection
     * @param connectionId the id of the bank connection
     * @param per_page Items per page (optional)
     * @param page Which page to display (optional)
     */
    fun listForBankConnection(
        connectionId: String,
        per_page: Int = 15,
        page: Int = 1,
    ): BankAccountsList {
        val response = ApiService(apiKey).get(
            "api/connections/$connectionId/accounts",
            mutableMapOf(
                "per_page" to per_page.toString(),
                "page" to page.toString(),
            )
        )

        return JsonSerializer.parseJson(response)
    }

    /**
     * Get a specific Bank Account
     * @param bankAccountId The bank-account-id for the account to be retrieved.
     * @return BankAccount
     */
    fun get(bankAccountId: String): BankAccount {
        val response = ApiService(apiKey).get("api/accounts/$bankAccountId")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Delete a xs2a.api bank account
     * @param bankAccountId bankAccountId id of user to delete
     * @return String
     */
    fun delete(bankAccountId: String): String {
        return ApiService(apiKey).delete("api/accounts/$bankAccountId")
    }

    /**
     * Retrieve the balance for a specific bank account
     * @param bankAccountId The bank-account-id for the account to be retrieved.
     * @return BankAccountBalance
     */
    fun getBalance(bankAccountId: String): BankAccountBalance {
        val response = ApiService(apiKey).get("api/accounts/$bankAccountId/balance")

        return JsonSerializer.parseJson(response)
    }

    /**
     * Retrieve the turnovers for a specific bank account
     * @param bankAccountId The bank-account-id for the account to be retrieved.
     * @param from Filter turnovers by `booking_date`
     * @param to Filter turnovers by `booking_date`
     * @param onlyNew Filter turnovers by new flag
     * @return BankAccountTurnovers
     */
    fun getTurnovers(
        bankAccountId: String,
        from: LocalDateTime? = null,
        to: LocalDateTime? = null,
        onlyNew: Boolean? = null
    ): BankAccountTurnovers {
        var onlyNewToUse = 0

        if (onlyNew !== null) {
            onlyNewToUse = 1
        }

        var fromToUse: String? = null
        if (from !== null) {
            fromToUse = from.format(DateTimeFormatter.ISO_LOCAL_DATE)
        }

        var toToUse: String? = null
        if (to !== null) {
            toToUse = to.format(DateTimeFormatter.ISO_LOCAL_DATE)
        }

        val response = ApiService(apiKey).get(
            "api/accounts/$bankAccountId/turnovers", mutableMapOf(
                "from" to fromToUse,
                "to" to toToUse,
                "onlyNew" to onlyNewToUse
            )
        )

        return JsonSerializer.parseJson(response)
    }

    /**
     * Mark turnovers as seen
     * @param bankAccountId The bankAccountId for the account for which the turnovers are to be marked as seen.
     * @param upTo Once you set a date, attribute new of all turnovers is set to false until the given date.
     */
    fun markAsSeen(bankAccountId: String, upTo: LocalDateTime? = null): Any {
        var uri = "api/accounts/$bankAccountId/markAsSeen"

        if (upTo !== null) {
            uri = "$uri/$upTo"
        }

        val response = ApiService(apiKey).post(uri)

        return JsonSerializer.parseJson(response)
    }

    /**
     * Retrieve a Report for a specific bank account
     * @param bankAccountId The bank-account-id for the account to be retrieved.
     * @param reportId ID of the report to be retrieved.
     * @param format The format parameter is optional. The report is available in the following formats:
     * html, pdf and json. This call defaults to html if the format parameter is omitted.
     * @param locale Locale in which the report will be rendered. This has no effect when using json format.
     */
    fun getReport(
        bankAccountId: String,
        reportId: String,
        format: ReportFormat = ReportFormat.JSON,
        locale: ReportLocale = ReportLocale.EN
    ): String {
        return ApiService(apiKey).get(
            "api/accounts/$bankAccountId/report/$reportId", mutableMapOf(
                "format" to format.value,
                "locale" to locale.value,
            )
        )
    }
}