package com.internousdev.yamazaki.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector{

	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/yamazaki";
	private static String user = "root";
	private static String pass = "mysql";
	public static Connection getConnection(){

		Connection con = null;
		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,pass);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch (SQLException e){
			e.printStackTrace();
		}

	return con;
	}
}