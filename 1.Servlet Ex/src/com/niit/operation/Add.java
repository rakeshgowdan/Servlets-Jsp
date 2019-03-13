package com.niit.operation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class Add extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    public Add() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
int i=Integer.parseInt(request.getParameter("v1"));
int j=Integer.parseInt(request.getParameter("v2"));
int k=i+j;
PrintWriter out=response.getWriter();
out.println("sum is "+k);


}
}
