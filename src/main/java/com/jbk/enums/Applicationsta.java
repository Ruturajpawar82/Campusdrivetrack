package com.jbk.enums;

public class Applicationsta {
	public enum ApplicationStatus {
	    APPLIED("Applied"),
	    APPROVED("Approved"),
	    REJECTED("Rejected");

	    private final String statusDescription;

	    // Constructor to assign the description to each status
	    ApplicationStatus(String statusDescription) {
	        this.statusDescription = statusDescription;
	    }

	    // Getter method to retrieve the description of the status
	    public String getStatusDescription() {
	        return statusDescription;
	    }
	}


}
