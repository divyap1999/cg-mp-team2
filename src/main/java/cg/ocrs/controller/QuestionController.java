package cg.ocrs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cg.ocrs.model.Questions;
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
			claimReportWithQuestions(request,response);
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
 		
 		int claimTypeId = questionsService.getClaimIdbyClaimType(claimType); 
 		
 		
 		List<Questions> questions = questionsService.getQuestionByClaimTypeId(claimTypeId);
		
		if (questions.isEmpty()) {
			myLogger.info("Empty list is returned");
		}
		
		HttpSession ssn=request.getSession();
		ssn.setAttribute("questions", questions);
		myLogger.info("To View Questions, it is directed to questions.jsp page");
		response.sendRedirect("questions.jsp");	
	}

 	
 	private void claimReportWithQuestions(HttpServletRequest request, HttpServletResponse response)  {
		
 		
		
	}


}
