package com.user.web;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import connection.ConnectionProvider;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterS
 */
@WebServlet("/RegisterS")
public class RegisterS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String name=request.getParameter("Name");
		String email=request.getParameter("user_email");
		String password=request.getParameter("user_password");
		
		try {
			
			
			ConnectionProvider con=new ConnectionProvider();
			//Statement stmt=con.getConnection().createStatement();
			String q="insert into register(Name,UserName,Password) values(?,?,?);";
			PreparedStatement stmt=con.getConnection().prepareStatement(q);
			stmt.setString(1,name);
			stmt.setString(2,email);
			stmt.setString(3,password);
			
			
			stmt.executeUpdate();
			
	}
		catch (Exception e) {
			e.printStackTrace();
			out.println("Error");
		}
		HttpSession s = request.getSession();
        s.removeAttribute("currentUser");
        response.sendRedirect("list");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
