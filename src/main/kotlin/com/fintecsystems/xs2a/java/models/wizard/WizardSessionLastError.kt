package com.fintecsystems.xs2a.java.models.wizard

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson

@Suppress("unused")
enum class WizardSessionLastError(val lastError: String) {
    /*
     * Common errors
     */
    SESSION_EXPIRED("session_expired"),
    TOKEN_MISMATCH("token_mismatch"),
    TECH_ERROR("tech_error"),
    CLIENT_NOT_STARTED("client_not_started"),
    CLIENT_ABORTED("client_aborted"),
    VETO_BY_MERCHANT("veto_by_merchant"),
    NONE("none"),

    /*
     * Backend failures
     */
    CONSENT_INVALID("consent_invalid"),
    INIT_FAILED("init_failed"),
    LOGIN_FAILED("login_failed"),
    LOGIN_NEXT_FAILED("login_next_failed"),
    ACCOUNTS_FAILED("accounts_failed"),
    BALANCE_FAILED("balance_failed"),
    TURNOVERS_FAILED("turnovers_failed"),
    STANDING_ORDERS_FAILED("standing_orders_failed"),
    TRANSACTION_FAILED("transaction_failed"),
    TAN_FAILED("tan_failed"),
    TAN_METHOD_NOT_ALLOWED("tan_method_not_allowed"),

    /*
     * Blacklist errors
     */
    LOGIN_BLACKLISTED("login_blacklisted"),
    ACCOUNT_BLACKLISTED("account_blacklisted"),

    /*
     * Validation errors
     */
    VALIDATION_FAILED("validation_failed"),
    PP_NOT_CHECKED("pp_not_checked"),
    MAX_LOGIN_TRIES("max_login_tries"),
    MAX_TAN_TRIES("max_tan_tries"),
    WRONG_TAN("wrong_tan"),

    /*
     * Configuration errors
     */
    TESTMODE_ERROR("testmode_error"),
    TX_RX_IBAN_EQUAL("tx_rx_iban_equal"),
    FORCED_TRANSPORT_DISABLED("forced_transport_disabled"),

    /*
     * Incompatible accounts
     */
    COUNTRY_ID_INVALID("country_id_invalid"),
    BANK_CODE_UNKNOWN("bank_code_unknown"),
    NO_TRANSPORTS_FOUND("no_transports_found"),
    NO_COMPATIBLE_ACCOUNTS("no_compatible_accounts"),
    PINNED_IBAN_NOT_FOUND("pinned_iban_not_found"),
    PINNED_HOLDER_NOT_FOUND("pinned_holder_not_found"),
    PINNED_IBAN_TRANSACTIONS_NOT_POSSIBLE("pinned_iban_transaction_not_possible"),
    AUTHORIZED_PERSON("authorized_person"),
    AUTHORIZED_PERSON_POWER_OF_ATTORNEY("authorized_person_poa"),
    AGE_VERIFICATION_NOT_CONFIRMED("age_verification_not_confirmed"),
    ACCOUNT_DATA_INCOMPLETE("account_data_incomplete"),

    /*
     * Security errors
     */
    SECURITY_IS_SEIZURE("security_is_seizure"),
    SECURITY_CHARGEBACKS_EXCEEDED("security_chargebacks_exceeded"),
    SECURITY_MAX_TA_COUNT_REACHED("security_max_ta_count_reached"),
    SECURITY_MAX_VOLUME_REACHED("security_max_volume_reached"),
    SECURITY_BALANCE_FAILED("security_balance_failed"),
    SECURITY_PREV_PAYMENTS_CHECK_FAILED("security_prev_payments_check_failed"),
    SECURITY_PENDING_PMTS_CHECK_FAILED("security_pending_pmts_check_failed"),
    SECURITY_TAGS_CHECK_FAILED("security_tags_check_failed"),
    SECURITY_OLD_TRANSACTION_MISSING("security_old_transaction_missing"),
    SECURITY_SAME_BALANCE_FAILED("security_same_balance_failed"),
    SECURITY_LOSS_PMTS_CHECK_FAILED("security_loss_pmts_check_failed"),
    SECURITY_MAX_AMOUNT_EXCEEDED("security_max_amount_exceeded"),
    SECURITY_PREBOOKED_ORDERS_EXCEEDED("security_prebooked_orders_exceeded"),
    SECURITY_LOW_TURNOVER_COUNT("security_low_turnover_count"),
    SECURITY_HIGH_ROLLER_VOLUME_REACHED("security_high_roller_volume_reached"),

    /*
     * Mapped error
     */
    SECURITY_SETTING_REJECTION("security_setting_rejection");

    companion object Adapter {
        private val valueMap = WizardSessionLastError.values().associateBy(WizardSessionLastError::lastError)

        @ToJson
        fun toJson(lastError: WizardSessionLastError) = lastError.lastError

        @FromJson
        fun fromJson(lastError: String) = if (lastError.isEmpty()) NONE else WizardSessionLastError.valueMap[lastError]
    }
}