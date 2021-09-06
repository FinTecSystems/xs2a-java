
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

data class Xs2aRisk (
    /* bank code of the customers bank, requires also parameter country_id. If supplied the step/page for entering a bank code will be skipped. */
    @Json(name = "bank_code")
    val bankCode: Int? = null,
    /* Two letter country code id, e.g. AT, CH, DE */
    @Json(name = "country_id")
    val countryId: CountryId? = null,
    /* The (national) account number of the customer. Is the account number valid, an IBAN will be calculated using the bank code and the account number. Afterwards the procedure is equal to the following description for iban (see below). If you include this field, you must also include the parameter bank_code. */
    @Json(name = "account_number")
    val accountNumber: String? = null,
    /* IBAN of the customer. If it is a valid IBAN, the IBAN will be pinned for the current session. The customer will not be able to choose a different account, even if there are more accounts available to chose from. If the given IBAN is not in the customer list of accounts, the transaction will be aborted. In the case of an invalid IBAN XS2A will return a validation error with HTTP status code 422. */
    @Json(name = "iban")
    val iban: String? = null,
    /* BIC of the customer. If the given BIC is valid, the step/page for entering a bank code will be skipped. */
    @Json(name = "bic")
    val bic: String? = null,
    /* The account balance amount to be checked against. */
    @Json(name = "check_amount")
    val checkAmount: Float? = null,
    /* Currency id of check_amount, e.g. EUR */
    @Json(name = "check_currency_id")
    val checkCurrencyId: CurrencyId? = null,
    @Json(name = "metadata")
    val metadata: Map<String, Any>? = null,
    /* The internal ID of your merchant, if any. */
    @Json(name = "merchant_id")
    val merchantId: String? = null,
    /* The fints product ID can be enclosed in the initial request. If you have an eIDAS certificate, then you have to send it with every request. */
    @Json(name = "fints_product_id")
    val fintsProductId: String? = null,
    @Json(name = "easy_onboarding")
    val easyOnboarding: EasyOnboarding? = null,
    @Json(name = "language")
    val language: Language? = null,
    /* XS2A.account_characteristics_check allows you to retrieve many possible information about the account, like chargebacks, encashment, loans and other. Simply append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_account_characteristics_check")
    val xs2aAccountCharacteristicsCheck: Array<String>? = null,
    /* The Account Linked Offers Check validates with the consent of the user, based on an account view, whether third party offers might be of interest to the user and hands over an advertising link for one-time use to a FinTecSystems business partner. */
    @Json(name = "xs2a_account_linked_offers_check")
    val xs2aAccountLinkedOffersCheck: Array<String>? = null,
    @Json(name = "xs2a_account_snapshot")
    val xs2aAccountSnapshot: Xs2aAccountSnapshot? = null,
    @Json(name = "xs2a_account_status_check")
    val xs2aAccountStatusCheck: Xs2aAccountStatusCheck? = null,
    /* XS2A.standing_orders_check allows you to retrieve all standing orders from an account. An XS2A.standing_orders_check has no additional parameters. Simply append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_all_accounts_check")
    val xs2aAllAccountsCheck: Array<String>? = null,
    @Json(name = "xs2a_balance_check")
    val xs2aBalanceCheck: Xs2aBalanceCheck? = null,
    /* XS2A.balance_overview returns the current running total of the chosen account. An XS2A.balance_overview has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_balance_overview")
    val xs2aBalanceOverview: Array<String>? = null,
    /* XS2A.cashflow_overview provides an cashflow overview for the requested risk date range. An XS2A.cashflow_overview has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_cashflow_overview")
    val xs2aCashflowOverview: Array<String>? = null,
    /* XS2A.chargeback_check returns the number of detected chargeback transactions for the account. An XS2A.chargeback_check has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_chargeback_check")
    val xs2aChargebackCheck: Array<String>? = null,
    /* The XS2A.children_check gathers payments from governmental facilities, which indicate how many children the account has. This risk-check has no configuration. */
    @Json(name = "xs2a_children_check")
    val xs2aChildrenCheck: Array<String>? = null,
    @Json(name = "xs2a_credit_check")
    val xs2aCreditCheck: Xs2aCreditCheck? = null,
    @Json(name = "xs2a_direct_debit_check")
    val xs2aDirectDebitCheck: Xs2aDirectDebitCheck? = null,
    @Json(name = "xs2a_fact_sheet_lists")
    val xs2aFactSheetLists: Xs2aFactSheetLists? = null,
    @Json(name = "xs2a_holder_identification_check")
    val xs2aHolderIdentificationCheck: Xs2aHolderIdentificationCheck? = null,
    /* The Income Check provides an overview of the account holder's various types of income. Each type of income is listed separately and the corresponding key figures are calculated so that the customer can only take into account the types of income that are relevant for him/her. */
    @Json(name = "xs2a_income_check")
    val xs2aIncomeCheck: Array<String>? = null,
    @Json(name = "xs2a_name_check")
    val xs2aNameCheck: Xs2aNameCheck? = null,
    /* XS2A.overdraft_limit_check returns the number of booking days of the given risk range. The number of days the account used the overdraft limit, the maximum amount of overdraft used, the average and the median used overdraft. An XS2A.overdraft_limit_check has no additional parameters. Just append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_overdraft_limit_check")
    val xs2aOverdraftLimitCheck: Array<String>? = null,
    /* The P&L check (profit and loss check) provides a simplified P&L statement for B2B customers as well as an overview of other relevant operational KPIs. These can be, for example, other relevant income, expenses and cash flows from the account. In addition, the tax number is also shown (initially, only in Germany). */
    @Json(name = "xs2a_profit_loss_check")
    val xs2aProfitLossCheck: Array<String>? = null,
    /* Produces a qualitative evaluation of a bank statement (business accounts) according to various criteria and summarizes these in a school grade system (A-F). */
    @Json(name = "xs2a_rating_b2b_check")
    val xs2aRatingB2bCheck: Array<String>? = null,
    /* Produces a qualitative evaluation of a bank statement (private accounts) according to various criteria and summarizes these in a school grade system (A-F). */
    @Json(name = "xs2a_rating_b2c_check")
    val xs2aRatingB2cCheck: Array<String>? = null,
    @Json(name = "xs2a_risk_calculations_check")
    val xs2aRiskCalculationsCheck: Xs2aRiskCalculationsCheck? = null,
    @Json(name = "xs2a_seizure_check")
    val xs2aSeizureCheck: Xs2aSeizureCheck? = null,
    /* XS2A.standing_orders_check allows you to retrieve all standing orders from an account. An XS2A.standing_orders_check has no additional parameters. Simply append an empty object to the XS2A.risk object to indicate you would like this check to be performed. */
    @Json(name = "xs2a_standing_orders_check")
    val xs2aStandingOrdersCheck: Array<String>? = null,
)
