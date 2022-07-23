/**
 * API Car plate - API Plaque immatriculation
 * Web Service which allows you to query the official database in real time by simply entering a license plate or a VIN. You allow your ecosystem to identify in one click the official data of a vehicle among the 80M license plates in France, Spain, Italy and Portugal.
 *
 * OpenAPI spec version: 1.0.0-oas3
 * Contact: contact@auto-ways.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class CarInfoApi(
  val defBasePath: String = "https://app.auto-ways.net/api",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new CarInfoApiAsyncHelper(client, config)

  /**
   * Find car by plate  , country  (ES)
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param plaque car plate  
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return void
   */
  def getCarByPlateEs(token: String = "4a486e221ea6d4a888671242b5fe0fed", plaque: String = "1509HJB", outputLang: Option[String] = Option("fr")) = {
    val await = Try(Await.result(getCarByPlateEsAsync(token, plaque, outputLang), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Find car by plate  , country  (ES) asynchronously
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param plaque car plate  
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return Future(void)
   */
  def getCarByPlateEsAsync(token: String = "4a486e221ea6d4a888671242b5fe0fed", plaque: String = "1509HJB", outputLang: Option[String] = Option("fr")) = {
      helper.getCarByPlateEs(token, plaque, outputLang)
  }

  /**
   * Find car by plate , country  (FR)
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param plaque car plate  
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return void
   */
  def getCarByPlateFr(token: String = "4a486e221ea6d4a888671242b5fe0fed", plaque: String = "FH034DD", outputLang: Option[String] = Option("fr")) = {
    val await = Try(Await.result(getCarByPlateFrAsync(token, plaque, outputLang), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Find car by plate , country  (FR) asynchronously
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param plaque car plate  
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return Future(void)
   */
  def getCarByPlateFrAsync(token: String = "4a486e221ea6d4a888671242b5fe0fed", plaque: String = "FH034DD", outputLang: Option[String] = Option("fr")) = {
      helper.getCarByPlateFr(token, plaque, outputLang)
  }

  /**
   * Find car by plate  , country  (IT)
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param plaque car plate  
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return void
   */
  def getCarByPlateIt(token: String = "4a486e221ea6d4a888671242b5fe0fed", plaque: String = "FG995BB", outputLang: Option[String] = Option("fr")) = {
    val await = Try(Await.result(getCarByPlateItAsync(token, plaque, outputLang), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Find car by plate  , country  (IT) asynchronously
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param plaque car plate  
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return Future(void)
   */
  def getCarByPlateItAsync(token: String = "4a486e221ea6d4a888671242b5fe0fed", plaque: String = "FG995BB", outputLang: Option[String] = Option("fr")) = {
      helper.getCarByPlateIt(token, plaque, outputLang)
  }

  /**
   * Find car by plate  , country  (PT)
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param plaque car plate  
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return void
   */
  def getCarByPlatePt(token: String = "4a486e221ea6d4a888671242b5fe0fed", plaque: String = "89XL64", outputLang: Option[String] = Option("fr")) = {
    val await = Try(Await.result(getCarByPlatePtAsync(token, plaque, outputLang), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Find car by plate  , country  (PT) asynchronously
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param plaque car plate  
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return Future(void)
   */
  def getCarByPlatePtAsync(token: String = "4a486e221ea6d4a888671242b5fe0fed", plaque: String = "89XL64", outputLang: Option[String] = Option("fr")) = {
      helper.getCarByPlatePt(token, plaque, outputLang)
  }

  /**
   * Find car by VIN
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param vin  Your VIN (Vehicle Identification Number) 
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return void
   */
  def getCarByVIN(token: String = "4a486e221ea6d4a888671242b5fe0fed", vin: String = "VF1R9800962986572", outputLang: Option[String] = Option("fr")) = {
    val await = Try(Await.result(getCarByVINAsync(token, vin, outputLang), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Find car by VIN asynchronously
   * Return vehicle data from license plate
   *
   * @param token Your token, use your real token or request a free token for fee here https://auto-ways.net/demo  
   * @param vin  Your VIN (Vehicle Identification Number) 
   * @param outputLang Define the API output language (fr,en) (optional, default to fr)
   * @return Future(void)
   */
  def getCarByVINAsync(token: String = "4a486e221ea6d4a888671242b5fe0fed", vin: String = "VF1R9800962986572", outputLang: Option[String] = Option("fr")) = {
      helper.getCarByVIN(token, vin, outputLang)
  }

}

class CarInfoApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getCarByPlateEs(token: String = "4a486e221ea6d4a888671242b5fe0fed",
    plaque: String = "1509HJB",
    outputLang: Option[String] = Option("fr")
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/es/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (token == null) throw new Exception("Missing required parameter 'token' when calling CarInfoApi->getCarByPlateEs")

    if (plaque == null) throw new Exception("Missing required parameter 'plaque' when calling CarInfoApi->getCarByPlateEs")

    queryParams += "token" -> token.toString
    queryParams += "plaque" -> plaque.toString
    outputLang match {
      case Some(param) => queryParams += "output_lang" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCarByPlateFr(token: String = "4a486e221ea6d4a888671242b5fe0fed",
    plaque: String = "FH034DD",
    outputLang: Option[String] = Option("fr")
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/fr/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (token == null) throw new Exception("Missing required parameter 'token' when calling CarInfoApi->getCarByPlateFr")

    if (plaque == null) throw new Exception("Missing required parameter 'plaque' when calling CarInfoApi->getCarByPlateFr")

    queryParams += "token" -> token.toString
    queryParams += "plaque" -> plaque.toString
    outputLang match {
      case Some(param) => queryParams += "output_lang" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCarByPlateIt(token: String = "4a486e221ea6d4a888671242b5fe0fed",
    plaque: String = "FG995BB",
    outputLang: Option[String] = Option("fr")
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/it/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (token == null) throw new Exception("Missing required parameter 'token' when calling CarInfoApi->getCarByPlateIt")

    if (plaque == null) throw new Exception("Missing required parameter 'plaque' when calling CarInfoApi->getCarByPlateIt")

    queryParams += "token" -> token.toString
    queryParams += "plaque" -> plaque.toString
    outputLang match {
      case Some(param) => queryParams += "output_lang" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCarByPlatePt(token: String = "4a486e221ea6d4a888671242b5fe0fed",
    plaque: String = "89XL64",
    outputLang: Option[String] = Option("fr")
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/pt/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (token == null) throw new Exception("Missing required parameter 'token' when calling CarInfoApi->getCarByPlatePt")

    if (plaque == null) throw new Exception("Missing required parameter 'plaque' when calling CarInfoApi->getCarByPlatePt")

    queryParams += "token" -> token.toString
    queryParams += "plaque" -> plaque.toString
    outputLang match {
      case Some(param) => queryParams += "output_lang" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCarByVIN(token: String = "4a486e221ea6d4a888671242b5fe0fed",
    vin: String = "VF1R9800962986572",
    outputLang: Option[String] = Option("fr")
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/vin/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (token == null) throw new Exception("Missing required parameter 'token' when calling CarInfoApi->getCarByVIN")

    if (vin == null) throw new Exception("Missing required parameter 'vin' when calling CarInfoApi->getCarByVIN")

    queryParams += "token" -> token.toString
    queryParams += "vin" -> vin.toString
    outputLang match {
      case Some(param) => queryParams += "output_lang" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}