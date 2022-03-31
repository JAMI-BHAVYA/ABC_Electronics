package com.cg.entities;

public class Engineer {
	private int employeeId;
	private String password;
	private String engineerName;
	private String domain;

	public Engineer() {
	}

	public Engineer(int employeeId, String password, String engineerName, String domain) {
		super();
		this.employeeId = employeeId;
		this.password = password;
		this.engineerName = engineerName;
		this.domain = domain;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
