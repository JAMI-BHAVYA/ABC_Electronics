package com.cg.entities;

public class Complaint {
	private int complaintId;
	private String productModelName;
	private String ComplaintName;
	private String status;
	private String clientId;
	private int engineerId;

	public Complaint() {
	}

	public Complaint(int complaintId, String productModelName, String ComplaintName, String status, String clientId,
			int engineerId) {
		super();
		this.complaintId = complaintId;
		this.productModelName = productModelName;
		this.ComplaintName = ComplaintName;
		this.status = status;
		this.clientId = clientId;
		this.engineerId = engineerId;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getProductModelName() {
		return productModelName;
	}

	public void setProductModelName(String productModelName) {
		this.productModelName = productModelName;
	}

	public String getComplaintName() {
		return ComplaintName;
	}

	public void setComplaintName(String complaintName) {
		ComplaintName = complaintName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public int getEngineerId() {
		return engineerId;
	}

	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}
}
