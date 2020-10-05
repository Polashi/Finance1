package com.oracle.exception;

@SuppressWarnings("serial")
public class UserNotFound extends RuntimeException {

	public UserNotFound() {

	}

	public UserNotFound(String string) {
		super(string);
	}

}
