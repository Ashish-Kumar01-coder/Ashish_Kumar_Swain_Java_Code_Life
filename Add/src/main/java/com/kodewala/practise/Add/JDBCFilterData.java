package com.kodewala.practise.Add;
import java.sql.*;
public class JDBCFilterData {
       public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
    	   //Register the jdbc Driver
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   //Establish the connection...
    	   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon_zone","root","Ashish01#@123");
    	   //create the statement......
    	   String sql ="select * from orders where status = ? ";
    	   PreparedStatement ps = connection.prepareStatement(sql);
    	   ps.setString(1, "Not Avaialble");
    	   //execute the query....
    	   ResultSet rs = ps.executeQuery();
    	   while(rs.next()){
    		 String itemname =  rs.getString(1); 
    		 String description   = rs.getString(2);
    		 int price = rs.getInt(3);
    		 String status = rs.getString(4);
    		 System.out.println("Itemname : " + itemname + " Descirption : " + description + " Price: " + price + " Sytatus : " + status);
    	   }
	}
}
