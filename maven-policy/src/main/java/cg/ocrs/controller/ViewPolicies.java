package cg.ocrs.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cg.ocrs.dao.PolicyDaoImpl;
import cg.ocrs.dao.IPolicyDao;
import cg.ocrs.model.Policy;
import cg.ocrs.service.IPolicyService;
import cg.ocrs.service.PolicyServiceImpl;

@WebServlet({"/report","/view-all-policies"})
public class ViewPolicies extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	IPolicyDao service;

	@Override
	public void init(){
	service=new PolicyDaoImpl();
	}

		protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
			List<Policy> allPolicies = null;
		try {
			allPolicies = service.getAllPolicies();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession sn=request.getSession();
		sn.setAttribute("policy",allPolicies);
		response.sendRedirect("view-all-policies.jsp");
		
		}

		}
