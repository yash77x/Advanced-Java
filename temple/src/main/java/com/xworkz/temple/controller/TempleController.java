package com.xworkz.temple.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepoImpl;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.service.TempleService;
import com.xworkz.temple.service.TempleServiceImpl;

@WebServlet(urlPatterns = {"/temple", "/total", "/view"}, loadOnStartup=1)
public class TempleController extends HttpServlet{
	
	private TempleRepository repository = new TempleRepoImpl();
	private TempleService service = new TempleServiceImpl(repository);
	
	public TempleController() {
		System.out.println("TempleController Started");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String place = req.getParameter("place");
		String god = req.getParameter("god");
		int year = Integer.parseInt(req.getParameter("year"));
		String const_by = req.getParameter("const_by");
		
		System.out.println("Temple Name: "+name);
		System.out.println("Place: "+place);
		System.out.println("Main God: "+god);
		System.out.println("Const_Year: "+year);
		System.out.println("Const_by: "+const_by);
		
		TempleDTO dto = new TempleDTO(name, place, god, year, const_by);
		boolean saved = service.validateAndSave(dto);
		System.out.println("Saved: "+saved);
		req.setAttribute("total", this.service.total());
		
		req.setAttribute("templeName", name);
		req.setAttribute("place", place);
		req.setAttribute("god", god);
		req.setAttribute("year", year);
		req.setAttribute("const_by", const_by);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/templesuccess.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doGet in TempleController");
		
		String uri = req.getRequestURI();
		System.out.println("URI is: "+uri);
		if(uri.endsWith("total")) {
			req.setAttribute("total", this.service.total());
			req.getRequestDispatcher("/temple.jsp").forward(req, resp);
		}
		else if(uri.endsWith("view")) {
			req.setAttribute("group", this.service.getAll());
			req.getRequestDispatcher("/templeView.jsp").forward(req, resp);
		}
	}
}
