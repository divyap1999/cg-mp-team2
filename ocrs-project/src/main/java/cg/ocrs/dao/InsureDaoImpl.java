package cg.ocrs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cg.ocrs.model.Policy;

public class InsureDaoImpl implements IInsureDao{
	Connection con;
	PreparedStatement psmt;
	ResultSet rsInsure;

	public InsureDaoImpl() {
		try {
			con=ConnectionUtil.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

public List<Insure> getAllAgent() throws SQLException {
		
		
		psmt = con.prepareStatement("select * from insured where agent=?");
		rsInsure = psmt.executeQuery();
			
		List<Insure> insure = new ArrayList<Insure>();
			
		while(rsInsure.next()) {
		
			Insure insures = new Insure();
			
			insures.setPolicyNumber(rsInsure.getString("UserName"));
			insures.setPolicyPremium(rsInsure.getString("password"));
			insures.setAccountNumber(rsInsure.getInt("agent"));
			
			insure.add(insures);
		
		}
			
			
			return insure;
		
	}


}
