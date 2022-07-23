# {{classname}}

All URIs are relative to *https://app.auto-ways.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCarByPlateEs**](CarInfoApi.md#GetCarByPlateEs) | **Get** /v1/es/ | Find car by plate  , country  (ES)
[**GetCarByPlateFr**](CarInfoApi.md#GetCarByPlateFr) | **Get** /v1/fr/ | Find car by plate , country  (FR)
[**GetCarByPlateIt**](CarInfoApi.md#GetCarByPlateIt) | **Get** /v1/it/ | Find car by plate  , country  (IT)
[**GetCarByPlatePt**](CarInfoApi.md#GetCarByPlatePt) | **Get** /v1/pt/ | Find car by plate  , country  (PT)
[**GetCarByVIN**](CarInfoApi.md#GetCarByVIN) | **Get** /v1/vin/ | Find car by VIN

# **GetCarByPlateEs**
> GetCarByPlateEs(ctx, token, plaque, optional)
Find car by plate  , country  (ES)

Return vehicle data from license plate

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
  **plaque** | **string**| car plate  | [default to 1509HJB]
 **optional** | ***CarInfoApiGetCarByPlateEsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a CarInfoApiGetCarByPlateEsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **outputLang** | **optional.String**| Define the API output language (fr,en) | [default to fr]

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCarByPlateFr**
> GetCarByPlateFr(ctx, token, plaque, optional)
Find car by plate , country  (FR)

Return vehicle data from license plate

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
  **plaque** | **string**| car plate  | [default to FH034DD]
 **optional** | ***CarInfoApiGetCarByPlateFrOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a CarInfoApiGetCarByPlateFrOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **outputLang** | **optional.String**| Define the API output language (fr,en) | [default to fr]

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCarByPlateIt**
> GetCarByPlateIt(ctx, token, plaque, optional)
Find car by plate  , country  (IT)

Return vehicle data from license plate

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
  **plaque** | **string**| car plate  | [default to FG995BB]
 **optional** | ***CarInfoApiGetCarByPlateItOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a CarInfoApiGetCarByPlateItOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **outputLang** | **optional.String**| Define the API output language (fr,en) | [default to fr]

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCarByPlatePt**
> GetCarByPlatePt(ctx, token, plaque, optional)
Find car by plate  , country  (PT)

Return vehicle data from license plate

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
  **plaque** | **string**| car plate  | [default to 89XL64]
 **optional** | ***CarInfoApiGetCarByPlatePtOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a CarInfoApiGetCarByPlatePtOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **outputLang** | **optional.String**| Define the API output language (fr,en) | [default to fr]

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCarByVIN**
> GetCarByVIN(ctx, token, vin, optional)
Find car by VIN

Return vehicle data from license plate

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
  **vin** | **string**|  Your VIN (Vehicle Identification Number) | [default to VF1R9800962986572]
 **optional** | ***CarInfoApiGetCarByVINOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a CarInfoApiGetCarByVINOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **outputLang** | **optional.String**| Define the API output language (fr,en) | [default to fr]

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

