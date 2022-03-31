package com.cg.service;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.entities.Product;
import java.util.List;

public interface IProductService 
{
	void addProduct(); //Product
	void removeProducts(); //String
	List<Product> getProduct();//String
	void updateProductWarranty(); //String
	List<Complaint> getProductComplaints(); //String
	List<Engineer> getEngineersByProduct(); //String

}
