package com.aoua;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Monservlet2")
public class Monservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Monservlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//this.getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
		
		//this.getServletContext().getRequestDispatcher("Login.jsp").forward(request, response);
	}

}
