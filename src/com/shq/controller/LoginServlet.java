package com.shq.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shq.entity.Admin;
import com.shq.entity.AdminDAO;
import com.shq.entity.Customer;
import com.shq.entity.CustomerDAO;


public class LoginServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		String _userName = request.getParameter("userName");
		String _userPass = request.getParameter("userPass");
		String userName = new String(_userName.getBytes("iso-8859-1"), "gbk");
		String userPass = new String(_userPass.getBytes("iso-8859-1"), "gbk");
		
		String _userIdentity = request.getParameter("userIdentity");
		String userIdentity = new String(_userIdentity.getBytes("iso-8859-1"), "gbk");
		
		request.getSession().setAttribute("userIdentity", userIdentity);
	
		if(userIdentity.equals("管理员")){
			AdminDAO adminDAO = new AdminDAO();
			Admin admin = new Admin();
			admin = adminDAO.loginAdmin(userName, userPass);
			if(admin!=null){
				request.getSession().setAttribute("user", admin);
				request.getRequestDispatcher("admin.jsp").forward(request, response);
			}
			else
				request.getRequestDispatcher("fail.jsp").forward(request, response);
		}
		else if(userIdentity.equals("顾客")){
			CustomerDAO customerDAO = new CustomerDAO();
			Customer customer = new Customer();
			customer = customerDAO.loginCustomer(userName, userPass);
			if(customer!=null){
				request.getSession().setAttribute("user", customer);
				request.getRequestDispatcher("customer.jsp").forward(request, response);
			}
			else
				request.getRequestDispatcher("fail.jsp").forward(request, response);
		}
		
		out.flush();
		out.close();
	}

}
