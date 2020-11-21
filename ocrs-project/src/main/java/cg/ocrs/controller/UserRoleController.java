package cg.ocrs.controller;

import java.io.IOException;

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
	
	//IUser service;
	
	@Override
	public void init(){
		IUser service=new UserServiceImpl();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		if(userName.equals(userName) && password.equals(password)) {
		HttpSession session=request.getSession();
		session.setAttribute("login", userName);
		response.sendRedirect("validlogin.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}
	
	
}
