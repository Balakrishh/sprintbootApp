package com.springbootapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class ApplicationExceptionHandler {

	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = BaseException.class)
	public String HandleBaseException(BaseException e){
		return e.getMessage();
	}
	
	@ExceptionHandler(value = Throwable.class)
	public String HandleException(Exception e){
		return "Some Unkown Error Occured";
	}
	
} 
