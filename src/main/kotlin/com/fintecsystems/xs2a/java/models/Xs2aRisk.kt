package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 *
 * @param bankCode bank code of the customers bank, requires also parameter country_id. If supplied the step/page for entering a bank code will be skipped.
 * @param countryId Two letter country code id, e.g. AT, CH, DE
 * @param accountNumber The (national) account number of the customer. Is the account number valid, an IBAN will be calculated using the bank code and the account number. Afterwards the procedure is equal to the following description for iban (see below). If you include this field, you must also include the parameter bank_code.
 * @param iban IBAN of the customer. If it is a valid IBAN, the IBAN will be pinned for the current session. The customer will not be able to choose a different account, even if there are more accounts available to chose from. If the given IBAN is not in the customer list of accounts, the transaction will be aborted. In the case of an invalid IBAN XS2A will return a validation error with HTTP status code 422.
 * @param bic BIC of the customer. If the given BIC is valid, the step/page for entering a bank code will be skipped.
 * @param checkAmount The account balance amount to be checked against.
 * @param checkCurrencyId Currency id of check_amount, e.g. EUR
 * @param metadata
 * @param merchantId The internal ID of your merchant, if any.
 * @param fintsProductId The fints product ID can be enclosed in the initial request. If you have an eIDAS certificate, then you have to send it with every request.
 * @param easyOnboarding
 * @param language
 * @param xs2aAccountCharacteristicsCheck XS2A.account_characteristics_check allows you to retrieve many possible information about the account, like chargebacks, encashment, loans and other. Simply append an empty object to the XS2A.risk object to indicate you would like this check to be performed.
 * @param xs2aAccountLinkedOffersCheck The Account Linked Offers Check validates with the consent of the user, based on an account view, whether third party offers might be of interest to the user and hands over an advertising link for one-time use to a FinTecSystems business partner.
 * @param xs2aAccountSnapshot
 * @param xs2aAccountStatusCheck
 * @param xs2aAllAccountsCheck XS2A.standing_orders_check allows you to retrieve all standing orders from an account. An XS2A.standing_orders_check has no additional parameters. Simply append an empty object to the XS2A.risk object to indicate you would like this check to be performed.
 * @param xs2aBalanceCheck
 * @param xs2aBalanceOverview XS2A.balance_overview returns the current running total of the chosen account. An XS2A.balance_overview has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed.
 * @param xs2aCashflowOverview XS2A.cashflow_overview provides an cashflow overview for the requested risk date range. An XS2A.cashflow_overview has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed.
 * @param xs2aChargebackCheck XS2A.chargeback_check returns the number of detected chargeback transactions for the account. An XS2A.chargeback_check has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed.
 * @param xs2aChildrenCheck The XS2A.children_check gathers payments from governmental facilities, which indicate how many children the account has. This risk-check has no configuration.
 * @param xs2aCreditCheck
 * @param xs2aDirectDebitCheck
 * @param xs2aFactSheetLists
 * @param xs2aHolderIdentificationCheck
 * @param xs2aIncomeCheck The Income Check provides an overview of the account holder's various types of income. Each type of income is listed separately and the corresponding key figures are calculated so that the customer can only take into account the types of income that are relevant for him/her.
 * @param xs2aNameCheck
 * @param xs2aOverdraftLimitCheck XS2A.overdraft_limit_check returns the number of booking days of the given risk range. The number of days the account used the overdraft limit, the maximum amount of overdraft used, the average and the median used overdraft. An XS2A.overdraft_limit_check has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed.
 * @param xs2aProfitLossCheck The P&L check (profit and loss check) provides a simplified P&L statement for B2B customers as well as an overview of other relevant operational KPIs. These can be, for example, other relevant income, expenses and cash flows from the account. In addition, the tax number is also shown (initially, only in Germany).
 * @param xs2aRatingB2bCheck Produces a qualitative evaluation of a bank statement (business accounts) according to various criteria and summarizes these in a school grade system (A-F).
 * @param xs2aRatingB2cCheck Produces a qualitative evaluation of a bank statement (private accounts) according to various criteria and summarizes these in a school grade system (A-F).
 * @param xs2aRiskCalculationsCheck
 * @param xs2aSeizureCheck
 * @param xs2aStandingOrdersCheck XS2A.standing_orders_check allows you to retrieve all standing orders from an account. An XS2A.standing_orders_check has no additional parameters. Simply append an empty object to the XS2A.risk object to indicate you would like this check to be performed.
 */

