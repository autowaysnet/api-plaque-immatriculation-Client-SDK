package io.swagger.api;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * API Car plate - API Plaque immatriculation
 *
 * <p>Web Service which allows you to query the official database in real time by simply entering a license plate or a VIN. You allow your ecosystem to identify in one click the official data of a vehicle among the 80M license plates in France, Spain, Italy and Portugal.
 *
 */
@Path("/")
public interface CarInfoApi  {

    /**
     * Find car by plate  , country  (ES)
     *
     * Return vehicle data from license plate
     *
     */
    @GET
    @Path("/v1/es/")
    @Produces({ "application/json" })
    @Operation(summary = "Find car by plate  , country  (ES)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "success"),
        @ApiResponse(responseCode = "301", description = "Cross-Origin Resource Sharing (CORS)"),
        @ApiResponse(responseCode = "401", description = "Unauthorized client"),
        @ApiResponse(responseCode = "404", description = "Car not found") })
    public void getCarByPlateEs(@QueryParam("token")@DefaultValue("4a486e221ea6d4a888671242b5fe0fed") String token, @QueryParam("plaque")@DefaultValue("1509HJB") String plaque, @QueryParam("output_lang")@DefaultValue("fr") String outputLang);

    /**
     * Find car by plate , country  (FR)
     *
     * Return vehicle data from license plate
     *
     */
    @GET
    @Path("/v1/fr/")
    @Produces({ "application/json" })
    @Operation(summary = "Find car by plate , country  (FR)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "success"),
        @ApiResponse(responseCode = "301", description = "Cross-Origin Resource Sharing (CORS)"),
        @ApiResponse(responseCode = "401", description = "Unauthorized client"),
        @ApiResponse(responseCode = "404", description = "Car not found") })
    public void getCarByPlateFr(@QueryParam("token")@DefaultValue("4a486e221ea6d4a888671242b5fe0fed") String token, @QueryParam("plaque")@DefaultValue("FH034DD") String plaque, @QueryParam("output_lang")@DefaultValue("fr") String outputLang);

    /**
     * Find car by plate  , country  (IT)
     *
     * Return vehicle data from license plate
     *
     */
    @GET
    @Path("/v1/it/")
    @Produces({ "application/json" })
    @Operation(summary = "Find car by plate  , country  (IT)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "success"),
        @ApiResponse(responseCode = "301", description = "Cross-Origin Resource Sharing (CORS)"),
        @ApiResponse(responseCode = "401", description = "Unauthorized client"),
        @ApiResponse(responseCode = "404", description = "Car not found") })
    public void getCarByPlateIt(@QueryParam("token")@DefaultValue("4a486e221ea6d4a888671242b5fe0fed") String token, @QueryParam("plaque")@DefaultValue("FG995BB") String plaque, @QueryParam("output_lang")@DefaultValue("fr") String outputLang);

    /**
     * Find car by plate  , country  (PT)
     *
     * Return vehicle data from license plate
     *
     */
    @GET
    @Path("/v1/pt/")
    @Produces({ "application/json" })
    @Operation(summary = "Find car by plate  , country  (PT)", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "success"),
        @ApiResponse(responseCode = "301", description = "Cross-Origin Resource Sharing (CORS)"),
        @ApiResponse(responseCode = "401", description = "Unauthorized client"),
        @ApiResponse(responseCode = "404", description = "Car not found") })
    public void getCarByPlatePt(@QueryParam("token")@DefaultValue("4a486e221ea6d4a888671242b5fe0fed") String token, @QueryParam("plaque")@DefaultValue("89XL64") String plaque, @QueryParam("output_lang")@DefaultValue("fr") String outputLang);

    /**
     * Find car by VIN
     *
     * Return vehicle data from license plate
     *
     */
    @GET
    @Path("/v1/vin/")
    @Produces({ "application/json" })
    @Operation(summary = "Find car by VIN", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "success"),
        @ApiResponse(responseCode = "301", description = "Cross-Origin Resource Sharing (CORS)"),
        @ApiResponse(responseCode = "401", description = "Unauthorized client"),
        @ApiResponse(responseCode = "404", description = "Car not found") })
    public void getCarByVIN(@QueryParam("token")@DefaultValue("4a486e221ea6d4a888671242b5fe0fed") String token, @QueryParam("vin")@DefaultValue("VF1R9800962986572") String vin, @QueryParam("output_lang")@DefaultValue("fr") String outputLang);
}
