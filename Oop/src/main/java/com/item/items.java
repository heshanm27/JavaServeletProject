package com.item;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class items
 */


public class items extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String itemName = request.getParameter("itemName");
		
		
		List<Item> iteDetails=itemDbUtil.validate(itemName);
		
		request.setAttribute("itemNames", iteDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("search.jsp");

		dis.forward(request, response);
	}

}
