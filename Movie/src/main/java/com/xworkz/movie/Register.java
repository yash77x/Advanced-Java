package com.xworkz.movie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register")
public class Register extends HttpServlet {

	public Register() {
		System.out.println("Registration");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("first");
		String lname = req.getParameter("last");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String conpassword = req.getParameter("conpassword");
		String mob = req.getParameter("mob");
		
		System.out.println("first name: "+fname);
		System.out.println("last name: "+lname);
		System.out.println("email: "+email);
		System.out.println("password: "+password);
		System.out.println("ConfirmPassword: "+conpassword);
		System.out.println("Mobile no.: "+mob);
		System.out.println();
		
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "	<meta charset=\"ISO-8859-1\">\r\n"
				+ "	<title>Movie Mania</title>\r\n"
				+ "	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "	<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\r\n"
				+ "		<div class=\"container-fluid\">\r\n"
				+ "			<a class=\"navbar-brand\" href=\"#\">Movie Mania</a>\r\n"
				+ "			<ul class=\" navbar-nav nav justify-content-end\">\r\n"
				+ "				<li class=\"nav-item\">\r\n"
				+ "					<a class=\"nav-link\" href=\"index.html\">Home</a>\r\n"
				+ "				</li>\r\n"
				+ "				<li class=\"nav-item\">\r\n"
				+ "					<a class=\"nav-link\" href=\"movies.html\">Movies</a>\r\n"
				+ "				</li>\r\n"
				+ "			</ul>\r\n"
				+ "		</div>\r\n"
				+ "	</nav>"
				+ "	<div class=\"container\">\r\n"
				+ "		<h1>Registration Sucessfull</h1>\r\n"
				+ "		<br>"
				+ "		<h3>Name: "+fname + " "+lname
				+ "		<h3>email : "+email
				+ "		<h3>Password : "+password
				+ "		<h3>Mobile no. : "+mob
				+ "</div>"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");
	}
}
