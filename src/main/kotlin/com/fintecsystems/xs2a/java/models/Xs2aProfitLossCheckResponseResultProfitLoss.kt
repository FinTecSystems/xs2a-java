
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param periodStart 
 * @param periodEnd 
 * @param periodDays 
 * @param turnoverIncome 
 * @param cashDeposit 
 * @param otherIncome 
 * @param rentExpense 
 * @param suppliesExpense 
 * @param personnelExpense 
 * @param taxExpense 
 * @param otherExpense 
 * @param cashflow 
 * @param cashflowRevenueRatio 
 */

data class Xs2aProfitLossCheckResponseResultProfitLoss (
    @Json(name = "period_start")
    val periodStart: String,
    @Json(name = "period_end")
    val periodEnd: String,
    @Json(name = "period_days")
    val periodDays: Int,
    @Json(name = "turnover_income")
    val turnoverIncome: Float,
    @Json(name = "cash_deposit")
    val cashDeposit: Float,
    @Json(name = "other_income")
    val otherIncome: Float,
    @Json(name = "rent_expense")
    val rentExpense: Float,
    @Json(name = "supplies_expense")
    val suppliesExpense: Float,
    @Json(name = "personnel_expense")
    val personnelExpense: Float,
    @Json(name = "tax_expense")
    val taxExpense: Float,
    @Json(name = "other_expense")
    val otherExpense: Float,
    @Json(name = "cashflow")
    val cashflow: Float,
    @Json(name = "cashflow_revenue_ratio")
    val cashflowRevenueRatio: Float
)

