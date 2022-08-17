package com.fintecsystems.xs2a.java.models.wizard

import com.squareup.moshi.Json

enum class WizardSessionCurrentStep {
    @Json(name = "WizardLoginStep")
    WIZARD_LOGIN_STEP,

    @Json(name = "WizardLoginNextStep")
    WIZARD_LOGIN_NEXT_STEP,

    @Json(name = "WizardAccountsStep")
    WIZARD_ACCOUNTS_STEP,

    @Json(name = "WizardDataStep")
    WIZARD_DATA_STEP,

    @Json(name = "WizardTanStep")
    WIZARD_TAN_STEP,

    @Json(name = "WizardScaStep")
    WIZARD_SCA_STEP,

    @Json(name = "WizardIrpaStep")
    WIZARD_IRPA_STEP,

    @Json(name = "WizardAutoSubmitStep")
    WIZARD_AUTOSUBMIT_STEP,

    @Json(name = "WizardFinishStep")
    WIZARD_FINISH_STEP,

    @Json(name = "WizardStartStep")
    WIZARD_START_STEP,

    @Json(name = "WizardShowcaseStep")
    WIZARD_SHOWCASE_STEP,

    @Json(name = "WizardPreAccountsStep")
    WIZARD_PRE_ACCOUNTS_STEP,

    @Json(name = "WizardPreDataStep")
    WIZARD_PRE_DATA_STEP,

    @Json(name = "WizardPreLoginStep")
    WIZARD_PRE_LOGIN_STEP,

    @Json(name = "WizardOauthRedirect")
    WIZARD_OAUTH_REDIRECT,

    @Json(name = "WizardOauthRedirectNok")
    WIZARD_OAUTH_REDIRECT_NOT_OK,

    @Json(name = "RiskUpload")
    RISK_UPLOAD,

    @Json(name = "WizardLoadingAccountsStep")
    WIZARD_LOADING_ACCOUNTS_STEP,
}