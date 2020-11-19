package cg.ocrs.controller;

import java.sql.SQLException;
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

@WebServlet("/userlogin")
public class UserRoleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 IUser service = new UserServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserRoleController user = new UserRoleController();
		user.addUser(request, response);
	}
	

	public  void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String rolecode=request.getParameter("rolecode");
		
		UserRole login = new UserRole(username, password, rolecode);
		
		
		
		try {
			service.addUser(login);
		} catch (SQLException e) {
			response.sendError(400);
		}
		HttpSession ssn=request.getSession();
		ssn.setAttribute("Login", login);
		response.sendRedirect("viewall.jsp");		
	}

}