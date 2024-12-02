package com.jbk.Dao;

import java.util.List;

import com.jbk.dup.login;
import com.jbk.entity.User;

public interface daoservice {
	
	public int createusers(User user);
	
	public User getuser(String username);
	
	public int deleteuser(String username);
	
	public User logincre(login lo);
	
	public List<User> getalluser();
	
	public int updateuser(User user);

}
