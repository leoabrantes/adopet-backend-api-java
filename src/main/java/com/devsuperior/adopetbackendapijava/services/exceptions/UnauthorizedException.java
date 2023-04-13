package com.devsuperior.adopetbackendapijava.services.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.adopetbackendapijava.resources.exceptions.OAuthCustomError;

public class UnauthorizedException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	
	public UnauthorizedException(String msg) {
		super(msg);
	}
	
	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<OAuthCustomError> unauthorized(UnauthorizedException e, HttpServletRequest request){
			OAuthCustomError err = new OAuthCustomError("Unauthorized", e.getMessage());
		   return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(err);
		   
	}

}
