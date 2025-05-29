package com.ssangu.beerApp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssangu.beerApp.model.BeerExpert;

public class BeerSelect extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String c = request.getParameter("color");
		BeerExpert beerExpert = new BeerExpert();
		List<String> result = beerExpert.getBrands(c);
		
		/*
		 * response.setContentType("text/html"); PrintWriter out = response.getWriter();
		 * out.println("Beer Selection Advice<br>");
		 * 
		 * Iterator<String> itr = result.iterator(); while(itr.hasNext()) {
		 * out.print("<br>try: "+itr.next()); }
		 */
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("jsp/result.jsp");
		view.forward(request, response);
	}
}
