package cg.ocrs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cg.ocrs.dao.IUserRepo;
import cg.ocrs.dao.UserRepoImpl;
import cg.ocrs.model.UserRole;
import cg.ocrs.service.IUser;
import cg.ocrs.service.UserServiceImpl;

@WebServlet("/login")
public class UserRoleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IUser service;
	
	@Override
	public void init(){
		service=new UserServiceImpl();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		boolean isValid = true;
		try {
			isValid = service.getUser(userName, password);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
			if(isValid == true) {
				UserRole user = new UserRole();
				try {
					user = service.getUserRole(userName, password);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			HttpSession session=request.getSession();
			session.setAttribute("login", user);
			response.sendRedirect("validlogin.jsp");
			}else {
				response.sendRedirect("login.jsp");
			}
			boolean roleCode=true;
			if(roleCode) {
				
				response.sendRedirect("login.jsp");
			}
	}
	
}
