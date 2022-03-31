package com.cg.entities;

public class Client {
	private String clientId;
	private String password;
	private String address;
	private long phoneNumber;

	public Client() {
	}

	public Client(String clientId, String password, String address, long phoneNumber) {
		super();
		this.clientId = clientId;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
