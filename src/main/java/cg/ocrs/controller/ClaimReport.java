package cg.ocrs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cg.ocrs.model.Claim;
import cg.ocrs.service.ClaimServiceImpl;
import cg.ocrs.service.IClaimService;


@WebServlet({"/report","/createclaim"})

public class ClaimReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	IClaimService service;
	
	public void init() throws ServletException {
		try {
			service = new ClaimServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();
		if(uri.contains("/createclaim")) {
			createNewClaim(request, response);
		}
				
	}
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();
		
		if(uri.contains("/report")) {
			
			generateReport(request, response);
	
		}
		
	
		
	}

	private void generateReport(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		int claimNumber=Integer.parseInt(request.getParameter("claimNumber"));		
	
		Claim claim = new Claim();
		try {
			claim = service.getClaimReport(claimNumber);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		HttpSession ssn=request.getSession();
		
		ssn.setAttribute("claim", claim);
		response.sendRedirect("claim-report.jsp");		
	}
	
	
	
	private void createNewClaim(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int claimNumber=Integer.parseInt(request.getParameter("claimNumber"));
		String claimReason=request.getParameter("claimReason");
		String accidentLocationStreet=request.getParameter("accidentLocationStreet");
		String accidentCity = request.getParameter("accidentCity");
		String accidentState = request.getParameter("accidentState");
		int accidentZip = Integer.parseInt(request.getParameter("accidentZip"));
		String claimType = request.getParameter("claimType");
		int policyNumber = Integer.parseInt(request.getParameter("policyNumber"));
		
		Claim claim = new Claim(claimNumber, claimReason, accidentLocationStreet, accidentCity, accidentState, accidentZip, claimType, policyNumber);
		
		try {
			service.createClaim(claim);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		RequestDispatcher rd = request.getRequestDispatcher("claim-report.jsp");
//		rd.forward(request, response);
		
		HttpSession ssn=request.getSession();
		ssn.setAttribute("claim", claim);
		response.sendRedirect("claim-report.jsp");
		
	}

	
}
