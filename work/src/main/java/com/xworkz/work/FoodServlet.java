package com.xworkz.work;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/food")
public class FoodServlet extends HttpServlet{

	public FoodServlet() {
		System.out.println("ProductServlet Started");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String hotel = req.getParameter("hotel");
		String price = req.getParameter("price");
		String quantity = req.getParameter("quantity");
		
	    int pricee = Integer.parseInt(price);
	    int quantityy = Integer.parseInt(quantity);
	    int total = 0;
	    
	    if (pricee>0) {
	    	total = pricee*quantityy;
		}
		
		System.out.println("Food Name: "+name);
		System.out.println("Type: "+type);
		System.out.println("Hotel Name: "+hotel);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantityy);
		System.out.println("Total Amount: "+total);
		
		req.setAttribute("foodName", name);
		req.setAttribute("type", type);
		req.setAttribute("hotel", hotel);
		req.setAttribute("price", price);
		req.setAttribute("quantity", quantityy);
		req.setAttribute("total", total);

		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/foodsuccess.jsp");
		dispatcher.forward(req, resp);
	}
}
