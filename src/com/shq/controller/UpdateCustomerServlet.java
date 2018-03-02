package com.shq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shq.entity.Customer;
import com.shq.entity.CustomerDAO;


public class UpdateCustomerServlet extends HttpServlet {

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
		
		String _customerName=request.getParameter("customerName");
		String _customerPass=request.getParameter("customerPass");
		String _customerIdentity=request.getParameter("customerIdentity");
		String _customerSex=request.getParameter("customerSex");
		String _customerAge=request.getParameter("customerAge");
		String _customerIdcard=request.getParameter("customerIdcard");
		String _customerEmail=request.getParameter("customerEmail");
		String _customerTelephone=request.getParameter("customerTelephone");
		String _customerAddress=request.getParameter("customerAddress");
		
		String customerName = new String(_customerName.getBytes("iso-8859-1"), "gbk");
		String customerPass = new String(_customerPass.getBytes("iso-8859-1"), "gbk");
		String customerIdentity = new String(_customerIdentity.getBytes("iso-8859-1"), "gbk");
		String customerSex = new String(_customerSex.getBytes("iso-8859-1"), "gbk");
		int customerAge = Integer.parseInt(_customerAge);
		String customerIdcard = new String(_customerIdcard.getBytes("iso-8859-1"), "gbk");
		String customerEmail = new String(_customerEmail.getBytes("iso-8859-1"), "gbk");
		String customerTelephone = new String(_customerTelephone.getBytes("iso-8859-1"), "gbk");
		String customerAddress = new String(_customerAddress.getBytes("iso-8859-1"), "gbk");
			
		Customer customer = (Customer) request.getSession().getAttribute("user"); 
		int customerId = customer.getCustomerId();
		customer.setCustomerName(customerName);
		customer.setCustomerPass(customerPass);
		customer.setCustomerIdentity(customerIdentity);
		customer.setCustomerSex(customerSex);
		customer.setCustomerAge(customerAge);
		customer.setCustomerIdcard(customerIdcard);
		customer.setCustomerEmail(customerEmail);
		customer.setCustomerTelephone(customerTelephone);
		customer.setCustomerAddress(customerAddress);
		CustomerDAO customerDAO = new CustomerDAO();
		
		customerDAO.attachDirty(customer);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
