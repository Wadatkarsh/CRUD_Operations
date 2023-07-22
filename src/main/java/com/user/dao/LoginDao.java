package com.user.dao;
import connection.ConnectionProvider;
import java.sql.*;

public class LoginDao {
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
		 ConnectionProvider con=new ConnectionProvider();
		
			
			
			PreparedStatement ps=con.getConnection().prepareStatement(" select name,username from register;");  
					ps.setString(1,name);  
					ps.setString(2,pass);  
					      
					ResultSet rs=ps.executeQuery();  
					status=rs.next();  
					System.out.println("OK");
					          
					}
		catch(Exception e){
						e.printStackTrace();
						}  
					return status;  
					
	} 
}