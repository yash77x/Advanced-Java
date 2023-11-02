package com.xworkz.work;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/vendor")
public class VendorServlet extends HttpServlet{
	
	public VendorServlet() {
		System.out.println("VendorServlet Started");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String gst = req.getParameter("gst");
		String owner = req.getParameter("owner");
		String location = req.getParameter("location");
		
		System.out.println("Vendor Name: "+name);
		System.out.println("GST No.: "+gst);
		System.out.println("Owner Name: "+owner);
		System.out.println("Location: "+location);
		
		req.setAttribute("vendorName", name);
		req.setAttribute("gst", gst);
		req.setAttribute("owner", owner);
		req.setAttribute("loc", location);

		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/vendorsuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