data class Xs2aRisk(
    /* bank code of the customers bank, requires also parameter country_id. If supplied the step/page for entering a bank code will be skipped. */
    @Json(name = "bank_code")
    @JvmField
    val bankCode: Int? = null,
    /* Two letter country code id, e.g. AT, CH, DE */
    @Json(name = "country_id")
    @JvmField
    val countryId: CountryId? = null,
    /* The (national) account number of the customer. Is the account number valid, an IBAN will be calculated using the bank code and the account number. Afterwards the procedure is equal to the following description for iban (see below). If you include this field, you must also include the parameter bank_code. */
    @Json(name = "account_number")
    @JvmField
    val accountNumber: String? = null,
    /* IBAN of the customer. If it is a valid IBAN, the IBAN will be pinned for the current session. The customer will not be able to choose a different account, even if there are more accounts available to chose from. If the given IBAN is not in the customer list of accounts, the transaction will be aborted. In the case of an invalid IBAN XS2A will return a validation error with HTTP status code 422. */
    @Json(name = "iban")
    @JvmField
    val iban: String? = null,
    /* BIC of the customer. If the given BIC is valid, the step/page for entering a bank code will be skipped. */
    @Json(name = "bic")
    @JvmField
    val bic: String? = null,
    /* The account balance amount to be checked against. */
    @Json(name = "check_amount")
    @JvmField
    val checkAmount: Float? = null,
    /* Currency id of check_amount, e.g. EUR */
    @Json(name = "check_currency_id")
    @JvmField
    val checkCurrencyId: CurrencyId? = null,
    @Json(name = "metadata")
    @JvmField
    val metadata: Map<String, Any>? = null,
    /* The internal ID of your merchant, if any. */
    @Json(name = "merchant_id")
    @JvmField
    val merchantId: String? = null,
    /* The fints product ID can be enclosed in the initial request. If you have an eIDAS certificate, then you have to send it with every request. */
    @Json(name = "fints_product_id")
    @JvmField
    val fintsProductId: String? = null,
    @Json(name = "easy_onboarding")
    @JvmField
    val easyOnboarding: EasyOnboarding? = null,
    @Json(name = "language")
    @JvmField
    val language: Language? = null,
    /* XS2A.account_characteristics_check allows you to retrieve many possible information about the account, like chargebacks, encashment, loans and other. Simply append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_account_characteristics_check")
    @JvmField
    val xs2aAccountCharacteristicsCheck: Array<String>? = null,
    /* The Account Linked Offers Check validates with the consent of the user, based on an account view, whether third party offers might be of interest to the user and hands over an advertising link for one-time use to a FinTecSystems business partner. */
    @Json(name = "xs2a_account_linked_offers_check")
    @JvmField
    val xs2aAccountLinkedOffersCheck: Array<String>? = null,
    @Json(name = "xs2a_account_snapshot")
    @JvmField
    val xs2aAccountSnapshot: Xs2aAccountSnapshot? = null,
    @Json(name = "xs2a_account_status_check")
    @JvmField
    val xs2aAccountStatusCheck: Xs2aAccountStatusCheck? = null,
    /* XS2A.standing_orders_check allows you to retrieve all standing orders from an account. An XS2A.standing_orders_check has no additional parameters. Simply append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_all_accounts_check")
    @JvmField
    val xs2aAllAccountsCheck: Array<String>? = null,
    @Json(name = "xs2a_balance_check")
    @JvmField
    val xs2aBalanceCheck: Xs2aBalanceCheck? = null,
    /* XS2A.balance_overview returns the current running total of the chosen account. An XS2A.balance_overview has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_balance_overview")
    @JvmField
    val xs2aBalanceOverview: Array<String>? = null,
    /* XS2A.cashflow_overview provides an cashflow overview for the requested risk date range. An XS2A.cashflow_overview has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_cashflow_overview")
    @JvmField
    val xs2aCashflowOverview: Array<String>? = null,
    /* XS2A.chargeback_check returns the number of detected chargeback transactions for the account. An XS2A.chargeback_check has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_chargeback_check")
    @JvmField
    val xs2aChargebackCheck: Array<String>? = null,
    /* The XS2A.children_check gathers payments from governmental facilities, which indicate how many children the account has. This risk-check has no configuration. */
    @Json(name = "xs2a_children_check")
    @JvmField
    val xs2aChildrenCheck: Array<String>? = null,
    @Json(name = "xs2a_credit_check")
    @JvmField
    val xs2aCreditCheck: Xs2aCreditCheck? = null,
    @Json(name = "xs2a_direct_debit_check")
    @JvmField
    val xs2aDirectDebitCheck: Xs2aDirectDebitCheck? = null,
    @Json(name = "xs2a_fact_sheet_lists")
    @JvmField
    val xs2aFactSheetLists: Xs2aFactSheetLists? = null,
    @Json(name = "xs2a_holder_identification_check")
    @JvmField
    val xs2aHolderIdentificationCheck: Xs2aHolderIdentificationCheck? = null,
    /* The Income Check provides an overview of the account holder's various types of income. Each type of income is listed separately and the corresponding key figures are calculated so that the customer can only take into account the types of income that are relevant for him/her. */
    @Json(name = "xs2a_income_check")
    @JvmField
    val xs2aIncomeCheck: Array<String>? = null,
    @Json(name = "xs2a_name_check")
    @JvmField
    val xs2aNameCheck: Xs2aNameCheck? = null,
    /* XS2A.overdraft_limit_check returns the number of booking days of the given risk range. The number of days the account used the overdraft limit, the maximum amount of overdraft used, the average and the median used overdraft. An XS2A.overdraft_limit_check has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_overdraft_limit_check")
    @JvmField
    val xs2aOverdraftLimitCheck: Array<String>? = null,
    /* The P&L check (profit and loss check) provides a simplified P&L statement for B2B customers as well as an overview of other relevant operational KPIs. These can be, for example, other relevant income, expenses and cash flows from the account. In addition, the tax number is also shown (initially, only in Germany). */
    @Json(name = "xs2a_profit_loss_check")
    @JvmField
    val xs2aProfitLossCheck: Array<String>? = null,
    /* Produces a qualitative evaluation of a bank statement (business accounts) according to various criteria and summarizes these in a school grade system (A-F). */
    @Json(name = "xs2a_rating_b2b_check")
    @JvmField
    val xs2aRatingB2bCheck: Array<String>? = null,
    /* Produces a qualitative evaluation of a bank statement (private accounts) according to various criteria and summarizes these in a school grade system (A-F). */
    @Json(name = "xs2a_rating_b2c_check")
    @JvmField
    val xs2aRatingB2cCheck: Array<String>? = null,
    @Json(name = "xs2a_risk_calculations_check")
    @JvmField
    val xs2aRiskCalculationsCheck: Xs2aRiskCalculationsCheck? = null,
    @Json(name = "xs2a_seizure_check")
    @JvmField
    val xs2aSeizureCheck: Xs2aSeizureCheck? = null,
    /* XS2A.standing_orders_check allows you to retrieve all standing orders from an account. An XS2A.standing_orders_check has no additional parameters. Simply append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_standing_orders_check")
    @JvmField
    val xs2aStandingOrdersCheck: Array<String>? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Xs2aRisk

        if (bankCode != other.bankCode) return false
        if (countryId != other.countryId) return false
        if (accountNumber != other.accountNumber) return false
        if (iban != other.iban) return false
        if (bic != other.bic) return false
        if (checkAmount != other.checkAmount) return false
        if (checkCurrencyId != other.checkCurrencyId) return false
        if (metadata != other.metadata) return false
        if (merchantId != other.merchantId) return false
        if (fintsProductId != other.fintsProductId) return false
        if (easyOnboarding != other.easyOnboarding) return false
        if (language != other.language) return false
        if (xs2aAccountCharacteristicsCheck != null) {
            if (other.xs2aAccountCharacteristicsCheck == null) return false
            if (!xs2aAccountCharacteristicsCheck.contentEquals(other.xs2aAccountCharacteristicsCheck)) return false
        } else if (other.xs2aAccountCharacteristicsCheck != null) return false
        if (xs2aAccountLinkedOffersCheck != null) {
            if (other.xs2aAccountLinkedOffersCheck == null) return false
            if (!xs2aAccountLinkedOffersCheck.contentEquals(other.xs2aAccountLinkedOffersCheck)) return false
        } else if (other.xs2aAccountLinkedOffersCheck != null) return false
        if (xs2aAccountSnapshot != other.xs2aAccountSnapshot) return false
        if (xs2aAccountStatusCheck != other.xs2aAccountStatusCheck) return false
        if (xs2aAllAccountsCheck != null) {
            if (other.xs2aAllAccountsCheck == null) return false
            if (!xs2aAllAccountsCheck.contentEquals(other.xs2aAllAccountsCheck)) return false
        } else if (other.xs2aAllAccountsCheck != null) return false
        if (xs2aBalanceCheck != other.xs2aBalanceCheck) return false
        if (xs2aBalanceOverview != null) {
            if (other.xs2aBalanceOverview == null) return false
            if (!xs2aBalanceOverview.contentEquals(other.xs2aBalanceOverview)) return false
        } else if (other.xs2aBalanceOverview != null) return false
        if (xs2aCashflowOverview != null) {
            if (other.xs2aCashflowOverview == null) return false
            if (!xs2aCashflowOverview.contentEquals(other.xs2aCashflowOverview)) return false
        } else if (other.xs2aCashflowOverview != null) return false
        if (xs2aChargebackCheck != null) {
            if (other.xs2aChargebackCheck == null) return false
            if (!xs2aChargebackCheck.contentEquals(other.xs2aChargebackCheck)) return false
        } else if (other.xs2aChargebackCheck != null) return false
        if (xs2aChildrenCheck != null) {
            if (other.xs2aChildrenCheck == null) return false
            if (!xs2aChildrenCheck.contentEquals(other.xs2aChildrenCheck)) return false
        } else if (other.xs2aChildrenCheck != null) return false
        if (xs2aCreditCheck != other.xs2aCreditCheck) return false
        if (xs2aDirectDebitCheck != other.xs2aDirectDebitCheck) return false
        if (xs2aFactSheetLists != other.xs2aFactSheetLists) return false
        if (xs2aHolderIdentificationCheck != other.xs2aHolderIdentificationCheck) return false
        if (xs2aIncomeCheck != null) {
            if (other.xs2aIncomeCheck == null) return false
            if (!xs2aIncomeCheck.contentEquals(other.xs2aIncomeCheck)) return false
        } else if (other.xs2aIncomeCheck != null) return false
        if (xs2aNameCheck != other.xs2aNameCheck) return false
        if (xs2aOverdraftLimitCheck != null) {
            if (other.xs2aOverdraftLimitCheck == null) return false
            if (!xs2aOverdraftLimitCheck.contentEquals(other.xs2aOverdraftLimitCheck)) return false
        } else if (other.xs2aOverdraftLimitCheck != null) return false
        if (xs2aProfitLossCheck != null) {
            if (other.xs2aProfitLossCheck == null) return false
            if (!xs2aProfitLossCheck.contentEquals(other.xs2aProfitLossCheck)) return false
        } else if (other.xs2aProfitLossCheck != null) return false
        if (xs2aRatingB2bCheck != null) {
            if (other.xs2aRatingB2bCheck == null) return false
            if (!xs2aRatingB2bCheck.contentEquals(other.xs2aRatingB2bCheck)) return false
        } else if (other.xs2aRatingB2bCheck != null) return false
        if (xs2aRatingB2cCheck != null) {
            if (other.xs2aRatingB2cCheck == null) return false
            if (!xs2aRatingB2cCheck.contentEquals(other.xs2aRatingB2cCheck)) return false
        } else if (other.xs2aRatingB2cCheck != null) return false
        if (xs2aRiskCalculationsCheck != other.xs2aRiskCalculationsCheck) return false
        if (xs2aSeizureCheck != other.xs2aSeizureCheck) return false
        if (xs2aStandingOrdersCheck != null) {
            if (other.xs2aStandingOrdersCheck == null) return false
            if (!xs2aStandingOrdersCheck.contentEquals(other.xs2aStandingOrdersCheck)) return false
        } else if (other.xs2aStandingOrdersCheck != null) return false

        return true
    }

    override fun hashCode(): Int {
        var result = bankCode ?: 0
        result = 31 * result + (countryId?.hashCode() ?: 0)
        result = 31 * result + (accountNumber?.hashCode() ?: 0)
        result = 31 * result + (iban?.hashCode() ?: 0)
        result = 31 * result + (bic?.hashCode() ?: 0)
        result = 31 * result + (checkAmount?.hashCode() ?: 0)
        result = 31 * result + (checkCurrencyId?.hashCode() ?: 0)
        result = 31 * result + (metadata?.hashCode() ?: 0)
        result = 31 * result + (merchantId?.hashCode() ?: 0)
        result = 31 * result + (fintsProductId?.hashCode() ?: 0)
        result = 31 * result + (easyOnboarding?.hashCode() ?: 0)
        result = 31 * result + (language?.hashCode() ?: 0)
        result = 31 * result + (xs2aAccountCharacteristicsCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aAccountLinkedOffersCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aAccountSnapshot?.hashCode() ?: 0)
        result = 31 * result + (xs2aAccountStatusCheck?.hashCode() ?: 0)
        result = 31 * result + (xs2aAllAccountsCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aBalanceCheck?.hashCode() ?: 0)
        result = 31 * result + (xs2aBalanceOverview?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aCashflowOverview?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aChargebackCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aChildrenCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aCreditCheck?.hashCode() ?: 0)
        result = 31 * result + (xs2aDirectDebitCheck?.hashCode() ?: 0)
        result = 31 * result + (xs2aFactSheetLists?.hashCode() ?: 0)
        result = 31 * result + (xs2aHolderIdentificationCheck?.hashCode() ?: 0)
        result = 31 * result + (xs2aIncomeCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aNameCheck?.hashCode() ?: 0)
        result = 31 * result + (xs2aOverdraftLimitCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aProfitLossCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aRatingB2bCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aRatingB2cCheck?.contentHashCode() ?: 0)
        result = 31 * result + (xs2aRiskCalculationsCheck?.hashCode() ?: 0)
        result = 31 * result + (xs2aSeizureCheck?.hashCode() ?: 0)
        result = 31 * result + (xs2aStandingOrdersCheck?.contentHashCode() ?: 0)
        return result
    }
}

