package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Student;
import com.jbk.service.Studentservice;

@RestController
@RequestMapping("/Student")
public class Studentcontroller {
	
	@Autowired
	Studentservice service;
	
	@PostMapping("/create-student")
	public String createstudent(@RequestBody Student student) {
		
		int status=service.createstudent(student);
		
		switch(status) {
		case 1:{
			return"data added sucessfully";
		}
		case 2:{
			return"data already exist";
		}
		case 3:{
			return "something went wrong";
		}
		default:
			return null;
		}
		
	}
	@PostMapping("/createmultiple-student")
	public String createmultiplestudent(@RequestBody List<Student> list) {
		
		int status=service.createmultiplestudent(list);
		
		switch(status) {
		case 1:{
			return"data added sucessfully";
		}
		case 2:{
			return"data already exist";
		}
		case 3:{
			return "something went wrong";
		}
		default:
			return null;
		}
		
	}
	@DeleteMapping("/deletestudent/{id}")
	public String deletestudentbyid(@PathVariable long id) {
		int result=service.deletestudentbyid(id);
		switch(result) {
		case 1:{
			return"data deleted sucessfully";
		}
		case 2:{
			return"data not found";
		}
		case 3:{
			return "something went wrong";
		}
		default:
			return null;
		}
		
	}
	@GetMapping("/getallstudent")
	public Object getallstudent(){
		List<Student> list=service.getallstudent();
		if(list.isEmpty()) {
			return "data not found";
		}
		else {
			return list;
		}
		
	}
	
	@PutMapping("/update")
	public String updatestudent(@RequestBody Student student) {
		int result=service.updatestudent(student);
		
		switch(result) {
		case 1:{
			return"data updated sucessfully";
		}
		case 2:{
			return"data not found";
		}
		case 3:{
			return "something went wrong";
		}
		default:
			return null;
		}
		
	}

}
