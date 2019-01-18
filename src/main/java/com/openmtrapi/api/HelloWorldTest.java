package com.openmtrapi.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldTest extends Application {
    @GET
    @Path("/{name}")
    @Produces("text/plain")
    public Response getMsg(@PathParam("name") String msg) {
        String output = "Jersey say : " + msg;
        return Response.status(200).entity(output).build();
    }
}