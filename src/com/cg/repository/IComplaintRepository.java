package com.cg.repository;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.entities.Product;
import java.util.List;

public interface IComplaintRepository {
	boolean bookComplaint(); //Client,Complaint,Product
	String changeComplaintStatus(); //Complaint
	List<Complaint> getClientAllComplaints(); //Client
	List<Complaint> getClientAllOpenComplaints(); //integer
	Engineer getEngineer();//Integer
	Product getProductByComplaint(); //integer
}