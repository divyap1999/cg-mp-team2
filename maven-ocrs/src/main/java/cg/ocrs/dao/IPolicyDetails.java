package cg.ocrs.dao;
import java.sql.SQLException;
import cg.ocrs.model.*;

public interface IPolicyDetails {

	
	PolicyDetails addQuestionId(PolicyDetails QuestionId) throws SQLException;
	
	PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException;
}
