package cg.ocrs.service;

import java.sql.SQLException;
import java.util.List;

import cg.ocrs.model.Questions;

public interface IQuestionsService {

	public List<Questions> getQuestionByClaimTypeId(int claimTypeId) throws SQLException;
	public List<Questions> getAnswersbyQuesId(int questionId) throws SQLException;
	public int getClaimIdbyClaimType(String claimType) throws SQLException;
}
