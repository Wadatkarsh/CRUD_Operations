package connection;

import java.sql.Connection;
import java.sql.*;
public class ConnectionProvider {
	public static Connection getConnection() {
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jstl","root","root");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	

}

