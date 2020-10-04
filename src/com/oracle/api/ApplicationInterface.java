package com.oracle.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class ApplicationInterface {
	
	@Path("/login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces( MediaType.APPLICATION_JSON )
	public Response method_name() {
		return Response.status(200).build();
	}

	@Path("/applicationId")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getApplicationDetail() {
		return Response.status(200).build();
	}
	
	
	
	
	
	
	

}
