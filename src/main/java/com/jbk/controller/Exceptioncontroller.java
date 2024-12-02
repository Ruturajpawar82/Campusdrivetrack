package com.jbk.controller;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jbk.Exception.DataAlreadyException;
import com.jbk.dup.timestamp;

@RestControllerAdvice
public class Exceptioncontroller {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public HashMap<String,String> handleexception(MethodArgumentNotValidException ex) {
		
		List<FieldError> list=ex.getFieldErrors();
		HashMap<String,String> map=new HashMap<>();
		
		for(FieldError list1:list) {
			map.put(list1.getField(), list1.getDefaultMessage());
			
		}
		return map ;
		
		
	}
	
	@ExceptionHandler(DataAlreadyException.class)
	public timestamp dataexist(DataAlreadyException ex, HttpServletRequest request) {
		timestamp T=new timestamp();
		
		T.setMsg(ex.getMessage());
		T.setUtl(request.getRequestURI());
		T.setTime(Instant.now());
		
		return T;
	}

	private Timestamp timestamp(long timeMillis) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
