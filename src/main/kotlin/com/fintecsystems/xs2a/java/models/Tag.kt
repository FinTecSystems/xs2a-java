package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson

enum class Tag(val tag: String) {
    ALIMONY("alimony"),
    BANKING_FEES("banking-fees"),
    BAD_KEYWORDS("bad-keywords"),
    CASH("cash"),
    CHARGEBACK("chargeback"),
    CHARGEBACK_AMOUNT("chargeback-amount"),
    CHARGEBACK_FEES("chargeback-fees"),
    CHILD_BENEFIT("child-benefit"),
    CREDIT("credit"),
    CREDIT_BUILDING("credit-building"),
    CREDIT_CARD("credit-card"),
    CROSS_COUNTRY("cross-country"),
    CRYPTO("crypto"),
    DEPOSIT("deposit"),
    DIVIDEND_AND_SECURITIES("dividend-and-securities"),
    DIRECT_DEBIT("direct-debit"),
    DOG_OWNER("dog-owner"),
    E_COMMERCE("e-commerce"),
    EC_CARD("ec-card"),
    ELECTRICITY("electricity"),
    ENCASHMENT("encashment"),
    EXPENDITURE("expenditure"),
    FOOD("food"),
    GAMBLING("gambling"),
    GOVERNMENT_SUPPORT("government-support"),
    GROCERIES("groceries"),
    HEALTH("health"),
    HEATING("heating"),
    HOUSEHOLD("household"),
    HOUSEHOLDER_FEES("householder-fees"),
    HORSE_OWNER("horse-owner"),
    INCOME("income"),
    INSTALLMENT_PAYMENT("installment-payment"),
    INSURANCE("insurance"),
    INSURANCE_HEALTH("insurance-health"),
    INSURANCE_HEALTH_STATUTORY("insurance-health-statutory"),
    INSURANCE_HEALTH_PRIVATE("insurance-health-private"),
    INSURANCE_HEALTH_SUPPLEMENTARY("insurance-health-supplementary"),
    INSURANCE_INDEMNITY_ACCIDENT("insurance-indemnity-accident"),
    INSURANCE_LEGAL("insurance-legal"),
    INSURANCE_LIFE("insurance-life"),
    INSURANCE_VEHICLE("insurance-vehicle"),
    INTEREST("interest"),
    LEASING("leasing"),
    LIMIT_EXCESS("limit-excess"),
    LIVING_COST("living-cost"),
    LOTTERY("lottery"),
    MARGINAL_EMPLOYMENT("marginal-employment"),
    MEDIA("media"),
    MONEY_TRANSFER_SERVICE("money-transfer-service"),
    NOTICE("notice"),
    P_ACCOUNT("p-account"),
    PARENTS_BENEFIT("parents-benefit"),
    PENSION("pension"),
    PRECIOUS_METALS("precious-metals"),
    PSP("psp"),
    PUBLIC_FEES("public-fees"),
    RECALL_TRANSACTION("recall-transaction"),
    RECREATION("recreation"),
    REFUND("refund"),
    REFUND_TRANSFER("refund-transfer"),
    RENT("rent"),
    RENT_HABITATION("rent-habitation"),
    RENT_HABITATION_PARKING("rent-habitation-parking"),
    RENT_PARKING("rent-parking"),
    RENTAL_REVENUE_HABITATION("rental-revenue-habitation"),
    RENTAL_REVENUE_PARKING("rental-revenue-parking"),
    RENTAL_REVENUE_HABITATION_PARKING("rental-revenue-habitation-parking"),
    RESERVE_AMOUNT("reserve-amount"),
    REVENUE("revenue"),
    REVERSE_TRANSFER("reverse-transfer"),
    SALARY("salary"),
    SALES("sales"),
    SAVINGS("savings"),
    SAVINGS_BUILDING("savings-building"),
    SEIZURE("seizure"),
    SELF_EMPLOYED("self-employed"),
    SERVICE("service"),
    SHORT_TIME_ALLOWANCE("short-time-allowance"),
    STUDENT_BENEFIT("student-benefit"),
    TAX_OFFICE("tax-office"),
    TAX_VEHICLE("tax-vehicle"),
    TELECOMMUNICATION("telecommunication"),
    TRANSFER("transfer"),
    TRANSPORT("transport"),
    VEHICLE("vehicle"),
    WATER("water");

    companion object {
        private val valueMap = values().associateBy(Tag::tag)

        @ToJson fun toJson(tag: Tag) = tag.tag;
        @FromJson fun fromJson(tag: String) = valueMap[tag]
    }
}
