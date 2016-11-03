package org.test.sep;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;


public class SepClass1 extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse resp ) throws ServletException,IOException
	{
		String address ="/workspace/eclipse1/work/SEP/src/Servlet1JdbcOdbc.java";
		String name =req.getParameter("username");
		String name1="aruna";
		String pwd= req.getParameter("pwd");
		resp.getWriter().println("Your name is "+name);
		resp.getWriter().println("password is:"+pwd);
		req.setAttribute("name", name1);
		HttpSession session = req.getSession();
		session.setAttribute("name",name);
		RequestDispatcher rd = req.getRequestDispatcher(address);
		rd.forward(req,resp);
	}
}