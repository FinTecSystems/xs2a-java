package com.fintecsystems.xs2a.java.models.wizard

import com.squareup.moshi.Json

data class WizardSessionResponse (
    /* Public transaction identifier. */
    @Json(name = "transaction")
    var transaction: String,
    /* Key to start the wizard */
    @Json(name = "wizard_session_key")
    var wizardSessionKey: String,
)