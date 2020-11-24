package cg.ocrs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cg.ocrs.dao.IUserRepo;
import cg.ocrs.dao.UserRepoImpl;
import cg.ocrs.model.UserRole;
import cg.ocrs.service.IUserService;
import cg.ocrs.service.UserServiceImpl;

@WebServlet("/login-page")
public class UserRoleController extends HttpServlet {
	static Logger logger=Logger.getLogger(UserRoleController.class.getName());
	private static final long serialVersionUID = 1L;
	
	IUserService service;
	
	@Override
	public void init(){
		service=new UserServiceImpl();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String roleCode=request.getParameter("roleCode");
		
		boolean isValid = false;
		try {
			isValid = service.isValidUser(userName, password, roleCode);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		HttpSession session=request.getSession();
		if(isValid) {
			session.setAttribute("roleCode", roleCode);
			response.sendRedirect("validlogin.jsp");

		}
		else {
			response.sendRedirect("login.jsp");
		}
		
	}
	
}