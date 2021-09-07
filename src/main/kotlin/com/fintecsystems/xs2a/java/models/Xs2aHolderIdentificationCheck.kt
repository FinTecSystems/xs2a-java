
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * XS2A.holder_identification_check. Using this module a list of names can be checked against the name of the accountholder of all accounts in the bank connection. For the request only the first name and last name must be transferred. As result you get the information if there is a match per account and given name and lastname.
 * @param expectHolders Array of objects containing firstnames and lastnames.
 */

data class Xs2aHolderIdentificationCheck (
    /* Array of objects containing firstnames and lastnames. */
    @Json(name = "expect_holders")
    @JvmField
    val expectHolders: List<ExpectedHolderObject>
)

