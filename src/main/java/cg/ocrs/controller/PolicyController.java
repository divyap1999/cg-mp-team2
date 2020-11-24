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

import cg.ocrs.model.Policy;
import cg.ocrs.service.IPolicyService;
import cg.ocrs.service.PolicyServiceImpl;

@WebServlet({"/viewpolicies"})


public class PolicyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static Logger myLogger =  Logger.getLogger(PolicyController.class.getName());

	IPolicyService policyService;
	
	public void init() throws ServletException {
		try {
			policyService = new PolicyServiceImpl();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();

 		
 		if(uri.contains("/viewpolicies")) {
			try {
				viewAllPolicies(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


 	
 	private void viewAllPolicies(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		List<Policy> policies =policyService.getAllPolicies();
		
		if (policies.isEmpty()) {
			myLogger.info("Empty list is returned");
		}
		
		HttpSession ssn=request.getSession();
		ssn.setAttribute("policies", policies);
		myLogger.info("To View Policies, it is directed to cliam-report.jsp page");
		response.sendRedirect("viewall-policies.jsp");	
	}


}
