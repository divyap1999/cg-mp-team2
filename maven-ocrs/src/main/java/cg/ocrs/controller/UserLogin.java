package cg.ocrs.controller;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//static Logger logger=LogManager.getLogger(UserLogin.class);


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String userType=request.getParameter("userType");
		if(userName.equals("admin") && password.equals("12345")) {
		HttpSession ssn=request.getSession();
		ssn.setAttribute("loggedIn", userName);
		ssn.setAttribute("userType", userType);
		//logger.info("User Set to "+userType);
		response.sendRedirect("AfterValidLogin.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}	
	}

}
