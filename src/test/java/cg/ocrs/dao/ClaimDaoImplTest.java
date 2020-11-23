package cg.ocrs.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cg.ocrs.model.Claim;

class ClaimDaoImplTest {

	IClaimDao repo = new ClaimDaoImpl(); 

	
	@Test
	void testGetDetailedClaimReportView() throws SQLException {
		IClaimDao repo = new ClaimDaoImpl(); 
		Claim savedReport = new Claim(100, "Damage", "St-12", "Hyderabad", "Telangana",500017,"Restaurant", 200);;
		Claim claimreport = repo.getDetailedClaimReportView(savedReport.getClaimNumber());
		
		assertEquals(savedReport, claimreport);
	}	
	
	@Test
	void testCreateClaim() throws SQLException {
		Claim claim = new Claim(119, "Repairs", "St-27", "Bangalore", "Karnataka",500017,"Restaurant", 200);
		Claim newclaim = repo.createClaim(claim);
		assertEquals(claim, newclaim);
		//repo.deleteClaim(119);
	}

//	@Test
//	void testDeleteClaim() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateClaim() {
//		fail("Not yet implemented");
//	}

}
