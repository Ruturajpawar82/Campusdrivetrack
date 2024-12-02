package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
    @Column(name="Id",nullable = false,unique = true)
	private long id;
	 @Column(name="Name",nullable = false,unique = false)
	private String name;
	 @Column(name="Email",nullable = false,unique = true)
	private String email;
	 @Column(name="Password",nullable = false,unique = false)
	private String password;
	 @Column(name="ContactNumber",nullable = false,unique = true)
	private String contactnumber;
	 @Column(name="Department",nullable = false,unique = false)
	private String department;
	 @Column(name="GraduationYear",nullable = false,unique = false)
	private String graduationyear;
	
	public  Student(){
		 
	 }

	public Student(long id, String name, String email, String password, String contactnumber, String department,
			String graduationyear) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactnumber = contactnumber;
		this.department = department;
		this.graduationyear = graduationyear;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGraduationyear() {
		return graduationyear;
	}

	public void setGraduationyear(String graduationyear) {
		this.graduationyear = graduationyear;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contactnumber=" + contactnumber + ", department=" + department + ", graduationyear="
				+ graduationyear + "]";
	}
	

}
