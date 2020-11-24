package cg.ocrs.service;

import java.sql.SQLException;
import java.util.List;

import cg.ocrs.dao.IPolicyDetailsDao;
import cg.ocrs.dao.PolicyDetailsImpl;
import cg.ocrs.model.PolicyDetails;

public class PolicyDetailsServiceImp implements IPolicyDetailsService{
	IPolicyDetailsDao repo;

	public PolicyDetailsServiceImp() throws SQLException {
		repo=new PolicyDetailsImpl();
		
	}
   public List<PolicyDetails> getAllPolicyDetails() throws SQLException{
		
		return repo.getAllPolicyDetails();
	
	}
public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException {
	return repo.addPolicyDetails(policyDetails);
}


}
