package com.openmtrapi.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorldResource {

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("application/json")
    @Path("{name}")
    public Response sayHelloWorld(@PathParam("name") String name) {
        // Return some cliched textual content

        return Response.status(200).entity("Hello " + name + " nice to meet you").build();
    }
}
