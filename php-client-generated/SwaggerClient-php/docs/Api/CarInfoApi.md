# Swagger\Client\CarInfoApi

All URIs are relative to *https://app.auto-ways.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCarByPlateEs**](CarInfoApi.md#getcarbyplatees) | **GET** /v1/es/ | Find car by plate  , country  (ES)
[**getCarByPlateFr**](CarInfoApi.md#getcarbyplatefr) | **GET** /v1/fr/ | Find car by plate , country  (FR)
[**getCarByPlateIt**](CarInfoApi.md#getcarbyplateit) | **GET** /v1/it/ | Find car by plate  , country  (IT)
[**getCarByPlatePt**](CarInfoApi.md#getcarbyplatept) | **GET** /v1/pt/ | Find car by plate  , country  (PT)
[**getCarByVIN**](CarInfoApi.md#getcarbyvin) | **GET** /v1/vin/ | Find car by VIN

# **getCarByPlateEs**
> getCarByPlateEs($token, $plaque, $output_lang)

Find car by plate  , country  (ES)

Return vehicle data from license plate

### Example
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
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **string**| car plate | [default to 1509HJB]
 **output_lang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCarByPlateFr**
> getCarByPlateFr($token, $plaque, $output_lang)

Find car by plate , country  (FR)

Return vehicle data from license plate

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

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
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **string**| car plate | [default to FH034DD]
 **output_lang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCarByPlateIt**
> getCarByPlateIt($token, $plaque, $output_lang)

Find car by plate  , country  (IT)

Return vehicle data from license plate

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

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
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **string**| car plate | [default to FG995BB]
 **output_lang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCarByPlatePt**
> getCarByPlatePt($token, $plaque, $output_lang)

Find car by plate  , country  (PT)

Return vehicle data from license plate

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

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
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **string**| car plate | [default to 89XL64]
 **output_lang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCarByVIN**
> getCarByVIN($token, $vin, $output_lang)

Find car by VIN

Return vehicle data from license plate

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **vin** | **string**| Your VIN (Vehicle Identification Number) | [default to VF1R9800962986572]
 **output_lang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

