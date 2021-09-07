package com.fintecsystems.xs2a.java.models.form

import com.squareup.moshi.Json

abstract class FormNameBase: FormBase() {
    /* The name of the form element */
    @Json(name = "name")
    abstract var name: String
}
