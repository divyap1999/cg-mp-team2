package cg.ocrs.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cg.ocrs.model.PolicyDetails;

public class PolicyDetailsImpl implements IPolicyDetailsDao {

	PreparedStatement psmt;
	ResultSet pdResultSet;
	Connection connection;
public PolicyDetailsImpl() throws SQLException{
	connection=ConnectionUtil.getConnection();
	
}
@Override
  public PolicyDetails addQuestionId(PolicyDetails QuestionId) throws SQLException {
	// TODO Auto-generated method stub
	psmt=connection.prepareStatement("insert into PolicyDetails values(?)");
	psmt.setString(1, QuestionId.getQuestionId());
	psmt.executeUpdate();
	return QuestionId;
	
}
public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException{
	
	psmt=connection.prepareStatement("insert into PolicyDetails values(?,?,?)");
	psmt.setInt(1, policyDetails.getPolicyNo());
	psmt.setString(2, policyDetails.getQuestionId());
	psmt.setString(3, policyDetails.getAnswer());
	return policyDetails;
	
}



public List<PolicyDetails> getAllPolicyDetails() throws SQLException{
	psmt=connection.prepareStatement("select *from PolicyDetails");
	pdResultSet=psmt.executeQuery();
	
	List<PolicyDetails> p=new ArrayList<PolicyDetails>();
	while(pdResultSet.next()) {
		PolicyDetails policyDetails=new PolicyDetails();
		policyDetails.setPolicyNo(pdResultSet.getInt("PolicyNo"));
		policyDetails.setQuestionId(pdResultSet.getString("QuestionId"));
		policyDetails.setAnswer(pdResultSet.getString("Answer"));
		p.add(policyDetails);
		
		
	}
	return p;
}




}
