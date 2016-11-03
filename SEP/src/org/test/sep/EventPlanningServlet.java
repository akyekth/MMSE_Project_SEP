package org.test.sep;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EventPlanningServlet
 */
@WebServlet("/EventPlanningServlet")
public class EventPlanningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

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
          PrintWriter out= resp.getWriter();
          resp.setContentType("text/html");
          out.print("<html><head><style>.center {margin: auto;width: 60%;border:3px solid #8AC007; padding: 10px;}body {background-color: #d8da3d; color=purple;}<body>");
          out.print("<h1 align=center>This page is EventRequest</h1>");
          out.print("Customernumber:"+cunum);
          out.print("Customername:"+cname);
          out.print("EventType:"+etype);
          out.print("Customernumber:"+attendies);
          out.print("Customernumber:"+fdate);
          out.print("Customernumber:"+tdate);
          out.print("Expected budget:"+ebudjet);
          out.print("<ul>");
          for(String S:cnum )
          {
        	  out.print("<li>preferences:"+cnum+"</li>");
        	      	 
          }
          out.print("</ul>");
         out.print("<a href='/success.html'>Approve</a>" );
         out.print("<a href='/failure.jsp'>Reject</a>" );
         out.print("</body></html>"); 
        }
          
}
