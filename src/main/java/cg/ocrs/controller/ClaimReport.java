package cg.ocrs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cg.ocrs.dao.ClaimDaoImpl;
import cg.ocrs.dao.IClaimDao;
import cg.ocrs.model.Claim;


@WebServlet("/report")
public class ClaimReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	IClaimDao service = new ClaimDaoImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		int claimNumber=Integer.parseInt(request.getParameter("claimNumber"));
//		String claimReason=request.getParameter("claimReason");
//		String accidentLocationStreet=request.getParameter("accidentLocationStreet");
//		String accidentCity = request.getParameter("accidentCity");
//		String accidentState = request.getParameter("accidentState");
//		int accidentZip = Integer.parseInt(request.getParameter("accidentZip"));
//		String claimType = request.getParameter("claimType");
//		int policyNumber = Integer.parseInt(request.getParameter("policyNumber"));
		
	
		Claim claim = new Claim();
		try {
			claim = service.getDetailedClaimReportView(claimNumber);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		HttpSession ssn=request.getSession();
		
		ssn.setAttribute("claim", claim);
		response.sendRedirect("claim-report.jsp");
		
		
	}
	
}
