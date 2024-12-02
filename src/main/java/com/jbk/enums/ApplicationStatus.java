package com.jbk.enums;

public class ApplicationStatus {
	
	public enum UserRole {
	    ADMIN("Administrator"),
	    COLLEGE("College Administrator"),
	    COMPANY("Company Representative");

	    private final String roleDescription;

	    // Constructor to assign value to each role
	    UserRole(String roleDescription) {
	        this.roleDescription = roleDescription;
	    }

	    // Getter method to retrieve the description of the role
	    public String getRoleDescription() {
	        return roleDescription;
	    }
	}

}
