package cg.ocrs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cg.ocrs.dao.ConnectionUtil;
import cg.ocrs.model.Insured;

public class InsuredServiceImpl {

	Connection con;
	PreparedStatement psmt;
	ResultSet rsInsured;

	public InsuredServiceImpl() {
		try {
			con=ConnectionUtil.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

public List<Insured> getInsuredByHandler(String handler) throws SQLException {
		
		
		psmt = con.prepareStatement("select * from insured where agent=?");
		psmt.setString(1, handler);
		rsInsured = psmt.executeQuery();
			
		List<Insured> insured_list = new ArrayList<Insured>();
			
		while(rsInsured.next()) {
		
			Insured insured = new Insured();
			
			insured.setUserName(rsInsured.getString("User_Name"));
			insured.setHandler(rsInsured.getString("agent"));
			insured.setPassword(rsInsured.getString("password"));
			
			insured_list.add(insured);
		
		}
			
			
			return insured_list;
		}
}
