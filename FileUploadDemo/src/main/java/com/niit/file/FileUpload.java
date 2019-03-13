package com.niit.file;

import java.io.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;

import com.oreilly.servlet.MultipartRequest;  
 
  
public class FileUpload extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
{  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
MultipartRequest m=new MultipartRequest(request,"F:\\Works\\J2EE\\Servlets\\FileUploadDemo");  
out.print("successfully uploaded");  
}  
}  