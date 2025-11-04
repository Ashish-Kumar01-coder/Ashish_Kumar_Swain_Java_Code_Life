package com.kodewala.practise.Add;

import java.sql.*;

public class JDBCConnection {
   public static void main(String[] args) throws ClassNotFoundException,SQLException {
	//Register the jdbc Driver....
	   Class.forName("com.mysql.cj.jdbc.Driver");
	//Establish the connection...
	   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon_zone","root","Ashish01#@123");
	//create the statement....
	   String sql = "select * from orders";
	   Statement statement = connection.createStatement();
	 //execute the query...
	   ResultSet rs = statement.executeQuery(sql);
	   while(rs.next()) {
		 String itemname =  rs.getString(1);
		 String description = rs.getString(2);
		 int price = rs.getInt(3);
		 String status = rs.getString(4);
		 System.out.println("Itemname : " + itemname + " Description : " + description + " Price : " + price + " Status : " + status);
		   
	   }
	   
	  
}
}
