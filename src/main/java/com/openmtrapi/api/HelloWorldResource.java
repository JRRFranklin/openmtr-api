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
    public Response sayHelloWorld(@QueryParam("first") String firstName,
                                  @QueryParam("last") String lastName) {
        if(firstName == null || firstName.isEmpty() ||
                lastName == null || lastName.isEmpty()) {
            return Response.status(400).build();
        }
        Student student = new Student();
        student.firstName = firstName;
        student.lastName = lastName;

        return Response.status(200).entity(student).build();
    }
}
