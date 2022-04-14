package com.fintecsystems.xs2a.java.models.wizard

import com.squareup.moshi.Json

@Suppress("unused")
enum class WizardSessionLastError {
    /*
     * Common errors
     */
    @Json(name = "session_expired")
	SESSION_EXPIRED,
    @Json(name = "token_mismatch")
	TOKEN_MISMATCH,
    @Json(name = "tech_error")
	TECH_ERROR,
    @Json(name = "client_not_started")
	CLIENT_NOT_STARTED,
    @Json(name = "client_aborted")
	CLIENT_ABORTED,
    @Json(name = "none")
	NONE,

    /*
     * Backend failures
     */
    @Json(name = "consent_invalid")
	CONSENT_INVALID,
    @Json(name = "init_failed")
	INIT_FAILED,
    @Json(name = "login_failed")
	LOGIN_FAILED,
    @Json(name = "login_next_failed")
	LOGIN_NEXT_FAILED,
    @Json(name = "accounts_failed")
	ACCOUNTS_FAILED,
    @Json(name = "balance_failed")
	BALANCE_FAILED,
    @Json(name = "turnovers_failed")
	TURNOVERS_FAILED,
    @Json(name = "standing_orders_failed")
	STANDING_ORDERS_FAILED,
    @Json(name = "transaction_failed")
	TRANSACTION_FAILED,
    @Json(name = "tan_failed")
	TAN_FAILED,
    @Json(name = "tan_method_not_allowed")
	TAN_METHOD_NOT_ALLOWED,

    /*
     * Blacklist errors
     */
    @Json(name = "login_blacklisted")
	LOGIN_BLACKLISTED,
    @Json(name = "account_blacklisted")
	ACCOUNT_BLACKLISTED,

    /*
     * Validation errors
     */
    @Json(name = "validation_failed")
	VALIDATION_FAILED,
    @Json(name = "pp_not_checked")
	PP_NOT_CHECKED,
    @Json(name = "max_login_tries")
	MAX_LOGIN_TRIES,
    @Json(name = "max_tan_tries")
	MAX_TAN_TRIES,
    @Json(name = "wrong_tan")
	WRONG_TAN,

    /*
     * Configuration errors
     */
    @Json(name = "testmode_error")
	TESTMODE_ERROR,
    @Json(name = "tx_rx_iban_equal")
	TX_RX_IBAN_EQUAL,
    @Json(name = "forced_transport_disabled")
	FORCED_TRANSPORT_DISABLED,

    /*
     * Incompatible accounts
     */
    @Json(name = "country_id_invalid")
	COUNTRY_ID_INVALID,
    @Json(name = "bank_code_unknown")
	BANK_CODE_UNKNOWN,
    @Json(name = "no_transports_found")
	NO_TRANSPORTS_FOUND,
    @Json(name = "no_compatible_accounts")
	NO_COMPATIBLE_ACCOUNTS,
    @Json(name = "pinned_iban_not_found")
	PINNED_IBAN_NOT_FOUND,
    @Json(name = "pinned_holder_not_found")
	PINNED_HOLDER_NOT_FOUND,
    @Json(name = "pinned_iban_transaction_not_possible")
	PINNED_IBAN_TRANSACTIONS_NOT_POSSIBLE,
    @Json(name = "authorized_person")
	AUTHORIZED_PERSON,
    @Json(name = "authorized_person_poa")
	AUTHORIZED_PERSON_POWER_OF_ATTORNEY,
    @Json(name = "age_verification_not_confirmed")
	AGE_VERIFICATION_NOT_CONFIRMED,
    @Json(name = "account_data_incomplete")
	ACCOUNT_DATA_INCOMPLETE,

    /*
     * Security errors
     */
    @Json(name = "security_is_seizure")
	SECURITY_IS_SEIZURE,
    @Json(name = "security_chargebacks_exceeded")
	SECURITY_CHARGEBACKS_EXCEEDED,
    @Json(name = "security_max_ta_count_reached")
	SECURITY_MAX_TA_COUNT_REACHED,
    @Json(name = "security_max_volume_reached")
	SECURITY_MAX_VOLUME_REACHED,
    @Json(name = "security_balance_failed")
	SECURITY_BALANCE_FAILED,
    @Json(name = "security_prev_payments_check_failed")
	SECURITY_PREV_PAYMENTS_CHECK_FAILED,
    @Json(name = "security_pending_pmts_check_failed")
	SECURITY_PENDING_PMTS_CHECK_FAILED,
    @Json(name = "security_tags_check_failed")
	SECURITY_TAGS_CHECK_FAILED,
    @Json(name = "security_old_transaction_missing")
	SECURITY_OLD_TRANSACTION_MISSING,
    @Json(name = "security_same_balance_failed")
	SECURITY_SAME_BALANCE_FAILED,
    @Json(name = "security_loss_pmts_check_failed")
	SECURITY_LOSS_PMTS_CHECK_FAILED,
    @Json(name = "security_max_amount_exceeded")
	SECURITY_MAX_AMOUNT_EXCEEDED,
    @Json(name = "security_prebooked_orders_exceeded")
	SECURITY_PREBOOKED_ORDERS_EXCEEDED,
    @Json(name = "security_low_turnover_count")
	SECURITY_LOW_TURNOVER_COUNT,
    @Json(name = "security_high_roller_volume_reached")
	SECURITY_HIGH_ROLLER_VOLUME_REACHED,

    /*
     * Mapped error
     */
    @Json(name = "security_setting_rejection")
	SECURITY_SETTING_REJECTION,
}