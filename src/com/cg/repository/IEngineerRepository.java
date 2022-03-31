package com.cg.repository;

import com.cg.entities.Complaint;

import java.util.List;

public interface IEngineerRepository {
	List<Complaint> getAllOpenComplaints(); //Engineer
	List<Complaint> getResolvedComplaints(); //Engineer
	List<Complaint> getResolvedComplaintsByDate(); // Engineer, LocalDate
	List<Complaint> getComplaints(); //Engineer, String
	String changeComplaintStatus(); //Integer
}
