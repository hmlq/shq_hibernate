package com.shq.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shq.entity.Message;
import com.shq.entity.MessageDAO;

public class GetAllMessageServlet extends HttpServlet {

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
		
		MessageDAO messageDAO = new MessageDAO();
		List<Message> list = new ArrayList<Message>();
		list=messageDAO.findAll();
		request.getSession().setAttribute("listofmessage", list);
		
		String userIdentity = (String) request.getSession().getAttribute("userIdentity");
		if(userIdentity.equals("管理员")){
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else if(userIdentity.equals("顾客")){
			request.getRequestDispatcher("welcome2.jsp").forward(request, response);
		}

		out.flush();
		out.close();
	}

}
