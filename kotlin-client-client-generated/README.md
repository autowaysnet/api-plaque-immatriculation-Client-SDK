# io.swagger.client - Kotlin client library for API Car plate - API Plaque immatriculation

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://app.auto-ways.net/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CarInfoApi* | [**getCarByPlateEs**](docs/CarInfoApi.md#getcarbyplatees) | **GET** /v1/es/ | Find car by plate  , country  (ES)
*CarInfoApi* | [**getCarByPlateFr**](docs/CarInfoApi.md#getcarbyplatefr) | **GET** /v1/fr/ | Find car by plate , country  (FR)
*CarInfoApi* | [**getCarByPlateIt**](docs/CarInfoApi.md#getcarbyplateit) | **GET** /v1/it/ | Find car by plate  , country  (IT)
*CarInfoApi* | [**getCarByPlatePt**](docs/CarInfoApi.md#getcarbyplatept) | **GET** /v1/pt/ | Find car by plate  , country  (PT)
*CarInfoApi* | [**getCarByVIN**](docs/CarInfoApi.md#getcarbyvin) | **GET** /v1/vin/ | Find car by VIN

<a name="documentation-for-models"></a>
## Documentation for Models


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
