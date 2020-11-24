package cg.ocrs.dao;

import java.sql.SQLException;

import cg.ocrs.model.PolicyDetails;

public interface IPolicyDetailsDao {

	
	PolicyDetails addQuestionId(PolicyDetails QuestionId) throws SQLException;
	
	PolicyDetails addPolicyDetails(PolicyDetails policyDetails) throws SQLException;
}