package com.twodigits.kumuluzmicroservice;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * HelloWorld REST end point
 * @author robert.diers
 *
 */
@Path("/helloworld")
public class HelloWorldService {	
	
	@GET
	@Produces("text/plain")
	public Response sayHello() {
		String message = "Hello World - " + new Date();
		return Response.ok(message).build();
	}

}