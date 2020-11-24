package cg.ocrs.dao;
import java.sql.SQLException;
import java.util.List;

import cg.ocrs.model.*;

public interface IPolicyDetailsDao {

	
	PolicyDetails addQuestionId(PolicyDetails QuestionId) throws SQLException;
	
	PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException;
	List<PolicyDetails> getAllPolicyDetails() throws SQLException;
}
