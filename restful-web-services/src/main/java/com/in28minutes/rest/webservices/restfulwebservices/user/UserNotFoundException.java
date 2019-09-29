package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	

	String message = "";
	public UserNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	@Override
	public String toString() {
		
		return message;
	}

}
