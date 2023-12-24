package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.ClientPreparedStatement;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;
import com.mysql.cj.xdevapi.PreparableStatement;

public class Student {
	public void  creatDatabase() {
		 try {
     		String url = "jdbc:mysql://localhost";
     		String username = "root";
     		String password ="Kaif@123";
         // Process the ResultSet if needed

     		Connection conn = DriverManager.getConnection(url,username,password);
     		Statement stm = conn.createStatement();
     		
     		
     		String query = "create database hh";
     	    stm.execute(query);
     		System.out.println("Database creat succesfully");
             conn.close();
        
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
		
	 

	public void creatTable() {
		try {
	 		String url = "jdbc:mysql://localhost/hh";
	 		String username = "root";
	 		String password ="Kaif@123";
	     // Process the ResultSet if needed

	 		Connection conn = DriverManager.getConnection(url,username,password);
	 		 String query = "create table studnt(id int(3), name varchar(29),email varchar(37)) ";
             
	 		 
	 		 PreparedStatement stm =conn.prepareStatement(query);
	 		 
	 		 stm.execute();
	 		 System.out.println("Tables created succesfully");
	         conn.close();
	    
	 } catch (Exception e) {
	     e.printStackTrace();
	 
	   }
		
	}
	public void createData() {
		try {
	 		String url = "jdbc:mysql://localhost/";
	 		String db = "hh";
	 		String username = "root";
	 		String password ="Kaif@123";
	     // Process the ResultSet if needed

	 		Connection conn = DriverManager.getConnection(url+db,username,password);
	 		 String query = "insert into studnt (id, name, email) values(?,?,?)";
             
	 		 
	 		 PreparedStatement pstm =conn.prepareStatement(query);
	 		 pstm.setInt(1, 2);
	 		 pstm.setString(2, "jon");
	 		 pstm.setString(3, "jon@gamil.com");
	 		 
	 		 pstm.execute();
	 		 System.out.println("data  inserted succesfully");
	         conn.close();
	    
	 } catch (Exception e) {
	     e.printStackTrace();
	 
	   }
	
	}
	public void readdata() {
		try {
	 		String url = "jdbc:mysql://localhost/";
	 		String db = "hh";
	 		String username = "root";
	 		String password ="Kaif@123";
	     // Process the ResultSet if needed

	 		Connection conn = DriverManager.getConnection(url+db,username,password);
	 		 String query = "select *from studnt";
             
	 		 
	 		 Statement stm =conn.createStatement();
	 		 ResultSet re =stm.executeQuery(query);
	 		 while(re.next())
	 			System.out.println(re.getInt(1)+"  "+ re.getString(2)+"  "+re.getString(3));
	 		 System.out.println("read  data succesfully");
	         conn.close();
	    
	 } catch (Exception e) {
	     e.printStackTrace();
	 
	   }
		
	}			
	}	
	
