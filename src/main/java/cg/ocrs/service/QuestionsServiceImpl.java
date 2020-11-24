package cg.ocrs.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cg.ocrs.dao.ConnectionUtil;
import cg.ocrs.exception.ClaimTypeNotFoundException;
import cg.ocrs.exception.QuestionIdNotFoundException;
import cg.ocrs.exception.UserNotFoundException;
import cg.ocrs.model.Questions;
import cg.ocrs.model.Questions;

public class QuestionsServiceImpl implements IQuestionsService{

	Connection con;
	PreparedStatement psmt;
	ResultSet rsquestions;

	public QuestionsServiceImpl() {
		
		try {
			con = ConnectionUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Questions> getQuestionByClaimTypeId(int claimTypeId) throws SQLException {
		psmt = con.prepareStatement("select questions from questions where claimtypeid=?");
		psmt.setInt(1, claimTypeId);
		rsquestions = psmt.executeQuery();
		
		List<Questions> questions = new ArrayList<Questions>();
		
		if(!rsquestions.next()) {
			throw new ClaimTypeNotFoundException("User with questions Number ["+claimTypeId+"] does not exist");
		}
		while(rsquestions.next()) {
			
			Questions ques = new Questions();
		
			ques.setQuestion(rsquestions.getString("questions"));
		
			questions.add(ques);
		}
		return questions;
	}

	public List<Questions> getAnswersbyQuesId(int questionId) throws SQLException{
		
		psmt = con.prepareStatement("select * from answers where questionid=?");
		psmt.setInt(1, questionId);
		rsquestions = psmt.executeQuery();
		
		List<Questions> answers = new ArrayList<Questions>();
		
		if(!rsquestions.next()) {
			throw new QuestionIdNotFoundException("User with questions Number ["+questionId+"] does not exist");
		}
		while(rsquestions.next()) {
			
			Questions ans = new Questions();
		
			ans.setClaimType(rsquestions.getString("claimtype"));
			ans.setQuestion(rsquestions.getString("question"));
			ans.setAnswer(rsquestions.getString("answer"));
		
			answers.add(ans);
		}
		return answers;
	}

	public int getClaimIdbyClaimType(String claimType) throws SQLException {
		
		psmt = con.prepareStatement("select claimtypeid from claimtype where claimtype=?");
		psmt.setString(1, claimType);
		rsquestions = psmt.executeQuery();
		if(!rsquestions.next()) {
			throw new ClaimTypeNotFoundException("User with Claim Type ["+claimType+"] does not exist");
		}
		
		Questions ques = new Questions();
		ques.setClaimTypeId(rsquestions.getInt("claimtypeid"));
		
		return ques.getClaimTypeId();
	}
	
	
}

