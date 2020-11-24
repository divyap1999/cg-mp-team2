package cg.ocrs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.istack.logging.Logger;

import cg.ocrs.dao.IUserRepo;
import cg.ocrs.dao.UserRepoImpl;
import cg.ocrs.model.UserRole;
import cg.ocrs.service.IUser;
import cg.ocrs.service.UserServiceImpl;

@WebServlet("/login")
public class UserRoleController extends HttpServlet {
	static Logger logger=Logger.getLogger(UserRoleController.class);
	private static final long serialVersionUID = 1L;
	
	IUser service;
	
	@Override
	public void init(){
		service=new UserServiceImpl();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String roleCode=request.getParameter("roleCode");
		
		boolean isValid = true;
		try {
			isValid = service.getUser(userName, password);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		//UserRole user = new UserRole();
		//String roleCode=user.getRoleCode();
		
		HttpSession session=request.getSession();
		if(isValid) {
			//session.setAttribute("login", userName);
			session.setAttribute("roleCode", roleCode);
			response.sendRedirect("validlogin.jsp");

		}
		
		
		
		
		
		
		
		
		
		
		
//			if(isValid == true) {
//				//UserRole user = new UserRole();
//				try {
//					user = service.getUserRole(userName, password);
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			
//				
//				
//				
//				logger.info("If Credentials are valid, directed to validlogin.jsp screen");
//				if(isValid) {
//					session.setAttribute("login", userName);
//					session.setAttribute("roleCode", roleCode);
//					response.sendRedirect("validlogin.jsp");
//				}	
//			
//			
//			}else {
//				logger.info("Page will be directed to login.jsp");
//				response.sendRedirect("login.jsp");
//			}
//			
			
		}
	
}
