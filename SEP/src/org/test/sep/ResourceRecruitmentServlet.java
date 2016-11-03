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

public class ResourceRecruitmentServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,
            HttpServletResponse resp) throws ServletException, IOException {
    String jobtype= req.getParameter("jobtype").trim();
    System.out.println("f11111111111");
    System.out.println("form data "+jobtype);
    String department=req.getParameter("department").trim();
    System.out.println("form data "+department);
    String exp=req.getParameter("exp").trim();
    String title=req.getParameter("title").trim();
  
  
  resp.getWriter().println("Department:"+department);
  resp.getWriter().println("Years of experience:"+exp);
  resp.getWriter().println("JobTitle:"+title);
  
  
  PrintWriter out =resp.getWriter();
  out.print("text/html");
 
  out.print("<html><head><style>.center {margin: auto;width: 60%;border:3px solid #8AC007; padding: 10px;}body {background-color: #d8da3d; color=purple;}<body>");
  out.print("<h4>This page is EventRequest</h4><br>");
  
  out.print("<a href='/success.html'>Approve</a>" );
  out.print("<a href='/failure.jsp'>Reject</a>" );
  out.print("</body></html>"); 
}
  
}



