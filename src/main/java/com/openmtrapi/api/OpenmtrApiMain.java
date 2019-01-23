package com.openmtrapi.api;

/*
OpenMtr-API
Authors James Willhoite, Jenny Franklin, Matt Thomas
PSTCC Capstone 2019
 */

//Import required
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

//The main api endpoint
@Path("/main")
public class OpenmtrApiMain {
    // The Java method will process HTTP GET requests
    @GET

    @Path("/getURL")
    public Response processFromURL(@QueryParam("url") String url) {

        ReturnResponse rr = new ReturnResponse();
        rr.setStatusCode(200);
        rr.setData("This is a test. The URL is " + url);

        return Response.status(200).entity(rr).type(MediaType.APPLICATION_JSON).build();
    }

    /**
     *
     * @param url url to download file
     * @return String FILE_NAME
     */
    public String downloadFromURL(String url) {
        String FILE_NAME = "/images/test.png";

        try {
            InputStream in = new URL(url).openStream();
            Files.copy(in, Paths.get(FILE_NAME), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception ex) {
            return "Nothing";
        }

        return FILE_NAME;
    }
}
