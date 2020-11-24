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
@WebServlet("/viewpolicies")

public class ViewPolicies extends HttpServlet {
	static Logger myLogger=Logger.getLogger(ViewPolicies.class.getName());
	private static final long serialVersionUID = 1L;
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
		if(policies.isEmpty()) {
			myLogger.info("Empty list is returned");
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("policies", policies);
		myLogger.info("To view Policies, it is directed to claim-report.jsp page");
		response.sendRedirect("view-all-policies.jsp");	
	}	
}