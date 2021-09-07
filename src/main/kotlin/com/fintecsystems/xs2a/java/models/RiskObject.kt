package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param id Transaction id
 * @param transaction Internal XS2A transaction id. This id will be the same for the whole transaction
 * @param accountHolder Account holder name
 * @param iban IBAN
 * @param bic BIC
 * @param bankName Bank name
 * @param countryId Two letter country code id, e.g. AT, CH, DE
 * @param testmode Indicates whether or not it is a test transaction
 * @param createdAt Date of creation
 * @param metadata Custom data will be returned unchanged. If no data was submitted, this field will be null
 * @param merchantId Data will be returned unchanged
 * @param `object` Object type, in this case a xs2a_risk
 * @param xs2aAccountSnapshot
 * @param xs2aBalanceCheck
 * @param xs2aBalanceOverview
 * @param xs2aCashflowOverview
 * @param xs2aChargebackCheck
 * @param xs2aChildrenCheck
 * @param xs2aRatingB2bCheck
 * @param xs2aRatingB2cCheck
 * @param xs2aProfitLossCheck
 * @param xs2aIncomeCheck
 * @param xs2aAccountLinkedOffersCheck
 * @param xs2aCreditCheck
 * @param xs2aDirectDebitCheck
 * @param xs2aFactSheetLists
 * @param xs2aOverdraftLimitCheck
 * @param xs2aSeizureCheck
 * @param xs2aStandingOrdersCheck
 * @param xs2aAllAccountsCheck
 * @param xs2aAccountStatusCheck
 * @param xs2aHolderIdentificationCheck
 * @param xs2aRiskCalculationsCheck
 * @param xs2aAccountCharacteristicsCheck
 */

data class RiskObject(
    /* Transaction id */
    @Json(name = "id")
    val id: String,
    /* Internal XS2A transaction id. This id will be the same for the whole transaction */
    @Json(name = "transaction")
    val transaction: String,
    /* Account holder name */
    @Json(name = "account_holder")
    val accountHolder: String,
    /* IBAN */
    @Json(name = "iban")
    val iban: String,
    /* BIC */
    @Json(name = "bic")
    val bic: String? = null,
    /* Bank name */
    @Json(name = "bank_name")
    val bankName: String,
    /* Two letter country code id, e.g. AT, CH, DE */
    @Json(name = "country_id")
    val countryId: CountryId? = null,
    /* Indicates whether or not it is a test transaction */
    @Json(name = "testmode")
    val testmode: Boolean,
    /* Date of creation */
    @Json(name = "created_at")
    val createdAt: LocalDateTime,
    /* Custom data will be returned unchanged. If no data was submitted, this field will be null */
    @Json(name = "metadata")
    val metadata: Map<String, Any>? = null,
    /* Data will be returned unchanged */
    @Json(name = "merchant_id")
    val merchantId: String? = null,
    /* Object type, in this case a xs2a_risk */
    @Json(name = "object")
    val `object`: String,
    @Json(name = "xs2a_account_snapshot")
    val xs2aAccountSnapshot: Xs2aAccountSnapshotResponse? = null,
    @Json(name = "xs2a_balance_check")
    val xs2aBalanceCheck: Xs2aBalanceCheckResponse? = null,
    @Json(name = "xs2a_balance_overview")
    val xs2aBalanceOverview: Xs2aBalanceOverviewResponse? = null,
    @Json(name = "xs2a_cashflow_overview")
    val xs2aCashflowOverview: Xs2aCashflowOverviewResponse? = null,
    @Json(name = "xs2a_chargeback_check")
    val xs2aChargebackCheck: Xs2aChargebackCheckResponse? = null,
    @Json(name = "xs2a_children_check")
    val xs2aChildrenCheck: Xs2aChildrenCheckResponse? = null,
    @Json(name = "xs2a_rating_b2b_check")
    val xs2aRatingB2bCheck: Xs2aRatingB2bCheckResponse? = null,
    @Json(name = "xs2a_rating_b2c_check")
    val xs2aRatingB2cCheck: Xs2aRatingB2cCheckResponse? = null,
    @Json(name = "xs2a_profit_loss_check")
    val xs2aProfitLossCheck: Xs2aProfitLossCheckResponse? = null,
    @Json(name = "xs2a_income_check")
    val xs2aIncomeCheck: Xs2aIncomeCheckResponse? = null,
    @Json(name = "xs2a_account_linked_offers_check")
    val xs2aAccountLinkedOffersCheck: Xs2aAccountLinkedOffersCheckResponse? = null,
    @Json(name = "xs2a_credit_check")
    val xs2aCreditCheck: Xs2aCreditCheckResponse? = null,
    @Json(name = "xs2a_direct_debit_check")
    val xs2aDirectDebitCheck: Xs2aDirectDebitCheckResponse? = null,
    @Json(name = "xs2a_fact_sheet_lists")
    val xs2aFactSheetLists: Xs2aFactSheetListsResponse? = null,
    @Json(name = "xs2a_overdraft_limit_check")
    val xs2aOverdraftLimitCheck: Xs2aOverdraftLimitCheckResponse? = null,
    @Json(name = "xs2a_seizure_check")
    val xs2aSeizureCheck: Xs2aSeizureCheckResponse? = null,
    @Json(name = "xs2a_name_check")
    val xs2aNameCheck: Xs2aNameCheckResponse? = null,
    @Json(name = "xs2a_standing_orders_check")
    val xs2aStandingOrdersCheck: Xs2aStandingOrdersCheckResponse? = null,
    @Json(name = "xs2a_all_accounts_check")
    val xs2aAllAccountsCheck: Xs2aAllAccountsCheckResponse? = null,
    @Json(name = "xs2a_account_status_check")
    val xs2aAccountStatusCheck: Xs2aAccountStatusCheckResponse? = null,
    @Json(name = "xs2a_holder_identification_check")
    val xs2aHolderIdentificationCheck: Xs2aHolderIdentificationCheckResponse? = null,
    @Json(name = "xs2a_risk_calculations_check")
    val xs2aRiskCalculationsCheck: Xs2aRiskCalculationsCheckResponse? = null,
    @Json(name = "xs2a_account_characteristics_check")
    val xs2aAccountCharacteristicsCheck: Xs2aAccountCharacteristicsCheckResponse? = null,
)

