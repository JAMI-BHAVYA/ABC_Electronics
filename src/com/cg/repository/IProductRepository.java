package com.cg.repository;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.entities.Product;
import java.util.List;

public interface IProductRepository {
	void addProduct(); //Product
	void removeProduct(); //String
	List<Product> getProduct(); //String
	void updateProductWarranty(); //String
	List<Complaint> getProductComplaints(); //String
	List<Engineer> getEngineersByProduct(); //String
}
