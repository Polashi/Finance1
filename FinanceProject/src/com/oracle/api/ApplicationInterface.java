package com.oracle.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.oracle.service.JsonClass;

@Path("")
public class ApplicationInterface {
	
	@Path("/login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces( MediaType.APPLICATION_JSON )
	public Response method_name() {
		return Response.status(200).build();
	}

	@POST
	@Path("/applicationId")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getApplicationDetail(String value) {
		String applicationIdvalue = JsonClass.parseApplicationIdData(value);
		return Response.status(200).entity(applicationIdvalue).build();
	}

	@POST
	@Path("/verifyUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response userExist(String value) {
		String panCardvalue = JsonClass.parsePanData(value);
		return Response.status(200).entity("User exist").build();
	}

	// Incomplete
	@Path("/customerId")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerDetail(String value) {
		String applicationIdvalue = JsonClass.parseApplicationIdData(value);
		return Response.status(200).entity(applicationIdvalue).build();
	}


}
