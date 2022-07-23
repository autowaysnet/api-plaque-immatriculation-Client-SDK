# SwaggerClient-php
Web Service which allows you to query the official database in real time by simply entering a license plate or a VIN. You allow your ecosystem to identify in one click the official data of a vehicle among the 80M license plates in France, Spain, Italy and Portugal.

This PHP package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0-oas3
- Build package: io.swagger.codegen.v3.generators.php.PhpClientCodegen

## Requirements

PHP 5.5 and later

## Installation & Usage
### Composer

To install the bindings via [Composer](http://getcomposer.org/), add the following to `composer.json`:

```
{
  "repositories": [
    {
      "type": "git",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
    require_once('/path/to/SwaggerClient-php/vendor/autoload.php');
```

## Tests

To run the unit tests:

```
composer install
./vendor/bin/phpunit
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\CarInfoApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$token = "4a486e221ea6d4a888671242b5fe0fed"; // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo
$plaque = "1509HJB"; // string | car plate
$output_lang = "fr"; // string | Define the API output language (fr,en)

try {
    $apiInstance->getCarByPlateEs($token, $plaque, $output_lang);
} catch (Exception $e) {
    echo 'Exception when calling CarInfoApi->getCarByPlateEs: ', $e->getMessage(), PHP_EOL;
}

$apiInstance = new Swagger\Client\Api\CarInfoApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$token = "4a486e221ea6d4a888671242b5fe0fed"; // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo
$plaque = "FH034DD"; // string | car plate
$output_lang = "fr"; // string | Define the API output language (fr,en)

try {
    $apiInstance->getCarByPlateFr($token, $plaque, $output_lang);
} catch (Exception $e) {
    echo 'Exception when calling CarInfoApi->getCarByPlateFr: ', $e->getMessage(), PHP_EOL;
}

$apiInstance = new Swagger\Client\Api\CarInfoApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$token = "4a486e221ea6d4a888671242b5fe0fed"; // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo
$plaque = "FG995BB"; // string | car plate
$output_lang = "fr"; // string | Define the API output language (fr,en)

try {
    $apiInstance->getCarByPlateIt($token, $plaque, $output_lang);
} catch (Exception $e) {
    echo 'Exception when calling CarInfoApi->getCarByPlateIt: ', $e->getMessage(), PHP_EOL;
}

$apiInstance = new Swagger\Client\Api\CarInfoApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$token = "4a486e221ea6d4a888671242b5fe0fed"; // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo
$plaque = "89XL64"; // string | car plate
$output_lang = "fr"; // string | Define the API output language (fr,en)

try {
    $apiInstance->getCarByPlatePt($token, $plaque, $output_lang);
} catch (Exception $e) {
    echo 'Exception when calling CarInfoApi->getCarByPlatePt: ', $e->getMessage(), PHP_EOL;
}

$apiInstance = new Swagger\Client\Api\CarInfoApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$token = "4a486e221ea6d4a888671242b5fe0fed"; // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo
$vin = "VF1R9800962986572"; // string | Your VIN (Vehicle Identification Number)
$output_lang = "fr"; // string | Define the API output language (fr,en)

try {
    $apiInstance->getCarByVIN($token, $vin, $output_lang);
} catch (Exception $e) {
    echo 'Exception when calling CarInfoApi->getCarByVIN: ', $e->getMessage(), PHP_EOL;
}
?>
```

## Documentation for API Endpoints

All URIs are relative to *https://app.auto-ways.net/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CarInfoApi* | [**getCarByPlateEs**](docs/Api/CarInfoApi.md#getcarbyplatees) | **GET** /v1/es/ | Find car by plate  , country  (ES)
*CarInfoApi* | [**getCarByPlateFr**](docs/Api/CarInfoApi.md#getcarbyplatefr) | **GET** /v1/fr/ | Find car by plate , country  (FR)
*CarInfoApi* | [**getCarByPlateIt**](docs/Api/CarInfoApi.md#getcarbyplateit) | **GET** /v1/it/ | Find car by plate  , country  (IT)
*CarInfoApi* | [**getCarByPlatePt**](docs/Api/CarInfoApi.md#getcarbyplatept) | **GET** /v1/pt/ | Find car by plate  , country  (PT)
*CarInfoApi* | [**getCarByVIN**](docs/Api/CarInfoApi.md#getcarbyvin) | **GET** /v1/vin/ | Find car by VIN

## Documentation For Models


## Documentation For Authorization

 All endpoints do not require authorization.


## Author

contact@auto-ways.net
