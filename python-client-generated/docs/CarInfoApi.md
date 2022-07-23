# swagger_client.CarInfoApi

All URIs are relative to *https://app.auto-ways.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_car_by_plate_es**](CarInfoApi.md#get_car_by_plate_es) | **GET** /v1/es/ | Find car by plate  , country  (ES)
[**get_car_by_plate_fr**](CarInfoApi.md#get_car_by_plate_fr) | **GET** /v1/fr/ | Find car by plate , country  (FR)
[**get_car_by_plate_it**](CarInfoApi.md#get_car_by_plate_it) | **GET** /v1/it/ | Find car by plate  , country  (IT)
[**get_car_by_plate_pt**](CarInfoApi.md#get_car_by_plate_pt) | **GET** /v1/pt/ | Find car by plate  , country  (PT)
[**get_car_by_vin**](CarInfoApi.md#get_car_by_vin) | **GET** /v1/vin/ | Find car by VIN

# **get_car_by_plate_es**
> get_car_by_plate_es(token, plaque, output_lang=output_lang)

Find car by plate  , country  (ES)

Return vehicle data from license plate

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CarInfoApi()
token = '4a486e221ea6d4a888671242b5fe0fed' # str | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
plaque = '1509HJB' # str | car plate  (default to 1509HJB)
output_lang = 'fr' # str | Define the API output language (fr,en) (optional) (default to fr)

try:
    # Find car by plate  , country  (ES)
    api_instance.get_car_by_plate_es(token, plaque, output_lang=output_lang)
except ApiException as e:
    print("Exception when calling CarInfoApi->get_car_by_plate_es: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **str**| car plate  | [default to 1509HJB]
 **output_lang** | **str**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_car_by_plate_fr**
> get_car_by_plate_fr(token, plaque, output_lang=output_lang)

Find car by plate , country  (FR)

Return vehicle data from license plate

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CarInfoApi()
token = '4a486e221ea6d4a888671242b5fe0fed' # str | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
plaque = 'FH034DD' # str | car plate  (default to FH034DD)
output_lang = 'fr' # str | Define the API output language (fr,en) (optional) (default to fr)

try:
    # Find car by plate , country  (FR)
    api_instance.get_car_by_plate_fr(token, plaque, output_lang=output_lang)
except ApiException as e:
    print("Exception when calling CarInfoApi->get_car_by_plate_fr: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **str**| car plate  | [default to FH034DD]
 **output_lang** | **str**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_car_by_plate_it**
> get_car_by_plate_it(token, plaque, output_lang=output_lang)

Find car by plate  , country  (IT)

Return vehicle data from license plate

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CarInfoApi()
token = '4a486e221ea6d4a888671242b5fe0fed' # str | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
plaque = 'FG995BB' # str | car plate  (default to FG995BB)
output_lang = 'fr' # str | Define the API output language (fr,en) (optional) (default to fr)

try:
    # Find car by plate  , country  (IT)
    api_instance.get_car_by_plate_it(token, plaque, output_lang=output_lang)
except ApiException as e:
    print("Exception when calling CarInfoApi->get_car_by_plate_it: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **str**| car plate  | [default to FG995BB]
 **output_lang** | **str**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_car_by_plate_pt**
> get_car_by_plate_pt(token, plaque, output_lang=output_lang)

Find car by plate  , country  (PT)

Return vehicle data from license plate

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CarInfoApi()
token = '4a486e221ea6d4a888671242b5fe0fed' # str | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
plaque = '89XL64' # str | car plate  (default to 89XL64)
output_lang = 'fr' # str | Define the API output language (fr,en) (optional) (default to fr)

try:
    # Find car by plate  , country  (PT)
    api_instance.get_car_by_plate_pt(token, plaque, output_lang=output_lang)
except ApiException as e:
    print("Exception when calling CarInfoApi->get_car_by_plate_pt: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **plaque** | **str**| car plate  | [default to 89XL64]
 **output_lang** | **str**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_car_by_vin**
> get_car_by_vin(token, vin, output_lang=output_lang)

Find car by VIN

Return vehicle data from license plate

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CarInfoApi()
token = '4a486e221ea6d4a888671242b5fe0fed' # str | Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  (default to 4a486e221ea6d4a888671242b5fe0fed)
vin = 'VF1R9800962986572' # str |  Your VIN (Vehicle Identification Number) (default to VF1R9800962986572)
output_lang = 'fr' # str | Define the API output language (fr,en) (optional) (default to fr)

try:
    # Find car by VIN
    api_instance.get_car_by_vin(token, vin, output_lang=output_lang)
except ApiException as e:
    print("Exception when calling CarInfoApi->get_car_by_vin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **str**| Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  | [default to 4a486e221ea6d4a888671242b5fe0fed]
 **vin** | **str**|  Your VIN (Vehicle Identification Number) | [default to VF1R9800962986572]
 **output_lang** | **str**| Define the API output language (fr,en) | [optional] [default to fr]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

