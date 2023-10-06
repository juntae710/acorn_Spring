package com.acorn.day2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBTest2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:testdb";
	String user="scott";
	String password="tiger";
	
	
	
	DriverManagerDataSource ds = new DriverManagerDataSource();
	
	ds.setDriverClassName(driver);
	ds.setUrl(url);
	ds.setUsername(user);
	ds.setPassword(password);
	
	Connection con = ds.getConnection();
	System.out.println(con);
	if(con!=null)System.out.println("ok");
	
}
}