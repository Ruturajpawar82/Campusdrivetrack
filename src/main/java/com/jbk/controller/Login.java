package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.dup.login;
import com.jbk.entity.User;
import com.jbk.service.userservice;

@RestController
@RequestMapping("/auth")
public class Login {
	@Autowired
	userservice service;
	@PostMapping("/login")
	public Object logincre(@RequestBody login lo) {
		User res=service.logincre(lo);
		if(res!=null) {
			return res;
		}
		else {
			return"invalid credentials";
		}
		
		
	}
	

}
