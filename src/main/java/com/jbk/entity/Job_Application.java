package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jbk.enums.Applicationsta;
@Entity
@Table(name="JobApplication")
public class Job_Application {
	
	@Id
	@Column(nullable = false,unique = true)
	private long id;
	@Column(nullable = false,unique = true)
	private long studentid;
	@Column(nullable = false,unique = true)
	private long jobpostingid;
	@Column(nullable = false,unique = false)
	private String Status=Applicationsta.ApplicationStatus.APPLIED.toString();
	
	public Job_Application(){
		
	}

	public Job_Application(long id, long studentid, long jobpostingid, String status) {
		super();
		this.id = id;
		this.studentid = studentid;
		this.jobpostingid = jobpostingid;
		Status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStudentid() {
		return studentid;
	}

	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}

	public long getJobpostingid() {
		return jobpostingid;
	}

	public void setJobpostingid(long jobpostingid) {
		this.jobpostingid = jobpostingid;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Job_Application [id=" + id + ", studentid=" + studentid + ", jobpostingid=" + jobpostingid + ", Status="
				+ Status + "]";
	}
	
}
