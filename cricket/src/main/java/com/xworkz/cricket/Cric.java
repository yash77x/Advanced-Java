package com.xworkz.cricket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/com.dosa")
public class Cric extends HttpServlet{

	public Cric() {
		System.out.println("Invoking cric");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doGet in cricket");
		
		String ref = req.getParameter("name");
		String ref1 = req.getParameter("msg");
		System.out.println("Name "+ref);
		System.out.println("Message "+ref1);
		
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println();
	}
	
}
