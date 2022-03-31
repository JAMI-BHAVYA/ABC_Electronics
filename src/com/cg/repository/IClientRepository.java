package com.cg.repository;

import com.cg.entities.Client;
import com.cg.entities.Engineer;
import java.util.List;

public interface IClientRepository {
	void saveClient(); //Client
	Client getClientByByClientId(); //String
	Engineer getEngineerById(); //Integer
	List<Engineer> getEngineerByDomain(); //String
	String changeStatusOfComplaint(); //Integer
	Client signIn(); //Client
	Client signOut();	//Client
	
}
