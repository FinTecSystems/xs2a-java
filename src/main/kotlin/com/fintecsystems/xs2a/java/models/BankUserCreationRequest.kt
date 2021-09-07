package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

data class BankUserCreationRequest (
    /* Name of the user */
    @Json(name = "name")
    var name: String,
    /* E-Mail of the test user */
    @Json(name = "email")
    var email: String,
)