package com.microsaludo.exception;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.microsaludo.response.ErrorDetails;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	//Handle specific exceptions
	@ExceptionHandler
	public ResponseEntity<ErrorDetails> HandlesqlException(SQLException exception, WebRequest webRequest){
		
		ErrorDetails errorDetails = new ErrorDetails(new Date(), "900","El saludo ya existe en la DB");
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//Global exceptions

}
