package com.item;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slider.sliderClass;
import com.slider.sliderDbUtill;

import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class items
 */


public class items extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	

		

		
		try {
		List<Item> itemDetails=itemDbUtil.validate();
		
		List<sliderClass> SliderDetails=sliderDbUtill.validate();
		
		for (sliderClass item : SliderDetails) {
			System.out.println("FromdataBase");
			System.out.println("<h1>");
			
			System.out.print(item.getImg()
					);
			System.out.println("</h1>");
			
			System.out.print(item.getText());
			System.out.println(item.getSlideD());
			
		}
	
		request.setAttribute("itemDetails", itemDetails);
		request.setAttribute("sliderDetails", SliderDetails);
		
	
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		RequestDispatcher dis = request.getRequestDispatcher("index.jsp");

		dis.forward(request, response);
	
	}

}
