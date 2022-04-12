package com.fintecsystems.xs2a.java.helper

import com.fintecsystems.xs2a.java.models.risk.Category
import com.fintecsystems.xs2a.java.models.common.Tag
import com.squareup.moshi.*
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.fintecsystems.xs2a.java.models.form.*
import com.fintecsystems.xs2a.java.models.form.radio.FormRadio
import com.fintecsystems.xs2a.java.models.risk.checks.Xs2aRiskCalculationsCheckFunction

object JsonSerializer {
    val moshi: Moshi = Moshi.Builder()
        .add(
            PolymorphicJsonAdapterFactory.of(FormBase::class.java, "type")
                .withSubtype(FormCaptcha::class.java, "captcha")
                .withSubtype(FormCheckbox::class.java, "checkbox")
                .withSubtype(FormFlicker::class.java, "flicker")
                .withSubtype(FormHelpText::class.java, "help_text")
                .withSubtype(FormImage::class.java, "image")
                .withSubtype(FormMulti::class.java, "multi")
                .withSubtype(FormPassword::class.java, "password")
                .withSubtype(FormRadio::class.java, "radio")
                .withSubtype(FormSelect::class.java, "select")
                .withSubtype(FormTabs::class.java, "tabs")
                .withSubtype(FormText::class.java, "text")
                .withSubtype(FormRedirect::class.java, "redirect")
        )
        .add(NullableBooleanAdapter)
        .add(BooleanAdapter)
        .add(LocalDateAdapter)
        .add(LocalDateTimeAdapter)
        .addLast(KotlinJsonAdapterFactory())
        .add(Tag.Companion)
        .add(Xs2aRiskCalculationsCheckFunction.Companion)
        .add(Category.Companion)
        .build()

    inline fun <reified T> parseJson(json: String) = moshi
        .adapter(T::class.java)
        .fromJson(json)!!

    inline fun <reified T> toJson(body: T): String = moshi
        .adapter(T::class.java)
        .toJson(body)
}