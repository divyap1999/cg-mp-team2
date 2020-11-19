package cg.ocrs.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cg.ocrs.model.Policy;

public class PolicyDaoImpl implements IPolicyDao {
	Connection con;
	PreparedStatement psmt;
	ResultSet rsPolicy;
	
	public PolicyDaoImpl() {
		try {
			con=ConnectionUtil.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Policy> getAllPolicies() throws SQLException {
		psmt=con.prepareStatement("select * from Policy");
		rsPolicy=psmt.executeQuery();
		List<Policy> policies=new ArrayList<>();
		while(rsPolicy.next()) {
			Policy policy=new Policy();
			
		}
		return policies;
	}
	

}
