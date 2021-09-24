# xs2a-java
[![Maven Central](https://img.shields.io/maven-central/v/com.fintecsystems/xs2a-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.fintecsystems%22%20AND%20a:%22xs2a-java%22)

Java SDK for FinTecSystems XS2A API. FinTecSystems is licensed by BaFin as a payment initiation and account information service and 
offers Access-to-Account services under the XS2A API.

This SDK allows you to talk to and consume XS2A API in Java environments.

- [SDK Documentation (Dokka)](https://docs.fintecsystems.com/xs2a-java/)
- [API Reference](https://docs.fintecsystems.com)
- [FinTecSystems Homepage](https://fintecsystems.com)

## Installation

### Requirements

- Java 1.8 or later

### Gradle
Add this dependency to your project's build file:
```groovy
implementation 'com.fintecsystems:xs2a-java:<version>'
```

### Maven
Add this dependency to your project's POM:
```xml
<dependency>
  <groupId>com.fintecsystems</groupId>
  <artifactId>xs2a-java</artifactId>
  <version>version-to-use</version>
</dependency>
```

### Gradle Kotlin DSL
```groovy
implementation("com.fintecsystems:xs2a-java:<version>")
```

## Usage Example (Kotlin)
An example of creating a xs2a.risk call in Kotlin:

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

## Usage Example (Java)
An example of creating a xs2a.risk call in Java:

```java
// Create a RiskService Instance
RiskService riskService = new RiskService(apiKey);

// Build a Risk Request
Xs2aRisk risk = new Xs2aRisk();

Xs2aAccountSnapshot accountSnapShot = new Xs2aAccountSnapshot(
    10,
    LocalDate.parse("2021-01-01"),
    LocalDate.parse("2021-01-10"),
    List.of("income"),
    true,
    true
);
risk.setXs2aAccountSnapshot(accountSnapShot);
// add more risk checks as necessary ...

// Fire the request and get a response
WizardSessionResponse response = riskService.create(risk);
```

## Testing & Development

### Running tests
For the tests to be able to run you have to provide the variable `API_KEY` to the environment.

```shell
./gradlew test
```

### Generating Documentation

```shell
./gradlew generateDocs
```

The documentation will be generated into `docs`.
