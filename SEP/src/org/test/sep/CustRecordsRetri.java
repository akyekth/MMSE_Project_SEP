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

 
public class CustRecordsRetri extends HttpServlet {
	
		
	
	
		/*resp.getWriter().println("Your name is "+name);
		resp.getWriter().println("password is:"+pwd);*/
		
	   String name1="";
	   String pwd1="";
       Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
       // ResultSet rs1=null;
        
       
        
        public void doGet(HttpServletRequest req,
                HttpServletResponse resp) throws ServletException, IOException {
           
                  resp.setContentType("text/html");  
            
                  PrintWriter pw=resp.getWriter();
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

            PreparedStatement ps = con.prepareStatement("select * from customer");
            rs = ps.executeQuery();
           
            ResultSetMetaData rsmd = rs.getMetaData();
        	int columnsNumber = rsmd.getColumnCount();
        	
        	
        	
            if(!rs.equals(null))
            {
            	
           /* while(rs.next())
            {
            	System.out.println("3333333");
            	
            	
            	
               String name1=rs.getString(1);
               int phnum = rs.getInt(2);
               String address=rs.getString(3);
               String event=rs.getString(4);
               int budjet=rs.getInt(4);
               String desc=rs.getString(5);
               resp.getWriter().println("name"+name1);
               resp.getWriter().print("phnum"+phnum);
               resp.getWriter().print("address"+address);
              resp.getWriter().print("event"+event);
              resp.getWriter().print("budjet"+budjet);
              resp.getWriter().print("desc"+desc);
              // resp.getWriter().println(rs);
                              
              
                     }*/
            	pw.println("<html>");
    			pw.println("<head>");
    			pw.println("<style>");
    			pw.println("body {background-color: #d8da3d;color:purple;}");
    
    			 pw.println("</style></head>");
    	        
            	pw.println("<body align='center'><h2>here customer records are present</h2>" );
            	while (rs.next()) {
            	    for (int i = 1; i <= columnsNumber; i++) 
            	    {
            	        
            	        if(i>1)
            	       resp.getWriter().print(",  ");
            	        String columnValue = rs.getString(i);
            	        resp.getWriter().print(columnValue);
            	        	
            	      
            	        	
            	    }
            	   pw.println("<br>");
            	}
            	
            	 pw.println("</body></html>");


               }
            }}
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    rs.close();
                    //rs1.close();
                    stmt.close();
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
               }
             
}
        
            
            

            
           
          
       


