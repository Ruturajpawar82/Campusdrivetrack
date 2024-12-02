package com.jbk.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Student;
@Repository
public class Studentdaoimp implements Studentdao {
	
	@Autowired
	SessionFactory sessionfactory;

	@Override
	public int creatstudent(Student student) {
		try {
		Session session=sessionfactory.openSession();
		Student dbid=session.get(Student.class, student.getId());
		if(dbid==null) {
			session.save(student);
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
	public int createmultiplestudent(List<Student> list) {
		try {
		Session session=sessionfactory.openSession();
		
		Query query=session.createQuery("FROM Student");
		List<Student> List1=query.list();
		boolean result=true;
		for(int i=0;i<List1.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(List1.get(i).getId()==list.get(j).getId()) {
					result=false;
				}
			}
		}
		
		if(result) {
			
			for(Student student:list) {
				session.save(student);
			}
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
	public int deletestudentbyid(long id) {
		try {
		Session session=sessionfactory.openSession();
		Student dbid=session.get(Student.class, id);
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
	public List<Student> getallstudent() {
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("FROM Student");
		List<Student> list=query.list();
		return list;
	}

	@Override
	public int updatestudent(Student student) {
		// TODO Auto-generated method stub
		try {
		Session session=sessionfactory.openSession();
		Student dbid=session.get(Student.class, student.getId());
		if(dbid!=null) {
			dbid.setId(student.getId());
			dbid.setName(student.getName());
			dbid.setEmail(student.getEmail());
			dbid.setPassword(student.getPassword());
			dbid.setContactnumber(student.getContactnumber());
			dbid.setDepartment(student.getDepartment());
			session.save(dbid);
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
