# Go API client for swagger

Web Service which allows you to query the official database in real time by simply entering a license plate or a VIN. You allow your ecosystem to identify in one click the official data of a vehicle among the 80M license plates in France, Spain, Italy and Portugal.

## Overview
This API client was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  By using the [swagger-spec](https://github.com/swagger-api/swagger-spec) from a remote server, you can easily generate an API client.

- API version: 1.0.0-oas3
- Package version: 1.0.0
- Build package: io.swagger.codegen.v3.generators.go.GoClientCodegen

## Installation
Put the package under your project folder and add the following in import:
```golang
import "./swagger"
```

## Documentation for API Endpoints

All URIs are relative to *https://app.auto-ways.net/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CarInfoApi* | [**GetCarByPlateEs**](docs/CarInfoApi.md#getcarbyplatees) | **Get** /v1/es/ | Find car by plate  , country  (ES)
*CarInfoApi* | [**GetCarByPlateFr**](docs/CarInfoApi.md#getcarbyplatefr) | **Get** /v1/fr/ | Find car by plate , country  (FR)
*CarInfoApi* | [**GetCarByPlateIt**](docs/CarInfoApi.md#getcarbyplateit) | **Get** /v1/it/ | Find car by plate  , country  (IT)
*CarInfoApi* | [**GetCarByPlatePt**](docs/CarInfoApi.md#getcarbyplatept) | **Get** /v1/pt/ | Find car by plate  , country  (PT)
*CarInfoApi* | [**GetCarByVIN**](docs/CarInfoApi.md#getcarbyvin) | **Get** /v1/vin/ | Find car by VIN

## Documentation For Models


## Documentation For Authorization
 Endpoints do not require authorization.


## Author

contact@auto-ways.net