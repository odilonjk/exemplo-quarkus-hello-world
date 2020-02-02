package com.wordpress.krogercode.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello-world")
public class HelloWorldResource {

    @GET
    public String helloWorld() {
        return "Hello world!";
    }

    @GET
    @Path("/{name}")
    public String helloWorldGreeting(@PathParam(value = "name") String name) {
        return "Hello world, " + name;
    }

}
