package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.Studentdao;
import com.jbk.entity.Student;
@Service
public class Studentserviceimp implements Studentservice {
	
	@Autowired
	Studentdao dao;

	@Override
	public int createstudent(Student student) {
		
		int status=dao.creatstudent(student);
		return status;
	}

	@Override
	public int createmultiplestudent(List<Student> list) {
		int status=dao.createmultiplestudent(list);
		return status;
	}

	@Override
	public int deletestudentbyid(long id) {
		// TODO Auto-generated method stub
		int result=dao.deletestudentbyid(id);
		return result;
	}

	@Override
	public List<Student> getallstudent() {
		List<Student> list=dao.getallstudent();
		return list;
	}

	@Override
	public int updatestudent(Student student) {
		int result=dao.updatestudent(student);
		return result;
	}

}
