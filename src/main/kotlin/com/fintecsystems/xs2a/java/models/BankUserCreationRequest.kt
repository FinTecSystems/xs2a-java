package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

data class BankUserCreationRequest (
    /* Name of the user */
    @Json(name = "name")
    val name: String,
    /* E-Mail of the test user */
    @Json(name = "email")
    val email: String,
)