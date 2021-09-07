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
    @JvmField
    val id: String,
    /* Public transaction identifier. */
    @Json(name = "transaction")
    @JvmField
    val transaction: String,
    /* Key to start the wizard */
    @Json(name = "wizard_session_key")
    @JvmField
    val wizardSessionKey: String,
    /* Name of the used product. */
    @Json(name = "product")
    @JvmField
    val product: Product? = null,
    /* An array which contains the current wizard configuration. */
    @Json(name = "parameters")
    @JvmField
    val parameters: Any,
    /* The last occurred error. This is overwritten, if another error occurs. */
    @Json(name = "last_error")
    @JvmField
    val lastError: String,
    /* true if this session runs in testmode. false otherwise. */
    @Json(name = "testmode")
    @JvmField
    val testmode: Boolean,
    /* true if this session was finished successfully. false if not or still running. */
    @Json(name = "finished")
    @JvmField
    val finished: Boolean,
    /* The current wizard step of this session. */
    @Json(name = "current_step")
    @JvmField
    val currentStep: String,
    /* Type of creation */
    @Json(name = "created_at")
    @JvmField
    val createdAt: LocalDateTime,
    /* String with content 'wizard_session' */
    @Json(name = "object")
    @JvmField
    val `object`: String
) {

    /**
     * Name of the used product.
     * Values: risk,pay
     */
    enum class Product(@JvmField
    val value: String) {
        @Json(name = "xs2a_risk")
        RISK("xs2a_risk"),
        @Json(name = "xs2a_pay")
        PAY("xs2a_pay");
    }
}

