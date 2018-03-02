package com.shq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shq.entity.Admin;
import com.shq.entity.Message;
import com.shq.entity.MessageDAO;

public class AddMessageServlet extends HttpServlet {

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
		
		String _messageTitle = request.getParameter("messageTitle");
		String _messageContent = request.getParameter("messageContent");
		String messageTitle = new String(_messageTitle.getBytes("iso-8859-1"), "gbk");
		String messageContent = new String(_messageContent.getBytes("iso-8859-1"), "gbk");
		
		Admin admin = (Admin) request.getSession().getAttribute("user");
		int adminId = admin.getAdminId();
		
		MessageDAO messageDAO = new MessageDAO();
		Message message = new Message();
		message.setAdminId(adminId);
		message.setMessageContent(messageContent);
		message.setMessageTitle(messageTitle);
		messageDAO.save(message);
		request.getRequestDispatcher("getAllMessageServlet").forward(request, response);
		
		out.flush();
		out.close();
	}

}
