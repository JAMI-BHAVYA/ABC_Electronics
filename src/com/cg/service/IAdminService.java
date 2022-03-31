package com.cg.service;

import com.cg.entities.Complaint;

import java.util.List;

public interface IAdminService {
	void addEngineer(); //Engineer
	void changeDomain(); //Integer, String
	void removeEngineer(); //Integer
	List<Complaint> getComplaintsByProduts(); //String 
	List<Complaint> getComplaints(); //String, String
	Complaint replaceEngineerFromComplaint(); //Integer
	
}
