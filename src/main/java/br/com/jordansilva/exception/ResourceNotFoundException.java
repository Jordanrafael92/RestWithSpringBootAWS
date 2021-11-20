package br.com.jordansilva.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	public static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String exception) {
		super(exception);
	}

}
