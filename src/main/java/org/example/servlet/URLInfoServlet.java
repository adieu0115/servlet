package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>URL 정보 출력</title></head>");
        out.print("<body>");
        out.println("<h3>요청 방식과 프로토콜 정보</h3>");
        out.println("Request URI : " + request.getRequestURI() + "<br/>");
        out.println("Request URL : " + request.getRequestURL() + "<br/>");
        out.println("Context Path : " + request.getContextPath() + "<br/>");
        out.println("Request Protocol : " + request.getProtocol() + "<br/>");
        out.println("Servlet Path : " + request.getServletPath() + "<br/>");
        out.print("</body></html>");
        out.close();
    }
}
