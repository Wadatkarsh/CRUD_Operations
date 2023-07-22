package com.user.web;

import java.io.IOException;
import com.user.model.*;
import java.io.PrintWriter;

import connection.ConnectionProvider;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.model.*;
import com.user.dao.LoginDao;



/**
 * Servlet implementation class Login_Page
 */
@WebServlet("/Login_Page")
public class Login_Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Page() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		String emailId = request.getParameter("email");
        String password = request.getParameter("password");
        
        
        if (emailId != null && emailId.equalsIgnoreCase("shital@gmail.com") && password != null && password.equalsIgnoreCase("12345")) {
           
        	HttpSession httpSession = request.getSession();
        	httpSession.setAttribute("emailId", emailId);
            request.getRequestDispatcher("list").forward(request, response);
        }
        else {
        	
        	response.sendRedirect("Error.jsp");

        }
	}

}
