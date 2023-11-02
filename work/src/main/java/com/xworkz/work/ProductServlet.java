package com.xworkz.work;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/product")
public class ProductServlet extends HttpServlet{

	public ProductServlet() {
		System.out.println("ProductServlet Started");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String type = req.getParameter("type");
		String quantity = req.getParameter("quantity");
		
		System.out.println("Product Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Type: "+type);
		System.out.println("Quantity: "+quantity);
		
		req.setAttribute("productName", name);
		req.setAttribute("price", price);
		req.setAttribute("productType", type);
		req.setAttribute("quantity", quantity);

		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/productsuccess.jsp");
		dispatcher.forward(req, resp);
	}
}
