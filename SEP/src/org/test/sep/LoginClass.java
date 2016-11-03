package org.test.sep;
import java.io.*;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Driver;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class LoginClass extends HttpServlet {
	
		
	
	
		/*resp.getWriter().println("Your name is "+name);
		resp.getWriter().println("password is:"+pwd);*/
		
	   String name1="";
	   String pwd1="";
       Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
       // ResultSet rs1=null;
       
        public void doPost(HttpServletRequest req,
                HttpServletResponse resp) throws ServletException, IOException {
            // TODO Auto-generated method stub
        }
        public void doGet(HttpServletRequest req,
                    HttpServletResponse resp) throws ServletException, IOException {
            String name= req.getParameter("usr").trim();
            System.out.println("form data "+name);
            String pwd=req.getParameter("pwd").trim();
            System.out.println("form data "+pwd);
            
           
            
        try 
           {
           
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                   con = DriverManager.getConnection("jdbc:oracle:thin:testuser/testpass@localhost");
            
                  if (con.equals(null)) {
                               System.out.println("connection was failed");
                                        }
            
                   else 
                    {
               
                           System.out.println("connected successfully");
                                 
                                 //String query = "select * from login where username= '" + name + "'";
                            stmt = con.createStatement();
                            //rs = stmt.executeQuery("insert into student values('china',20)");
                            //rs = stmt.executeQuery("select * from login where username= '" + name + "'");

                            	PreparedStatement st = con.prepareStatement("select * from login where username='"+ name +"'");
                            	rs = st.executeQuery();
            
                            		if(!rs.equals(null))
                            		{
            	
                            			while(rs.next())
                            			{
            	
                            				name1 = rs.getString("username").trim();
           
                            					System.out.println("name is"+name1);
                            					pwd1 =  rs.getString("password");
                            					System.out.println("name is"+pwd1);
                            			}
            
            
                            			if(name.equals(name1)&& pwd.equals(pwd1))
                            			{
                            				req.getRequestDispatcher("/main.html").forward(req, resp);
                            			}
                            			else
                            			{
                            					req.getRequestDispatcher("/failure.jsp").forward(req, resp);
                            			}
            
                            		}
                            		else{
                            			req.getRequestDispatcher("/failure.jsp").forward(req, resp);
                            			}
                    }
               
               
            
            }
        
          
        catch (Exception exception) {
            exception.printStackTrace();
        	}
        
        
        finally {
            try {
                rs.close();
                stmt.close();
                con.close();
                }
            catch (SQLException e) {
                e.printStackTrace();
            	} 
        
            }
 }}

