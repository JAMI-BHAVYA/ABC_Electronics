package com.cg.entities;

public class Admin {
	private int AdminId;
	private String password;
	private long contactNumber;
	private String emailId;

	public Admin() {
	}

	public Admin(int AdminId, String password, long contactNumber, String emailId) {
		super();
		this.AdminId = AdminId;
		this.password = password;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}

	public int getAdminId() {
		return AdminId;
	}

	public void setAdminId(int adminId) {
		AdminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
