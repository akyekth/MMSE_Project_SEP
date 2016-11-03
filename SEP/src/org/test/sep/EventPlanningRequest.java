package org.test.sep;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventPlanningRequest extends HttpServlet {
	
	   
    public void doPost(HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }
    public void doGet(HttpServletRequest req,
                HttpServletResponse resp) throws ServletException, IOException {
        String cunum= req.getParameter("cunum").trim();
        System.out.println("form data "+cunum);
        String cname=req.getParameter("cname").trim();
        System.out.println("form data "+cname);
        String etype=req.getParameter("etype").trim();
        String attendies=req.getParameter("attendies").trim();
        String ndays=req.getParameter("days").trim();
      String fdate=req.getParameter("fdate").trim();
      String tdate=req.getParameter("tdate").trim();
      String ebudjet=req.getParameter("budjet").trim();
      String[] cnum=req.getParameterValues("cnum");
      PrintWriter pw= resp.getWriter();
      resp.setContentType("text/html");
      pw.println("<html>");
		pw.println("<head>");
		pw.println("<style>");
		pw.println("body {background-color: #d8da3d;color:purple;}");
		 pw.println("</style></head>");
		 pw.println("<body align='center'>");
      pw.println("<h1 >This page is EventRequest</h1>");
     pw.println("Customernumber:"+cunum);
     pw.println("<br>");
      pw.println("Customername:"+cname);
      pw.println("<br>");
      pw.println("EventType:"+etype);
      pw.println("<br>");
      pw.println("attendies:"+attendies);
      pw.println("<br>");
      pw.println("Customer From date:"+fdate);
      pw.println("<br>");
      pw.println("Customerdate:"+tdate);
      pw.println("<br>");
      pw.println("Expected budget:"+ebudjet);
      pw.println("<br>");
      pw.println("<ul>");
      for(String S:cnum )
      {
    	  pw.println("<li>preferences:"+cnum+"</li>");
    	      	 
      }
      pw.println("</ul>");
     pw.println("<a href='/success.html'>Approve</a>" );
     pw.println("<a href='/failure.jsp'>Reject</a>" );
     pw.println("</body></html>"); 
    }
      
}
        
    
