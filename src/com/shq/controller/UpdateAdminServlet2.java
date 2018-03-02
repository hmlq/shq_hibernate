package com.shq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shq.entity.Admin;
import com.shq.entity.AdminDAO;

public class UpdateAdminServlet2 extends HttpServlet {

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
		
		String _adminName = request.getParameter("adminName");
		String _adminPass = request.getParameter("adminPass");
		String _adminIdentity = request.getParameter("adminIdentity");
		String _adminSex = request.getParameter("adminSex");
		String _adminAge = request.getParameter("adminAge");
		String _adminIdcard = request.getParameter("adminIdcard");
		String _adminEmail = request.getParameter("adminEmail");
		String _adminTelephone = request.getParameter("adminTelephone");
		String _adminAddress = request.getParameter("adminAddress");
		
		String adminName = new String(_adminName.getBytes("iso-8859-1"), "gbk");
		String adminPass = new String(_adminPass.getBytes("iso-8859-1"), "gbk");
		String adminIdentity = new String(_adminIdentity.getBytes("iso-8859-1"), "gbk");
		String adminSex = new String(_adminSex.getBytes("iso-8859-1"), "gbk");
		int adminAge = Integer.parseInt(_adminAge);
		String adminIdcard = new String(_adminIdcard.getBytes("iso-8859-1"), "gbk");
		String adminEmail = new String(_adminEmail.getBytes("iso-8859-1"), "gbk");
		String adminTelephone = new String(_adminTelephone.getBytes("iso-8859-1"), "gbk");
		String adminAddress = new String(_adminAddress.getBytes("iso-8859-1"), "gbk");
		
		Admin admin = (Admin) request.getSession().getAttribute("user");
		int adminId = admin.getAdminId();
		AdminDAO adminDAO = new AdminDAO();
	
		admin.setAdminName(adminName);
		admin.setAdminPass(adminPass);
		admin.setAdminIdentity(adminIdentity);
		admin.setAdminSex(adminSex);
		admin.setAdminAge(adminAge);
		admin.setAdminIdcard(adminIdcard);
		admin.setAdminEmail(adminEmail);
		admin.setAdminTelephone(adminTelephone);
		admin.setAdminAddress(adminAddress);
		
		adminDAO.attachDirty(admin);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		out.flush();
		out.close();
	}

}
