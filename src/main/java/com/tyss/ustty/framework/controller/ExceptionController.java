package com.tyss.ustty.framework.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.ustty.framework.dto.EmployeeResponce;

@RestControllerAdvice
public class ExceptionController {		//To handle the exception

	@ExceptionHandler(Exception.class)
	public EmployeeResponce handleException() {			
		EmployeeResponce responce = new EmployeeResponce();
		responce.setStatusCode(501);
		responce.setMessage("Exception");
		responce.setDescription("You got an exception");
		return responce;
	}
}
