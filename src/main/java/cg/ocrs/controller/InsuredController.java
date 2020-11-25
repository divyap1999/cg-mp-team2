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

import cg.ocrs.model.Insured;
import cg.ocrs.service.InsuredServiceImpl;


@WebServlet("/viewinsured")

public class InsuredController extends HttpServlet {
	
	static Logger myLogger =  Logger.getLogger(InsuredController.class.getName());

	InsuredServiceImpl insuredService;
	
	public void init() throws ServletException {
		insuredService = new InsuredServiceImpl();
	
	}
	
	
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri=request.getRequestURI();

 		
 		if(uri.contains("/viewinsured")) {
			try {
				viewAllInsured(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


 	
 	private void viewAllInsured(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		String userName=request.getParameter("userName");

		List<Insured> insured_list =insuredService.getInsuredByHandler(userName);
		
		if (insured_list.isEmpty()) {
			myLogger.info("Empty list is returned");
		}
		
		HttpSession ssn=request.getSession();
		ssn.setAttribute("insured_list", insured_list);
		myLogger.info("To View all Insured user, it is directed to view-insured.jsp page");
		response.sendRedirect("view-insured.jsp");	
	}


}
