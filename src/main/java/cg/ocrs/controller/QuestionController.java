package cg.ocrs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cg.ocrs.model.Claim;
import cg.ocrs.model.Questions;
import cg.ocrs.service.ClaimServiceImpl;
import cg.ocrs.service.IClaimService;
import cg.ocrs.service.IQuestionsService;
import cg.ocrs.service.QuestionsServiceImpl;

@WebServlet({"/view-questions","/claimreport-ques"})


public class QuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	static Logger myLogger =  Logger.getLogger(QuestionController.class.getName());

	IQuestionsService questionsService;
	
	public void init() throws ServletException {
		questionsService = new QuestionsServiceImpl();
	
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();

 		
 		if(uri.contains("claimreport-ques")) {
			try {
				claimReportWithQuestions(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
 	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();

 		
 		if(uri.contains("/view-questions")) {
			try {
				viewQuestions(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


 	
 	private void viewQuestions(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
		
 		String  claimType = request.getParameter("claimType");
 		int claimNumber = Integer.parseInt(request.getParameter("claimNumber"));
 		
 		List<Questions> questions = questionsService.getQuestionsByClaimType(claimType);
		
		if (questions.isEmpty()) {
			myLogger.info("Empty list is returned");
		}
		
		HttpSession ssn=request.getSession();
		ssn.setAttribute("questions", questions);
		ssn.setAttribute("claimType", claimType);
		ssn.setAttribute("claimNumber", claimNumber);
		myLogger.info("To View Questions, it is directed to questions.jsp page");
		response.sendRedirect("questions.jsp");	
	}

 	
 	private void claimReportWithQuestions(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException  {
			
 		
 		String  claimType = request.getParameter("claimType");
 		int  claimNumber = Integer.parseInt(request.getParameter("claimNumber"));
 		
 		Claim claim = new Claim();
		try {
			IClaimService claimService = new ClaimServiceImpl();
			claim = claimService.getClaimReport(claimNumber);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		


 		
 		List<Questions> quesAnsList = questionsService.getQuestionsByClaimType(claimType);
 		
 		String finalAnswer;
 		int total = 0;
 		
 		List<String> submittedQues = new ArrayList<String>();
 		
 		for (Questions q : quesAnsList) {
 			
 	 		String answer =request.getParameter(q.getQuestion());
 	 		
 	 		if(answer.equals("answer1")) {
 	 			finalAnswer = q.getAnswer1();
 	 			total += q.getA1weightage();
 	 		} else if(answer.equals("answer2")) {
 	 			finalAnswer = q.getAnswer2();
 	 			total += q.getA2weightage();
 	 		} else {
 	 			finalAnswer = q.getAnswer3();
 	 			total += q.getA3weightage();
 	 		}
 	 		
 	 		submittedQues.add(finalAnswer);
 		}	
 		
 		
 		HttpSession ssn=request.getSession();
		ssn.setAttribute("claim", claim);
 		ssn.setAttribute("ans", submittedQues);
		ssn.setAttribute("questions", quesAnsList);
		ssn.setAttribute("total", total);
	//	ssn.setAttribute("claimType",claimType);
		myLogger.info("To View Report, it is directed to detailed-report.jsp page");
		response.sendRedirect("detailed-report.jsp");
		
	}


}
