package cg.ocrs.service;

import java.sql.SQLException;
import java.util.List;

import cg.ocrs.dao.IPolicyDao;
import cg.ocrs.dao.PolicyDaoImpl;
import cg.ocrs.model.Policy;

public class PolicyServiceImpl implements IPolicyService {

	IPolicyDao policyRepo;
	
	public PolicyServiceImpl() throws SQLException {
		
		policyRepo = new PolicyDaoImpl();
	}
	
	public Policy addPolicy(Policy policy) throws SQLException {
		return policyRepo.addPolicy(policy);
	}

	public List<Policy> getAllPolicies() throws SQLException {
		return policyRepo.getAllPolicies();
	}

	
	
}