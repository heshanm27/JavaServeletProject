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
		

		
		try {
		List<Item> itemDetails=itemDbUtil.validate(itemName);
		
		for (Item item : itemDetails) {
			System.out.println("FromdataBase");
			System.out.println("<h1>");
			
			System.out.print(item.ItemID);
			System.out.println("</h1>");
			
			System.out.print(item.ItemName);
			System.out.println(item.Price);
			
		}
	
		request.setAttribute("itemDetails", itemDetails);
		
	
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		RequestDispatcher dis = request.getRequestDispatcher("searchresult.jsp");

		dis.forward(request, response);
	
	}

}