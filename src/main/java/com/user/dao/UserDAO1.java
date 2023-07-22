package com.user.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import connection.ConnectionProvider;
public class UserDAO1 {
	ConnectionProvider con=new ConnectionProvider();
     
    public List<Categary> list() throws SQLException {
        List<Categary> listCategory = new ArrayList<>();
         
        try  {
            String sql = "SELECT name FROM city ORDER BY id";
            Statement statement = con.getConnection().createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
                int id = result.getInt("category_id");
                String name = result.getString("name");
                Categary category = new Categary(id, name);
                     
                listCategory.add(category);
            }          
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }      
         
        return listCategory;
    }

}
