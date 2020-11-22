package cg.ocrs.service;

import java.sql.SQLException;

import cg.ocrs.model.Claim;


public interface IClaimService {

	public Claim getClaimReport(int claimNumber)throws SQLException;
			
	public Claim createClaim(Claim claim) throws SQLException;
}