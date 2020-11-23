package cg.ocrs.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import cg.ocrs.model.Claim;

class ClaimDaoImplTest {

	IClaimDao repo = new ClaimDaoImpl();

	Claim claim = new Claim();


	@Test
	void testGetDetailedClaimReportView() throws SQLException {
		Claim claimreport = new Claim(claim.getClaimNumber(), claim.getClaimReason(), claim.getAccidentLocationStreet(), claim.getAccidentCity(), claim.getAccidentState(), claim.getAccidentZip(), claim.getClaimType(), claim.getPolicyNumber());
		Claim savedReport = repo.getDetailedClaimReportView(claim.getClaimNumber());
		assertEquals(claimreport, savedReport);
	}

	@Test
	void testCreateClaim() throws SQLException {
		Claim claimCreate = new Claim(claim.getClaimNumber(), claim.getClaimReason(), claim.getAccidentLocationStreet(), claim.getAccidentCity(), claim.getAccidentState(), claim.getAccidentZip(), claim.getClaimType(), claim.getPolicyNumber());
		Claim savedClaim = repo.createClaim(claim);
		assertEquals(claimCreate, savedClaim);

	}

}
