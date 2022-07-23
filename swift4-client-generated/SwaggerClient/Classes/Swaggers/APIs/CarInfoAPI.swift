//
// CarInfoAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire



open class CarInfoAPI {
    /**
     Find car by plate  , country  (ES)
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter plaque: (query) car plate       - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getCarByPlateEs(token: String, plaque: String, outputLang: String? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getCarByPlateEsWithRequestBuilder(token: token, plaque: plaque, outputLang: outputLang).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Find car by plate  , country  (ES)
     - GET /v1/es/
     - Return vehicle data from license plate
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter plaque: (query) car plate       - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)

     - returns: RequestBuilder<Void> 
     */
    open class func getCarByPlateEsWithRequestBuilder(token: String, plaque: String, outputLang: String? = nil) -> RequestBuilder<Void> {
        let path = "/v1/es/"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "token": token, 
                        "plaque": plaque, 
                        "output_lang": outputLang
        ])

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Find car by plate , country  (FR)
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter plaque: (query) car plate       - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getCarByPlateFr(token: String, plaque: String, outputLang: String? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getCarByPlateFrWithRequestBuilder(token: token, plaque: plaque, outputLang: outputLang).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Find car by plate , country  (FR)
     - GET /v1/fr/
     - Return vehicle data from license plate
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter plaque: (query) car plate       - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)

     - returns: RequestBuilder<Void> 
     */
    open class func getCarByPlateFrWithRequestBuilder(token: String, plaque: String, outputLang: String? = nil) -> RequestBuilder<Void> {
        let path = "/v1/fr/"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "token": token, 
                        "plaque": plaque, 
                        "output_lang": outputLang
        ])

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Find car by plate  , country  (IT)
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter plaque: (query) car plate       - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getCarByPlateIt(token: String, plaque: String, outputLang: String? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getCarByPlateItWithRequestBuilder(token: token, plaque: plaque, outputLang: outputLang).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Find car by plate  , country  (IT)
     - GET /v1/it/
     - Return vehicle data from license plate
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter plaque: (query) car plate       - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)

     - returns: RequestBuilder<Void> 
     */
    open class func getCarByPlateItWithRequestBuilder(token: String, plaque: String, outputLang: String? = nil) -> RequestBuilder<Void> {
        let path = "/v1/it/"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "token": token, 
                        "plaque": plaque, 
                        "output_lang": outputLang
        ])

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Find car by plate  , country  (PT)
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter plaque: (query) car plate       - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getCarByPlatePt(token: String, plaque: String, outputLang: String? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getCarByPlatePtWithRequestBuilder(token: token, plaque: plaque, outputLang: outputLang).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Find car by plate  , country  (PT)
     - GET /v1/pt/
     - Return vehicle data from license plate
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter plaque: (query) car plate       - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)

     - returns: RequestBuilder<Void> 
     */
    open class func getCarByPlatePtWithRequestBuilder(token: String, plaque: String, outputLang: String? = nil) -> RequestBuilder<Void> {
        let path = "/v1/pt/"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "token": token, 
                        "plaque": plaque, 
                        "output_lang": outputLang
        ])

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Find car by VIN
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter vin: (query)  Your VIN (Vehicle Identification Number)      - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getCarByVIN(token: String, vin: String, outputLang: String? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        getCarByVINWithRequestBuilder(token: token, vin: vin, outputLang: outputLang).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Find car by VIN
     - GET /v1/vin/
     - Return vehicle data from license plate
     - parameter token: (query) Your token, use your real token or request a free token for fee here https://auto-ways.net/demo       - parameter vin: (query)  Your VIN (Vehicle Identification Number)      - parameter outputLang: (query) Define the API output language (fr,en) (optional, default to fr)

     - returns: RequestBuilder<Void> 
     */
    open class func getCarByVINWithRequestBuilder(token: String, vin: String, outputLang: String? = nil) -> RequestBuilder<Void> {
        let path = "/v1/vin/"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "token": token, 
                        "vin": vin, 
                        "output_lang": outputLang
        ])

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
