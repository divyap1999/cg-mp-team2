package cg.ocrs.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import cg.ocrs.model.PolicyDetails;

public class PolicyDetailsImpl implements IPolicyDetails {

	PreparedStatement psmt;
	ResultSet studentResultSet;
	Connection connection;
public PolicyDetailsImpl() throws SQLException{
	connection=ConnectionUtil.createConnection();
	
}




@Override
  public PolicyDetails addQuestionId(PolicyDetails QuestionId) throws SQLException {
	// TODO Auto-generated method stub
	psmt=connection.prepareStatement("insert into credentials values(?)");
	psmt.setInt(1, QuestionId.getQuestionId());
	psmt.executeUpdate();
	return QuestionId;
	
}

public PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException{
	psmt=connection.prepareStatement("insert into credentials values(?,?,?)");
	psmt.setInt(1, policyDetails.getPolicyNo());
	psmt.setInt(2, policyDetails.getQuestionId());
	psmt.setString(3, policyDetails.getAnswer());
	
	return policyDetails;
	
}




}
