package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "secondServlet", value = "/second-servlet")
public class SecondServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Second Servlet!!");
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Test</title></head>");
        out.println("<body><h1>have a nice days!</h1></body>");
        out.print("</html>");
        out.close();
    }
}
