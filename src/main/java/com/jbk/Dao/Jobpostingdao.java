package com.jbk.Dao;

import java.util.List;

import com.jbk.entity.Job_Posting;
import com.jbk.entity.Student;

public interface Jobpostingdao {
	
	
       public int creatjobposting(Job_Posting jobposting);
	
	
	public int deletepostbyid(long id);
	
	public List<Job_Posting> getalljobpost();
	
	public int updatestudent( Job_Posting jobposting);

}
