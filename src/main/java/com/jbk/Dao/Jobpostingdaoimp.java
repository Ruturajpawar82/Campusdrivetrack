package com.jbk.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jbk.entity.Job_Posting;
import com.jbk.entity.Student;
import com.jbk.entity.User;
@Repository
public class Jobpostingdaoimp implements Jobpostingdao {

	@Autowired
	SessionFactory sessionfactory;
	@Override
	public int creatjobposting(Job_Posting jobposting) {
		
			try {
			Session session=sessionfactory.openSession();
			Job_Posting dbid=session.get(Job_Posting.class, jobposting.getId());
			
			if (dbid==null) {
				session.save(jobposting);
				session.beginTransaction().commit();
				return 1;
			}
			else {
				return 2;
			}
			}catch(Exception e) {
				e.printStackTrace();
				return 3;
			}
			

	
	}

	@Override
	public int deletepostbyid(long id) {
		try {
			Session session=sessionfactory.openSession();
			Job_Posting dbid=session.get(Job_Posting.class, id);
			if(dbid!=null) {
				session.delete(dbid);
				session.beginTransaction().commit();
				return 1;
			}
			else {
				return 2;
			}
			}catch(Exception e) {
				e.printStackTrace();
				return 3;
			}
	}

	@Override
	public List<Job_Posting> getalljobpost() {
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("FROM Job_Posting");
		List<Job_Posting> list=query.list();
		return list;
	}

	@Override
	public int updatestudent(Job_Posting jobposting) {
		// TODO Auto-generated method stub
		try {
		Session session=sessionfactory.openSession();
		Job_Posting jobpostings=session.get(Job_Posting.class, jobposting.getId());
		if(jobpostings!=null) {
			session.evict(jobpostings);
			session.update(jobposting);
			session.beginTransaction().commit();
			return 1;
		}
		else {
			return 2;
		}
		}catch(Exception e) {
			e.printStackTrace();
			return 3;
		}
	}

}
