package com.jbk.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.jbk.enums.InterviewStatuss;
@Entity
public class Interview {
	
	@Id
	@Column(nullable = false,unique = true)
	private long id;
	@Column(nullable = false,unique = true)
	private long studentid;
	@Column(nullable = false,unique = true)
	private long jobapplicationid;
	@Column(nullable = false,unique = false)
	private Date interviewdate;
	@Column(nullable = false,unique = false)
	private String interviewstatus=InterviewStatuss.InterviewStatus.SCHEDULED.toString();

}
