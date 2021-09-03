# xs2a-java

Java SDK for [FinTecSystems XS2A API](https://fintecsystems.com).

## Usage Example
An example of creating a xs2a.risk call:

```kotlin
// Create a RiskService Instance
val riskService = RiskService(apiKey)

// Build a Risk Request
val risk = Xs2aRisk(
    xs2aAccountSnapshot = Xs2aAccountSnapshot(
        days = 10,
        from = LocalDate.parse("2021-01-01"),
        to = LocalDate.parse("2021-01-10"),
        filters = listOf("income"),
        allAccounts = true,
        allTags = true
    ),
    // add more risk checks as necessary ...
)

// Fire the request and get a response
val response = riskService.create(risk)
```


