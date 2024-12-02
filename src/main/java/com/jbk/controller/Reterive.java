package com.jbk.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Exception.DataAlreadyException;
import com.jbk.entity.User;
import com.jbk.service.userservice;

@RestController
@RequestMapping("/user")
public class Reterive {
	@Autowired
	userservice service;
	@PostMapping("/create-user")
	public String createuser(@RequestBody @Valid User user) {
		int status=service.createuser(user);
		if(status==1) {
			return "data added sucessfully";
		}
		else if(status==2) {
			throw new DataAlreadyException("data already exist");
		}
		else {
			return "somethinwentwrong";
		}
		
	}
	
	@GetMapping("/getuser-by/{username}")
	public Object getuser(@PathVariable String username) {
		
		User user=service.getuser(username);
		
		if(user!=null) {
			return user;
		}
		else {
			throw new DataAlreadyException("data not found");
		}
	}
	
	@DeleteMapping("/deleteuser-by")
	public String deleteuser(@RequestParam String username) {
		int Result=service.deleteuse(username);
		
		switch(Result) {
		case 1:{
			return "data deleted sucessfully";
		}
		case 2:{
			throw new DataAlreadyException("data not found");
		}
		case 3:{
			return "something went wrong";
		}
		default:
			return null;
		}
	}
	@GetMapping("/allusers")
	public Object getallusers(){
		List<User> list=null;
		list=service.getalluser();
		if(list!=null) {
		return list;
		}
		else {
			throw new DataAlreadyException("data not found");
		}
		
	}
	@PutMapping("/updateuser")
	public String updateuser(@RequestBody User user) {
		int result=service.updateuser(user);
		
		switch(result) {
		case 1:{
			return "data updated sucessfully";
		}
		case 2:{
			throw new DataAlreadyException("data not found");
		}
		case 3:{
			return "something went wrong";
		}
		default:{
			return null;
		}
		}
	}
	

}
