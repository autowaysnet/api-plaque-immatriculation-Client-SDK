# ApiCarPlateApiPlaqueImmatriculation.CarInfoApi

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
> getCarByPlateEs(token, plaque, opts)

Find car by plate  , country  (ES)

Return vehicle data from license plate

### Example
```javascript
import {ApiCarPlateApiPlaqueImmatriculation} from 'api_car_plate___api_plaque_immatriculation';

let apiInstance = new ApiCarPlateApiPlaqueImmatriculation.CarInfoApi();
let token = "4a486e221ea6d4a888671242b5fe0fed"; // String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
let plaque = "1509HJB"; // String | car plate 
let opts = { 
  'outputLang': "fr" // String | Define the API output language (fr,en)
};
apiInstance.getCarByPlateEs(token, plaque, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **String**| car plate  | [default to 1509HJB]
 **outputLang** | **String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarByPlateFr"></a>
# **getCarByPlateFr**
> getCarByPlateFr(token, plaque, opts)

Find car by plate , country  (FR)

Return vehicle data from license plate

### Example
```javascript
import {ApiCarPlateApiPlaqueImmatriculation} from 'api_car_plate___api_plaque_immatriculation';

let apiInstance = new ApiCarPlateApiPlaqueImmatriculation.CarInfoApi();
let token = "4a486e221ea6d4a888671242b5fe0fed"; // String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
let plaque = "FH034DD"; // String | car plate 
let opts = { 
  'outputLang': "fr" // String | Define the API output language (fr,en)
};
apiInstance.getCarByPlateFr(token, plaque, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **String**| car plate  | [default to FH034DD]
 **outputLang** | **String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarByPlateIt"></a>
# **getCarByPlateIt**
> getCarByPlateIt(token, plaque, opts)

Find car by plate  , country  (IT)

Return vehicle data from license plate

### Example
```javascript
import {ApiCarPlateApiPlaqueImmatriculation} from 'api_car_plate___api_plaque_immatriculation';

let apiInstance = new ApiCarPlateApiPlaqueImmatriculation.CarInfoApi();
let token = "4a486e221ea6d4a888671242b5fe0fed"; // String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
let plaque = "FG995BB"; // String | car plate 
let opts = { 
  'outputLang': "fr" // String | Define the API output language (fr,en)
};
apiInstance.getCarByPlateIt(token, plaque, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **String**| car plate  | [default to FG995BB]
 **outputLang** | **String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarByPlatePt"></a>
# **getCarByPlatePt**
> getCarByPlatePt(token, plaque, opts)

Find car by plate  , country  (PT)

Return vehicle data from license plate

### Example
```javascript
import {ApiCarPlateApiPlaqueImmatriculation} from 'api_car_plate___api_plaque_immatriculation';

let apiInstance = new ApiCarPlateApiPlaqueImmatriculation.CarInfoApi();
let token = "4a486e221ea6d4a888671242b5fe0fed"; // String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
let plaque = "89XL64"; // String | car plate 
let opts = { 
  'outputLang': "fr" // String | Define the API output language (fr,en)
};
apiInstance.getCarByPlatePt(token, plaque, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **String**| car plate  | [default to 89XL64]
 **outputLang** | **String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCarByVIN"></a>
# **getCarByVIN**
> getCarByVIN(token, vin, opts)

Find car by VIN

Return vehicle data from license plate

### Example
```javascript
import {ApiCarPlateApiPlaqueImmatriculation} from 'api_car_plate___api_plaque_immatriculation';

let apiInstance = new ApiCarPlateApiPlaqueImmatriculation.CarInfoApi();
let token = "4a486e221ea6d4a888671242b5fe0fed"; // String | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
let vin = "VF1R9800962986572"; // String |  Your VIN (Vehicle Identification Number)
let opts = { 
  'outputLang': "fr" // String | Define the API output language (fr,en)
};
apiInstance.getCarByVIN(token, vin, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **vin** | **String**|  Your VIN (Vehicle Identification Number) | [default to VF1R9800962986572]
 **outputLang** | **String**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

