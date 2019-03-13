package com.niit.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
                   
                     Cookie Cookies[]=request.getCookies();
                     String str=null;
                     for(Cookie c:Cookies) {
                    	 if(c.getName().equals("v1")) {
                    		 str=c.getValue();
                    	 }
                     }
                     PrintWriter out=response.getWriter();
                     out.print("welcome \t"+str);
		
	  
	
	}

	

}
