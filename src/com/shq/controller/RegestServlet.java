package com.shq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shq.entity.Admin;
import com.shq.entity.AdminDAO;
import com.shq.entity.Customer;
import com.shq.entity.CustomerDAO;

public class RegestServlet extends HttpServlet {

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
		String _userIdentity = request.getParameter("userIdentity");
		String _userSex = request.getParameter("userSex");
		String _userAge = request.getParameter("userAge");
		String _userIdcard = request.getParameter("userIdcard");
		String _userEmail = request.getParameter("userEmail");
		String _userTelephone = request.getParameter("userTelephone");
		String _userAddress = request.getParameter("userAddess");
		
		String userName = new String(_userName.getBytes("iso-8859-1"), "gbk");
		String userPass = new String(_userPass.getBytes("iso-8859-1"), "gbk");
		String userIdentity = new String(_userIdentity.getBytes("iso-8859-1"), "gbk");
		String userSex = new String(_userSex.getBytes("iso-8859-1"), "gbk");
		int userAge = Integer.parseInt(_userAge);
		String userIdcard = new String(_userIdcard.getBytes("iso-8859-1"), "gbk");
		String userEmail = new String(_userEmail.getBytes("iso-8859-1"), "gbk");
		String userTelephone = new String(_userTelephone.getBytes("iso-8859-1"), "gbk");
		String userAddress = new String(_userAddress.getBytes("iso-8859-1"), "gbk");

		if(userIdentity.equals("管理员")){
			Admin admin = new Admin();
			admin.setAdminName(userName);
			admin.setAdminPass(userPass);
			admin.setAdminIdentity(userIdentity);
			admin.setAdminSex(userSex);
			admin.setAdminAge(userAge);
			admin.setAdminIdcard(userIdcard);
			admin.setAdminEmail(userEmail);
			admin.setAdminTelephone(userTelephone);
			admin.setAdminAddress(userAddress);
			
			AdminDAO adminDAO = new AdminDAO();
			adminDAO.save(admin);
		}
		else if(userIdentity.equals("顾客")){
			Customer customer = new Customer();
			customer.setCustomerName(userName);
			customer.setCustomerPass(userPass);
			customer.setCustomerIdentity(userIdentity);
			customer.setCustomerSex(userSex);
			customer.setCustomerAge(userAge);
			customer.setCustomerIdcard(userIdcard);
			customer.setCustomerEmail(userEmail);
			customer.setCustomerTelephone(userTelephone);
			customer.setCustomerAddress(userAddress);
			
			CustomerDAO customerDAO = new CustomerDAO();
			customerDAO.save(customer);
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
