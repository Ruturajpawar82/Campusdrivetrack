package com.jbk.Dao;

import java.util.List;

import com.jbk.entity.Student;

public interface Studentdao {
	
	public int creatstudent(Student student);
	
	public int createmultiplestudent(List<Student> list);
	
	public int deletestudentbyid(long id);
	
	public List<Student> getallstudent();
	
	public int updatestudent(Student student);

}
