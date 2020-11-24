package cg.ocrs.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import cg.ocrs.model.UserRole;

class UserRepoImplTest {
	
	IUserRepo repo=new UserRepoImpl();
	
	@Test
	void testGetUserByUserName() throws SQLException {
		UserRole savedreport=new UserRole("Divya","Divyaa@123","claim_adjuster");
		UserRole userreport=repo.getUserByUserName(savedreport.getUserName());
		assertEquals(savedreport,userreport);
	}

}
