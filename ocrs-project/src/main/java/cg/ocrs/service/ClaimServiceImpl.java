package cg.ocrs.service;

import java.sql.SQLException;

import cg.ocrs.dao.ClaimDaoImpl;
import cg.ocrs.dao.IClaimDao;
import cg.ocrs.model.Claim;

public class ClaimServiceImpl implements IClaimService {

	IClaimDao repo;
	
	public ClaimServiceImpl() throws SQLException {
		
		repo = new ClaimDaoImpl(); 	
			
	}

	
	public Claim getClaimReport(int claimNumber) throws SQLException {
		
		return repo.getDetailedClaimReportView(claimNumber);
	}


	public Claim createClaim(Claim claim) throws SQLException {
		
		return repo.createClaim(claim);
	}
	

	

}