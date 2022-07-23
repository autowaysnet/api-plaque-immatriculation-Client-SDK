# CarInfoApi

All URIs are relative to *https://app.auto-ways.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCarByPlateEs**](CarInfoApi.md#getCarByPlateEs) | **GET** /v1/es/ | Find car by plate  , country  (ES)
[**getCarByPlateFr**](CarInfoApi.md#getCarByPlateFr) | **GET** /v1/fr/ | Find car by plate , country  (FR)
[**getCarByPlateIt**](CarInfoApi.md#getCarByPlateIt) | **GET** /v1/it/ | Find car by plate  , country  (IT)
[**getCarByPlatePt**](CarInfoApi.md#getCarByPlatePt) | **GET** /v1/pt/ | Find car by plate  , country  (PT)
[**getCarByVIN**](CarInfoApi.md#getCarByVIN) | **GET** /v1/vin/ | Find car by VIN

<a name="getCarByPlateEs"></a>
# **getCarByPlateEs**
> getCarByPlateEs(token, plaque, outputLang)

Find car by plate  , country  (ES)

Return vehicle data from license plate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//

val apiInstance = CarInfoApi()
val token : kotlin.String = token_example // kotlin.String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
val plaque : kotlin.String = plaque_example // kotlin.String | car plate 
val outputLang : kotlin.String = outputLang_example // kotlin.String | Define the API output language (fr,en)
try {
    apiInstance.getCarByPlateEs(token, plaque, outputLang)
} catch (e: ClientException) {
    println("4xx response calling CarInfoApi#getCarByPlateEs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CarInfoApi#getCarByPlateEs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **kotlin.String**| car plate  | [default to 1509HJB]
 **outputLang** | **kotlin.String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarByPlateFr"></a>
# **getCarByPlateFr**
> getCarByPlateFr(token, plaque, outputLang)

Find car by plate , country  (FR)

Return vehicle data from license plate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//

val apiInstance = CarInfoApi()
val token : kotlin.String = token_example // kotlin.String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
val plaque : kotlin.String = plaque_example // kotlin.String | car plate 
val outputLang : kotlin.String = outputLang_example // kotlin.String | Define the API output language (fr,en)
try {
    apiInstance.getCarByPlateFr(token, plaque, outputLang)
} catch (e: ClientException) {
    println("4xx response calling CarInfoApi#getCarByPlateFr")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CarInfoApi#getCarByPlateFr")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **kotlin.String**| car plate  | [default to FH034DD]
 **outputLang** | **kotlin.String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarByPlateIt"></a>
# **getCarByPlateIt**
> getCarByPlateIt(token, plaque, outputLang)

Find car by plate  , country  (IT)

Return vehicle data from license plate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//

val apiInstance = CarInfoApi()
val token : kotlin.String = token_example // kotlin.String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
val plaque : kotlin.String = plaque_example // kotlin.String | car plate 
val outputLang : kotlin.String = outputLang_example // kotlin.String | Define the API output language (fr,en)
try {
    apiInstance.getCarByPlateIt(token, plaque, outputLang)
} catch (e: ClientException) {
    println("4xx response calling CarInfoApi#getCarByPlateIt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CarInfoApi#getCarByPlateIt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **kotlin.String**| car plate  | [default to FG995BB]
 **outputLang** | **kotlin.String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarByPlatePt"></a>
# **getCarByPlatePt**
> getCarByPlatePt(token, plaque, outputLang)

Find car by plate  , country  (PT)

Return vehicle data from license plate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//

val apiInstance = CarInfoApi()
val token : kotlin.String = token_example // kotlin.String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
val plaque : kotlin.String = plaque_example // kotlin.String | car plate 
val outputLang : kotlin.String = outputLang_example // kotlin.String | Define the API output language (fr,en)
try {
    apiInstance.getCarByPlatePt(token, plaque, outputLang)
} catch (e: ClientException) {
    println("4xx response calling CarInfoApi#getCarByPlatePt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CarInfoApi#getCarByPlatePt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **kotlin.String**| car plate  | [default to 89XL64]
 **outputLang** | **kotlin.String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarByVIN"></a>
# **getCarByVIN**
> getCarByVIN(token, vin, outputLang)

Find car by VIN

Return vehicle data from license plate

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//

val apiInstance = CarInfoApi()
val token : kotlin.String = token_example // kotlin.String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
val vin : kotlin.String = vin_example // kotlin.String |  Your VIN (Vehicle Identification Number)
val outputLang : kotlin.String = outputLang_example // kotlin.String | Define the API output language (fr,en)
try {
    apiInstance.getCarByVIN(token, vin, outputLang)
} catch (e: ClientException) {
    println("4xx response calling CarInfoApi#getCarByVIN")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CarInfoApi#getCarByVIN")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **vin** | **kotlin.String**|  Your VIN (Vehicle Identification Number) | [default to VF1R9800962986572]
 **outputLang** | **kotlin.String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

