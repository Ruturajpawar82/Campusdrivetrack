package com.jbk.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.jbk.enums.ApplicationStatus;
@Entity
@Table(name="user_details")
public class User {
	
	@Id
	@Column(name="Username",nullable=false,unique = true)
	@NotBlank(message = "invalid username")
	private String username;
	@Column(name="Password",nullable=false,unique = false)
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$",message = "please enter password in correct format")
	private String password;
	@NotBlank
	@Column(name="Question",nullable=false,unique =false)
	private String question;
	@NotBlank
	@Column(name="Answer",nullable=false,unique = false)
	private String answer;
	@NotBlank
	private String role;
	
	public User(){
		
	}

	public User(String username, String password, String question, String answer, String role) {
		super();
		this.username = username;
		this.password = password;
		this.question = question;
		this.answer = answer;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", question=" + question + ", answer=" + answer
				+ ", role=" + role + "]";
	}
	

	
	
	
	
	

}
