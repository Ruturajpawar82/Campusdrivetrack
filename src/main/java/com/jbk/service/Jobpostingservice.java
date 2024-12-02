package com.jbk.service;

import java.util.List;

import com.jbk.entity.Job_Posting;
import com.jbk.entity.Student;

public interface Jobpostingservice {
	
   public int createjobposting(Job_Posting jobposting);
   
	public int deletejobpostbyid(long id);
	
	public List<Job_Posting> getalljobpost();
	
	public int updatejobposting(Job_Posting jobposting);

}
