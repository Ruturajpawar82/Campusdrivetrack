package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.daoservice;
import com.jbk.dup.login;
import com.jbk.entity.User;
@Service
public class serviceimpl implements userservice {
    
	@Autowired
	daoservice daos;
	@Override
	public int createuser(User user) {
		int u=daos.createusers(user);
		return u;
	}
	@Override
	public User getuser(String name) {
		// TODO Auto-generated method stub
		User user=daos.getuser(name);
		return user;
	}
	@Override
	public int deleteuse(String names) {
		// TODO Auto-generated method stub
		int result=daos.deleteuser(names);
		return result;
	}
	@Override
	public User logincre(login lo) {
		User o=daos.logincre(lo);
		return o;
	}
	@Override
	public List<User> getalluser() {
		List<User> list=null;
		list=daos.getalluser();
		return list;
	}
	@Override
	public int updateuser(User user) {
		// TODO Auto-generated method stub
		int result=daos.updateuser(user);
		return result;
	}

}
