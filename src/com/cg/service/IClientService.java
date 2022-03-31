package com.cg.service;

import com.cg.entities.Engineer;
import com.cg.entities.Client;
import java.util.List;

public interface IClientService {
	void saveClient(); //Client
	Client getClientByClientId(); //String
	Engineer getEngineerById(); //integer
	List<Engineer> getEngineersByDomain(); //String
	String changeStatusOfComplaint(); //integer
	Client signIn();//Client
	Client signOut(); //Client
}
