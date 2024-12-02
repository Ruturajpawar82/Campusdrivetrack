package com.jbk.enums;

public class InterviewStatuss {
	
	public enum InterviewStatus {
	    SCHEDULED("Interview Scheduled"),
	    COMPLETED("Interview Completed"),
	    CANCELLED("Interview Cancelled");

	    private final String statusDescription;

	    // Constructor to assign the description to each status
	    InterviewStatus(String statusDescription) {
	        this.statusDescription = statusDescription;
	    }

	    // Getter method to retrieve the description of the status
	    public String getStatusDescription() {
	        return statusDescription;
	    }
	}

}
