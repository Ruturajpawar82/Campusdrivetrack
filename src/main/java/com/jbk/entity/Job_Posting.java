package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="JobPosting")
public class Job_Posting {
	
	@Id
	@Column(nullable = false,unique = true)
	private long id;
	@Column(nullable = false,unique = false)
	private String job_title;
	@Column(nullable = false,unique = false)
	private String companyname;
	@Column(nullable = false,unique = false)
	private String jobdecription;
	@Column(nullable = false,unique = true)
	private String job_location;
	@Column(nullable = false,unique = false)
	private String eligibilitycriteria;
	
	public Job_Posting() {
		
	}

	public Job_Posting(long id, String job_title, String companyname, String jobdecription, String job_location,
			String eligibilitycriteria) {
		super();
		this.id = id;
		this.job_title = job_title;
		this.companyname = companyname;
		this.jobdecription = jobdecription;
		this.job_location = job_location;
		this.eligibilitycriteria = eligibilitycriteria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getJobdecription() {
		return jobdecription;
	}

	public void setJobdecription(String jobdecription) {
		this.jobdecription = jobdecription;
	}

	public String getJob_location() {
		return job_location;
	}

	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}

	public String getEligibilitycriteria() {
		return eligibilitycriteria;
	}

	public void setEligibilitycriteria(String eligibilitycriteria) {
		this.eligibilitycriteria = eligibilitycriteria;
	}

	@Override
	public String toString() {
		return "Job_Posting [id=" + id + ", job_title=" + job_title + ", companyname=" + companyname
				+ ", jobdecription=" + jobdecription + ", job_location=" + job_location + ", eligibilitycriteria="
				+ eligibilitycriteria + "]";
	}

	
}
