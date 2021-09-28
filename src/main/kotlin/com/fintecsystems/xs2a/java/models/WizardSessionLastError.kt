package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

enum class WizardSessionLastError {
    @Json(name = "accounts_failed")
    ACCOUNTS_FAILED,

    @Json(name = "age_verification_not_confirmed")
    AGE_VERIFICATION_NOT_CONFIRMED,

    @Json(name = "authorized_person")
    AUTHORIZED_PERSON,

    @Json(name = "balance_failed")
    BALANCE_FAILED,

    @Json(name = "bank_code_unknown")
    BANK_CODE_UNKNOWN,

    @Json(name = "client_aborted")
    CLIENT_ABORTED,

    @Json(name = "client_not_started")
    CLIENT_NOT_STARTED,

    @Json(name = "consent_invalid")
    CONSENT_INVALID,

    @Json(name = "country_id_invalid")
    COUNTRY_ID_INVALID,

    @Json(name = "forced_transport_disabled")
    FORCED_TRANSPORT_DISABLED,

    @Json(name = "init_failed")
    INIT_FAILED,

    @Json(name = "login_blacklisted")
    LOGIN_BLACKLISTED,

    @Json(name = "login_failed")
    LOGIN_FAILED,

    @Json(name = "login_next_failed")
    LOGIN_NEXT_FAILED,

    @Json(name = "max_login_tries")
    MAX_LOGIN_TRIES,

    @Json(name = "max_tan_tries")
    MAX_TAN_TRIES,

    @Json(name = "no_compatible_accounts")
    NO_COMPATIBLE_ACCOUNTS,

    @Json(name = "no_transports_found")
    NO_TRANSPORTS_FOUND,

    @Json(name = "pinned_holder_not_found")
    PINNED_HOLDER_NOT_FOUND,

    @Json(name = "pinned_iban_not_found")
    PINNED_IBAN_NOT_FOUND,

    @Json(name = "pp_not_checked")
    PP_NOT_CHECKED,

    @Json(name = "session_expired")
    SESSION_EXPIRED,

    @Json(name = "security_setting_rejection")
    SECURITY_SETTING_REJECTION,

    @Json(name = "standing_orders_failed")
    STANDING_ORDERS_FAILED,

    @Json(name = "tech_error")
    TECH_ERROR,

    @Json(name = "testmode_error")
    TESTMODE_ERROR,

    @Json(name = "token_mismatch")
    TOKEN_MISMATCH,

    @Json(name = "transaction_failed")
    TRANSACTION_FAILED,

    @Json(name = "turnovers_failed")
    TURNOVERS_FAILED,

    @Json(name = "tx_rx_iban_equal")
    TX_RX_IBAN_EQUAL,

    @Json(name = "validation_failed")
    VALIDATION_FAILED,

    @Json(name = "wrong_tan")
    WRONG_TAN,
}
