package com.enzenar.enzen.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetDatabaseConnection {

	public static Connection getConnectionInstace(){
		try{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12262162","sql12262162","rzqaBMtjjV");
		return con;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
