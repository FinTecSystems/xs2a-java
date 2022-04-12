package com.fintecsystems.xs2a.java.models.risk.checks

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson

enum class Xs2aRiskCalculationsCheckFunction(val tag: String) {
    SUM("sum"),
    COUNT("count"),
    MEDIAN("median"),
    AVERAGE("average"),
    LAST("last"),
    MIN("min"),
    MAX("max"),
    MIN_DATE("min_date"),
    MAX_DATE("max_date"),
    CLEAN_SUM("clean_sum"),
    EXISTS("exists"),
    SUMS_OF_EVERY_MONTH("sums_of_every_month"),
    COUNTS_OF_EVERY_MONTH("counts_of_every_month"),
    MEDIAN_OF_ALL_MONTH_SUMS("median_of_all_month_sums"),
    AVERAGE_OF_ALL_MONTH_SUMS("average_of_all_month_sums"),
    MIN_OF_ALL_MONTH_SUMS("min_of_all_month_sums"),
    MAX_OF_ALL_MONTH_SUMS("max_of_all_month_sums"),
    DISTINCT_COUNTER_HOLDERS("distinct_counter_holders");

    companion object {
        private val valueMap = values().associateBy(Xs2aRiskCalculationsCheckFunction::tag)

        @ToJson
        fun toJson(tag: Xs2aRiskCalculationsCheckFunction) = tag.tag
        @FromJson
        fun fromJson(tag: String) = valueMap[tag]
    }
}
