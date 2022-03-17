
package com.fintecsystems.xs2a.java.models.risk


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
    var periodStart: String,
    @Json(name = "period_end")
    var periodEnd: String,
    @Json(name = "period_days")
    var periodDays: Int,
    @Json(name = "turnover_income")
    var turnoverIncome: Float,
    @Json(name = "cash_deposit")
    var cashDeposit: Float,
    @Json(name = "other_income")
    var otherIncome: Float,
    @Json(name = "rent_expense")
    var rentExpense: Float,
    @Json(name = "supplies_expense")
    var suppliesExpense: Float,
    @Json(name = "personnel_expense")
    var personnelExpense: Float,
    @Json(name = "tax_expense")
    var taxExpense: Float,
    @Json(name = "other_expense")
    var otherExpense: Float,
    @Json(name = "cashflow")
    var cashflow: Float,
    @Json(name = "cashflow_revenue_ratio")
    var cashflowRevenueRatio: Float
)

