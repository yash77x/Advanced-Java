package com.xworkz.grocery.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repository.GroceryRepoImpl;
import com.xworkz.grocery.repository.GroceryRepository;
import com.xworkz.grocery.service.GroceryService;
import com.xworkz.grocery.service.GroceryServiceImpl;

@WebServlet(urlPatterns = {"/grocery", "/total", "/view"}, loadOnStartup=1)
public class GroceryController extends HttpServlet{
	private GroceryRepository repository = new GroceryRepoImpl();
	private GroceryService service = new GroceryServiceImpl(repository);

	public GroceryController() {
		System.out.println("GroceryServlet Started");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String price = req.getParameter("price");
		String quantity = req.getParameter("quantity");
		
	    int pricee = Integer.parseInt(price);
	    int quantityy = Integer.parseInt(quantity);
	    int total = 0;
	    
	    if (pricee>0) {
	    	total = pricee*quantityy;
		}
		
		System.out.println("Product Name: "+name);
		System.out.println("Type: "+type);
		System.out.println("Price: "+pricee);
		System.out.println("Quantity: "+quantityy);
		System.out.println("Total Amount: "+total);
		
		GroceryDTO dto = new GroceryDTO(name,type,pricee,quantityy);
		boolean saved = service.validateAndSave(dto);
		System.out.println("Saved: "+saved);
		req.setAttribute("total", this.service.total());
		
		req.setAttribute("groceryName", name);
		req.setAttribute("groceryType", type);
		req.setAttribute("price", price);
		req.setAttribute("quantity", quantity);
		req.setAttribute("total", total);

		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/grocerysuccess.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in groceryController");
		String uri = req.getRequestURI();
		System.out.println("URI is "+uri);
		if(uri.endsWith("/total")) {
			req.setAttribute("total", this.service.total());
			req.getRequestDispatcher("grocery.jsp").forward(req, resp);
		}
		else if(uri.endsWith("/view")) {
			req.setAttribute("group", this.service.getAll());
			req.getRequestDispatcher("groceryView.jsp").forward(req, resp);
		}
	}
}
