package com.slider;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.item.Item;
import com.item.itemDbUtil;

/**
 * Servlet implementation class sliderServelt
 */
@WebServlet("/sliderServelt")
public class sliderServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		try {
		List<sliderClass> SliderDetails=sliderDbUtill.validate();
		
		for (sliderClass slide : SliderDetails) {
			System.out.println("FromdataBase");
			System.out.println("<h1>");
			
			System.out.print(slide.img);
			System.out.println("</h1>");
			
			System.out.print(slide.slideD);
			System.out.println(slide.text);
		
			
		}
	
		request.setAttribute("sliderDetails", SliderDetails);
		
	
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		RequestDispatcher dis = request.getRequestDispatcher("index.jsp");

		dis.forward(request, response);
	
	}
	
	
	

}
