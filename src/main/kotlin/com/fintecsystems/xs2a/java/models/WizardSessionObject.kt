package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param id Internal identifier.
 * @param transaction Public transaction identifier.
 * @param wizardSessionKey Key to start the wizard
 * @param product Name of the used product.
 * @param parameters An array which contains the current wizard configuration.
 * @param lastError The last occurred error. This is overwritten, if another error occurs.
 * @param testmode true if this session runs in testmode. false otherwise.
 * @param finished true if this session was finished successfully. false if not or still running.
 * @param currentStep The current wizard step of this session.
 * @param createdAt Type of creation
 * @param `object` String with content 'wizard_session'
 */

data class WizardSessionObject(
    /* Internal identifier. */
    @Json(name = "id")
    var id: String,
    /* Public transaction identifier. */
    @Json(name = "transaction")
    var transaction: String,
    /* Key to start the wizard */
    @Json(name = "wizard_session_key")
    var wizardSessionKey: String,
    /* Name of the used product. */
    @Json(name = "product")
    var product: Product? = null,
    /* An array which contains the current wizard configuration. */
    @Json(name = "parameters")
    var parameters: Any,
    /* The last occurred error. This is overwritten, if another error occurs. */
    @Json(name = "last_error")
    var lastError: String,
    /* true if this session runs in testmode. false otherwise. */
    @Json(name = "testmode")
    var testmode: Boolean,
    /* true if this session was finished successfully. false if not or still running. */
    @Json(name = "finished")
    var finished: Boolean,
    /* The current wizard step of this session. */
    @Json(name = "current_step")
    var currentStep: String,
    /* Type of creation */
    @Json(name = "created_at")
    var createdAt: LocalDateTime,
    /* String with content 'wizard_session' */
    @Json(name = "object")
    var `object`: String
) {

    /**
     * Name of the used product.
     * Values: risk,pay
     */
    enum class Product(var value: String) {
        @Json(name = "xs2a_risk")
        RISK("xs2a_risk"),
        @Json(name = "xs2a_pay")
        PAY("xs2a_pay");
    }
}

