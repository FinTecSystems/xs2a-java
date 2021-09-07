
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
    @JvmField
    val periodStart: String,
    @Json(name = "period_end")
    @JvmField
    val periodEnd: String,
    @Json(name = "period_days")
    @JvmField
    val periodDays: Int,
    @Json(name = "turnover_income")
    @JvmField
    val turnoverIncome: Float,
    @Json(name = "cash_deposit")
    @JvmField
    val cashDeposit: Float,
    @Json(name = "other_income")
    @JvmField
    val otherIncome: Float,
    @Json(name = "rent_expense")
    @JvmField
    val rentExpense: Float,
    @Json(name = "supplies_expense")
    @JvmField
    val suppliesExpense: Float,
    @Json(name = "personnel_expense")
    @JvmField
    val personnelExpense: Float,
    @Json(name = "tax_expense")
    @JvmField
    val taxExpense: Float,
    @Json(name = "other_expense")
    @JvmField
    val otherExpense: Float,
    @Json(name = "cashflow")
    @JvmField
    val cashflow: Float,
    @Json(name = "cashflow_revenue_ratio")
    @JvmField
    val cashflowRevenueRatio: Float
)

