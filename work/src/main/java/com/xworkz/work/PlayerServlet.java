package com.xworkz.work;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player")
public class PlayerServlet extends HttpServlet{
	
	public PlayerServlet() {
		System.out.println("PlayerServlet Started");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String sport = req.getParameter("sport");
		String country = req.getParameter("country");
		String jersey = req.getParameter("jersey");
		String mother = req.getParameter("mother");
		String father = req.getParameter("father");
		String captain = req.getParameter("captain");
		String coach = req.getParameter("coach");
		String maritial = req.getParameter("maritial");
		String wife = req.getParameter("wife");
		String dob = req.getParameter("dob");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String alive = req.getParameter("alive");

		
		System.out.println("Player Name: "+name);
		System.out.println("Sport Name: "+sport);
		System.out.println("Country: "+country);
		System.out.println("Jersey: "+jersey);
		System.out.println("mother Name: "+mother);
		System.out.println("father Name: "+father);
		System.out.println("captain: "+captain);
		System.out.println("coach: "+coach);
		System.out.println("maritial: "+maritial);
		System.out.println("wife Name: "+wife);
		System.out.println("dob: "+dob);
		System.out.println("age: "+age);
		System.out.println("gender: "+gender);
		System.out.println("alive: "+alive);

		
		req.setAttribute("playername", name);
		req.setAttribute("sport", sport);
		req.setAttribute("country", country);
		req.setAttribute("jersey", jersey);
		req.setAttribute("mother", mother);
		req.setAttribute("father", father);
		req.setAttribute("captain", captain);
		req.setAttribute("coach", coach);
		req.setAttribute("maritial", maritial);
		req.setAttribute("wife", wife);
		req.setAttribute("dob", dob);
		req.setAttribute("age", age);
		req.setAttribute("gender", gender);
		req.setAttribute("alive", alive);


		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/playersuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
