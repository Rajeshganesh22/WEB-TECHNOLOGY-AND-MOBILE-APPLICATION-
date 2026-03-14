package com.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,HttpServletResponse response)
throws IOException{

response.setContentType("text/html");

PrintWriter out=response.getWriter();

String name=request.getParameter("username");

out.println("<h1>Welcome "+name+"</h1>");

}
}