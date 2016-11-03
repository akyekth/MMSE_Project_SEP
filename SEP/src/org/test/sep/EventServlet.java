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

public class EventServlet extends HttpServlet {
	
	   
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
     /* resp.getWriter().println("Customernumber:"+cunum+"<br>");
     
      
      
      resp.getWriter().println("Customername:"+cname+"<br>");
      resp.getWriter().println("EventType:"+etype+"<br>");
      resp.getWriter().println("Customernumber:"+attendies+"<br>");
      resp.getWriter().println("Customernumber:"+fdate+"<br>");
      resp.getWriter().println("Customernumber:"+tdate+"<br>");
      resp.getWriter().println("Expected budget:"+ebudjet+"<br>");
      
     // resp.getWriter().setContentType("text/html");
      resp.getWriter().println("<html><head><style>.center {margin: auto;width: 60%;border:3px solid #8AC007; padding: 10px;}body {background-color: #d8da3d; color=purple;}<body>");
      resp.getWriter().print("<h4>This page is EventRequest</h4><br>");
      resp.getWriter().println("<ul>");
      for(String S : cnum )
      {
    	  resp.getWriter().println("<li>preferences:"+cnum+"</li>");
    	      	 
      }
      resp.getWriter().println("</ul>");
      resp.getWriter().println("<a href='/success.html'>Approve</a>" );
      resp.getWriter().println("<a href='/failure.jsp'>Reject</a>" );
      resp.getWriter().println("</body></html>"); 
    }*/
      PrintWriter pw= resp.getWriter();
      resp.setContentType("text/html");
      pw.println("<html>");
		pw.println("<head>");
		pw.println("<style>");
		pw.println("body {background-color: #d8da3d;color:purple;}");
		 pw.println("</style><a href='/main.html'><h3 align=right>logout</h3></a></head>");
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
      pw.println("<a HREF=\'success.html'>Approve</a>" );
      pw.println("<br>");
      pw.println("<a href='/failure.jsp'>Reject</a>" );
      pw.println("<ul>");
      for(String S:cnum )
      {
    	  pw.println("<li>preferences:"+cnum+"</li>");
    	      	 
      }
      pw.println("</ul>");
      pw.println("<input type='submit' value='ok'>");
    
     pw.println("</body></html>"); 
    }
}
  