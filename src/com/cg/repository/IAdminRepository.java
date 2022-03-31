package com.cg.repository;

import com.cg.entities.Complaint;
import java.util.List;

public interface IAdminRepository {
	void addEngineer(); //Engineer
	void changeDomain(); //String
	void removeEngineer(); //Integer
	List<Complaint> getComplaintsByProducts(); //String
	List<Complaint> getComplaints(); //String,String
	Complaint replaceEngineerFromComplaint(); //Integer
}
