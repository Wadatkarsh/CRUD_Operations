package com.user.web;

import java.io.IOException;

import com.user.dao.Categary;
import com.user.dao.UserDAO1;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import connection.ConnectionProvider;


/**
 * Servlet implementation class City_list
 */
//@WebServlet("/City_list")
public class City_list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public City_list() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		out.println("<h1>Hello</h1>");
		UserDAO1 dao =new UserDAO1();
		try {
			 
          
 
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
	}


