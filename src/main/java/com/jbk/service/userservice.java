package com.jbk.service;

import java.util.List;

import com.jbk.dup.login;
import com.jbk.entity.User;

public interface userservice {
	
	public int createuser(User user);

	public User getuser(String name);
	
	public int deleteuse(String names);
	public User logincre(login lo);
	
	public List<User> getalluser();
	
	public int updateuser(User user);
}
