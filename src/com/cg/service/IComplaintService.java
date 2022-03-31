package com.cg.service;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.entities.Product;
import java.util.List;

public interface IComplaintService 
{
	boolean bookComplaint();//Client,Complaint,Product
	String changeComplaintStatus(); //Complaint  
	List<Complaint> getClientAllComplaints(); //Client
	List<Complaint> getClientAllOpenComplaints(); //Client
	Engineer getEngineer(); //integer
	Product getProductByComplaint(); //integer	
}
