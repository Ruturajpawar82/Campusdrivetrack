package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.Jobpostingdao;
import com.jbk.entity.Job_Posting;
import com.jbk.entity.Student;
@Service
public class Jobpostingserviceimp implements Jobpostingservice {
	@Autowired
	Jobpostingdao daos1;

	@Override
	public int createjobposting(Job_Posting jobposting) {
		int status=daos1.creatjobposting(jobposting);
		return status;
	}

	@Override
	public int deletejobpostbyid(long id) {
		int status=daos1.deletepostbyid(id);
		return status;
	}

	@Override
	public List<Job_Posting> getalljobpost() {
		List<Job_Posting> list=daos1.getalljobpost();
		return list;
		
	}

	@Override
	public int updatejobposting(Job_Posting jobposting) {
		int status=daos1.updatestudent(jobposting);
		return status;
	}

}
