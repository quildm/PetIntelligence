package com.codingdojo.contollers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Dog")
public class Dog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Dog() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		Double weight = Double.parseDouble(request.getParameter("weight"));
		
		String out = String.format("%s %s %f", name, breed, weight);
		
		request.setAttribute("name", name);
		request.setAttribute("breed", breed);
		request.setAttribute("weight", weight);
        request.getRequestDispatcher("/WEB-INF/showDog.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
