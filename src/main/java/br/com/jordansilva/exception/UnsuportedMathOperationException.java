package br.com.jordansilva.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException {

	public static final long serialVersionUID = 1L;

	public UnsuportedMathOperationException(String exception) {
		super(exception);
	}

}
