package com.xworkz.work;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/airport")
public class AirportServlet extends HttpServlet{
	
	public AirportServlet() {
		System.out.println("AirportServlet Started");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String country = req.getParameter("country");
		String city = req.getParameter("city");
		String capacity = req.getParameter("capacity");
		String width = req.getParameter("width");
		String terminal = req.getParameter("terminal");
		String runway = req.getParameter("runway");
		String operational = req.getParameter("operational");
		String inaug = req.getParameter("inaug");
		String date = req.getParameter("date");


		
		System.out.println("Airport Name: "+name);
		System.out.println("type Name: "+type);
		System.out.println("Country: "+country);
		System.out.println("city: "+city);
		System.out.println("capacity: "+capacity);
		System.out.println("width: "+width);
		System.out.println("terminal: "+terminal);
		System.out.println("runways: "+runway);
		System.out.println("operational: "+operational);
		System.out.println("inaugarated by: "+inaug);
		System.out.println("open date: "+date);


		
		req.setAttribute("airportname", name);
		req.setAttribute("type", type);
		req.setAttribute("country", country);
		req.setAttribute("city", city);
		req.setAttribute("capacity", capacity);
		req.setAttribute("width", width);
		req.setAttribute("terminal", terminal);
		req.setAttribute("runway", runway);
		req.setAttribute("operational", operational);
		req.setAttribute("inaug", inaug);
		req.setAttribute("date", date);



		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/airportsuccess.jsp");
		dispatcher.forward(req, resp);
	}


}
