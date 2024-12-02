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

import com.jbk.entity.Job_Posting;
import com.jbk.entity.Student;
import com.jbk.service.Jobpostingservice;
import com.jbk.service.Studentservice;

@RestController
@RequestMapping("/jobposting")
public class Jobposting {
	
	@Autowired
	Jobpostingservice service;
	
	@PostMapping("/createjob")
	public String createstudent(@RequestBody Job_Posting jobposting) {
		
		int status=service.createjobposting(jobposting);
		
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
	
		
	
	@DeleteMapping("/deletebyid/{id}")
	public String deletestudentbyid(@PathVariable long id) {
		int result=service.deletejobpostbyid(id);
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
	@GetMapping("/getalljobpost")
	public Object getallstudent(){
		List<Job_Posting> list=service.getalljobpost();
		if(list.isEmpty()) {
			return "data not found";
		}
		else {
			return list;
		}
		
	}
	
     @PutMapping("updatejobpost")
	public String updatestudent(@RequestBody Job_Posting jobposting) {
		int result=service.updatejobposting(jobposting);
		
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
