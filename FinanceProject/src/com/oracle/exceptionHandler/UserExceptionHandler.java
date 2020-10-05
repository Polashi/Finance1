package com.oracle.exceptionHandler;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import com.oracle.exception.UserNotFound;

public class UserExceptionHandler implements ExceptionMapper<UserNotFound> {

	@Override
	public Response toResponse(UserNotFound userNotFound) {
		String jsonString = "{\"msg\":" + userNotFound.getMessage() + "}";
		return Response.status(404).entity(jsonString).build();
	}

}
