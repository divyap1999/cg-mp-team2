package cg.ocrs.service;

import java.sql.SQLException;
import java.util.List;

import cg.ocrs.dao.IPolicyDao;
import cg.ocrs.dao.PolicyDaoImpl;
import cg.ocrs.model.Policy;

public class PolicyServiceImpl implements IPolicyService {
	IPolicyDao repo;
	public PolicyServiceImpl() throws SQLException{
		repo=new PolicyDaoImpl();
		
	}
	@Override
	public List<Policy> getAllPolicies() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllPolicies();
	}

}
