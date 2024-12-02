package com.jbk.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.dup.login;
import com.jbk.entity.User;
@Repository 
public class daoimple implements daoservice {
	
	@Autowired
	SessionFactory sessionfactory;

	@Override
	public int createusers(User user) {
		try {
		Session session=sessionfactory.openSession();
		User name=session.get(User.class, user.getUsername());
		
		if (name==null) {
			session.save(user);
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
	public User getuser(String username) {
		Session session=sessionfactory.openSession();
		User name=session.get(User.class, username);
		if(name!=null) {
			return name;
		}
		else {
			
		return null;
		}
	}

	@Override
	public int deleteuser(String username) {
		try {
		Session session=sessionfactory.openSession();
		User user=session.get(User.class, username);
		if(user!=null) {
			session.delete(user);
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
	public User logincre(login lo) {
		try {
		Session session=sessionfactory.openSession();
		User user=session.get(User.class, lo.getUsername());
		if(user.getPassword().equals(lo.getPassword())) {
			return user;
		}
		else {
			return null;
		}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<User> getalluser() {
		List<User> list=null;
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("FROM User");
		list=query.list();
		
		return list;
	}

	@Override
	public int updateuser(User user) {
		try {
		Session session=sessionfactory.openSession();
		User users=session.get(User.class, user.getUsername());
		if(users!=null) {
		session.evict(users);
		session.update(user);
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
