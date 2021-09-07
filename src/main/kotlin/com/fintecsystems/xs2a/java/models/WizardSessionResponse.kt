package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

data class WizardSessionResponse (
    /* Public transaction identifier. */
    @Json(name = "transaction")
    @JvmField
    val transaction: String,
    /* Key to start the wizard */
    @Json(name = "wizard_session_key")
    @JvmField
    val wizardSessionKey: String,
)