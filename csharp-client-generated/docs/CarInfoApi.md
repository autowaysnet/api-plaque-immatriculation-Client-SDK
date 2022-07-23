# IO.Swagger.Api.CarInfoApi

All URIs are relative to *https://app.auto-ways.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCarByPlateEs**](CarInfoApi.md#getcarbyplatees) | **GET** /v1/es/ | Find car by plate  , country  (ES)
[**GetCarByPlateFr**](CarInfoApi.md#getcarbyplatefr) | **GET** /v1/fr/ | Find car by plate , country  (FR)
[**GetCarByPlateIt**](CarInfoApi.md#getcarbyplateit) | **GET** /v1/it/ | Find car by plate  , country  (IT)
[**GetCarByPlatePt**](CarInfoApi.md#getcarbyplatept) | **GET** /v1/pt/ | Find car by plate  , country  (PT)
[**GetCarByVIN**](CarInfoApi.md#getcarbyvin) | **GET** /v1/vin/ | Find car by VIN

<a name="getcarbyplatees"></a>
# **GetCarByPlateEs**
> void GetCarByPlateEs (string token, string plaque, string outputLang = null)

Find car by plate  , country  (ES)

Return vehicle data from license plate

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCarByPlateEsExample
    {
        public void main()
        {
            var apiInstance = new CarInfoApi();
            var token = token_example;  // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
            var plaque = plaque_example;  // string | car plate  (default to 1509HJB)
            var outputLang = outputLang_example;  // string | Define the API output language (fr,en) (optional)  (default to fr)

            try
            {
                // Find car by plate  , country  (ES)
                apiInstance.GetCarByPlateEs(token, plaque, outputLang);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CarInfoApi.GetCarByPlateEs: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **string**| car plate  | [default to 1509HJB]
 **outputLang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getcarbyplatefr"></a>
# **GetCarByPlateFr**
> void GetCarByPlateFr (string token, string plaque, string outputLang = null)

Find car by plate , country  (FR)

Return vehicle data from license plate

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCarByPlateFrExample
    {
        public void main()
        {
            var apiInstance = new CarInfoApi();
            var token = token_example;  // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
            var plaque = plaque_example;  // string | car plate  (default to FH034DD)
            var outputLang = outputLang_example;  // string | Define the API output language (fr,en) (optional)  (default to fr)

            try
            {
                // Find car by plate , country  (FR)
                apiInstance.GetCarByPlateFr(token, plaque, outputLang);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CarInfoApi.GetCarByPlateFr: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **string**| car plate  | [default to FH034DD]
 **outputLang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getcarbyplateit"></a>
# **GetCarByPlateIt**
> void GetCarByPlateIt (string token, string plaque, string outputLang = null)

Find car by plate  , country  (IT)

Return vehicle data from license plate

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCarByPlateItExample
    {
        public void main()
        {
            var apiInstance = new CarInfoApi();
            var token = token_example;  // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
            var plaque = plaque_example;  // string | car plate  (default to FG995BB)
            var outputLang = outputLang_example;  // string | Define the API output language (fr,en) (optional)  (default to fr)

            try
            {
                // Find car by plate  , country  (IT)
                apiInstance.GetCarByPlateIt(token, plaque, outputLang);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CarInfoApi.GetCarByPlateIt: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **string**| car plate  | [default to FG995BB]
 **outputLang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getcarbyplatept"></a>
# **GetCarByPlatePt**
> void GetCarByPlatePt (string token, string plaque, string outputLang = null)

Find car by plate  , country  (PT)

Return vehicle data from license plate

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCarByPlatePtExample
    {
        public void main()
        {
            var apiInstance = new CarInfoApi();
            var token = token_example;  // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
            var plaque = plaque_example;  // string | car plate  (default to 89XL64)
            var outputLang = outputLang_example;  // string | Define the API output language (fr,en) (optional)  (default to fr)

            try
            {
                // Find car by plate  , country  (PT)
                apiInstance.GetCarByPlatePt(token, plaque, outputLang);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CarInfoApi.GetCarByPlatePt: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **string**| car plate  | [default to 89XL64]
 **outputLang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getcarbyvin"></a>
# **GetCarByVIN**
> void GetCarByVIN (string token, string vin, string outputLang = null)

Find car by VIN

Return vehicle data from license plate

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetCarByVINExample
    {
        public void main()
        {
            var apiInstance = new CarInfoApi();
            var token = token_example;  // string | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
            var vin = vin_example;  // string |  Your VIN (Vehicle Identification Number) (default to VF1R9800962986572)
            var outputLang = outputLang_example;  // string | Define the API output language (fr,en) (optional)  (default to fr)

            try
            {
                // Find car by VIN
                apiInstance.GetCarByVIN(token, vin, outputLang);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CarInfoApi.GetCarByVIN: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **vin** | **string**|  Your VIN (Vehicle Identification Number) | [default to VF1R9800962986572]
 **outputLang** | **string**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
