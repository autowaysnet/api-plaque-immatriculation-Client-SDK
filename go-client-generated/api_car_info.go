
/*
 * API Car plate - API Plaque immatriculation
 *
 * Web Service which allows you to query the official database in real time by simply entering a license plate or a VIN. You allow your ecosystem to identify in one click the official data of a vehicle among the 80M license plates in France, Spain, Italy and Portugal.
 *
 * API version: 1.0.0-oas3
 * Contact: contact@auto-ways.net
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

import (
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
	"github.com/antihax/optional"
)

// Linger please
var (
	_ context.Context
)

type CarInfoApiService service
/*
CarInfoApiService Find car by plate  , country  (ES)
Return vehicle data from license plate
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
 * @param plaque car plate 
 * @param optional nil or *CarInfoApiGetCarByPlateEsOpts - Optional Parameters:
     * @param "OutputLang" (optional.String) -  Define the API output language (fr,en)

*/

type CarInfoApiGetCarByPlateEsOpts struct {
    OutputLang optional.String
}

func (a *CarInfoApiService) GetCarByPlateEs(ctx context.Context, token string, plaque string, localVarOptionals *CarInfoApiGetCarByPlateEsOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/v1/es/"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("token", parameterToString(token, ""))
	localVarQueryParams.Add("plaque", parameterToString(plaque, ""))
	if localVarOptionals != nil && localVarOptionals.OutputLang.IsSet() {
		localVarQueryParams.Add("output_lang", parameterToString(localVarOptionals.OutputLang.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
CarInfoApiService Find car by plate , country  (FR)
Return vehicle data from license plate
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
 * @param plaque car plate 
 * @param optional nil or *CarInfoApiGetCarByPlateFrOpts - Optional Parameters:
     * @param "OutputLang" (optional.String) -  Define the API output language (fr,en)

*/

type CarInfoApiGetCarByPlateFrOpts struct {
    OutputLang optional.String
}

func (a *CarInfoApiService) GetCarByPlateFr(ctx context.Context, token string, plaque string, localVarOptionals *CarInfoApiGetCarByPlateFrOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/v1/fr/"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("token", parameterToString(token, ""))
	localVarQueryParams.Add("plaque", parameterToString(plaque, ""))
	if localVarOptionals != nil && localVarOptionals.OutputLang.IsSet() {
		localVarQueryParams.Add("output_lang", parameterToString(localVarOptionals.OutputLang.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
CarInfoApiService Find car by plate  , country  (IT)
Return vehicle data from license plate
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
 * @param plaque car plate 
 * @param optional nil or *CarInfoApiGetCarByPlateItOpts - Optional Parameters:
     * @param "OutputLang" (optional.String) -  Define the API output language (fr,en)

*/

type CarInfoApiGetCarByPlateItOpts struct {
    OutputLang optional.String
}

func (a *CarInfoApiService) GetCarByPlateIt(ctx context.Context, token string, plaque string, localVarOptionals *CarInfoApiGetCarByPlateItOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/v1/it/"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("token", parameterToString(token, ""))
	localVarQueryParams.Add("plaque", parameterToString(plaque, ""))
	if localVarOptionals != nil && localVarOptionals.OutputLang.IsSet() {
		localVarQueryParams.Add("output_lang", parameterToString(localVarOptionals.OutputLang.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
CarInfoApiService Find car by plate  , country  (PT)
Return vehicle data from license plate
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
 * @param plaque car plate 
 * @param optional nil or *CarInfoApiGetCarByPlatePtOpts - Optional Parameters:
     * @param "OutputLang" (optional.String) -  Define the API output language (fr,en)

*/

type CarInfoApiGetCarByPlatePtOpts struct {
    OutputLang optional.String
}

func (a *CarInfoApiService) GetCarByPlatePt(ctx context.Context, token string, plaque string, localVarOptionals *CarInfoApiGetCarByPlatePtOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/v1/pt/"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("token", parameterToString(token, ""))
	localVarQueryParams.Add("plaque", parameterToString(plaque, ""))
	if localVarOptionals != nil && localVarOptionals.OutputLang.IsSet() {
		localVarQueryParams.Add("output_lang", parameterToString(localVarOptionals.OutputLang.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
CarInfoApiService Find car by VIN
Return vehicle data from license plate
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo 
 * @param vin  Your VIN (Vehicle Identification Number)
 * @param optional nil or *CarInfoApiGetCarByVINOpts - Optional Parameters:
     * @param "OutputLang" (optional.String) -  Define the API output language (fr,en)

*/

type CarInfoApiGetCarByVINOpts struct {
    OutputLang optional.String
}

func (a *CarInfoApiService) GetCarByVIN(ctx context.Context, token string, vin string, localVarOptionals *CarInfoApiGetCarByVINOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/v1/vin/"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("token", parameterToString(token, ""))
	localVarQueryParams.Add("vin", parameterToString(vin, ""))
	if localVarOptionals != nil && localVarOptionals.OutputLang.IsSet() {
		localVarQueryParams.Add("output_lang", parameterToString(localVarOptionals.OutputLang.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}