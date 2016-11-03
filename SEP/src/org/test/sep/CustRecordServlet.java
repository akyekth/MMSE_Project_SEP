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

 
public class CustRecordServlet extends HttpServlet {
	
		
	
	
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
            String name= req.getParameter("cname").trim();
            System.out.println("form data "+name);
            String address=req.getParameter("address").trim();
            System.out.println("form data "+address);
            String phnum= req.getParameter("number");
            int pnum=Integer.parseInt(phnum);
            System.out.println("form data "+name);
            String date= req.getParameter("date").trim();
            System.out.println("form data "+name);
            String event= req.getParameter("event").trim();
            System.out.println("form data "+name);
            String budget= req.getParameter("number1");
            int bud=Integer.parseInt(budget);
            //System.out.println("form data "+name);
            String description = req.getParameter("email").trim();
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
            String query1 = "insert into customer values('"+ name +"',"+ pnum +",'"+ address +"','"+ event +"',"+ bud +",'"+ description +"')";
            PreparedStatement ps = con.prepareStatement(query1);
            ps.executeUpdate();
            // rs = st.executeQuery("select * from customer");
            req.getRequestDispatcher("/sucess.html").forward(req, resp);
            con.commit();
            
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
     }
        public void doPost(HttpServletRequest req,
                HttpServletResponse resp) throws ServletException, IOException {
           doGet(req,resp);
        }
}
