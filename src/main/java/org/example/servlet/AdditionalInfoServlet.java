package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addInfo")
public class AdditionalInfoServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>Request 정보 출력</title></head>");
        out.print("<body>");
        out.print("<h3>추가적인 요청 정보</h3>");
        out.print("Request Method : " + request.getMethod() + "<br/>");
        out.print("Path Info : " + request.getPathInfo() + "<br/>");
        out.print("Path Translated : " + request.getPathTranslated() + "<br/>");
        out.print("Query String : " + request.getQueryString() + "<br/>");
        out.print("Content Length : " + request.getContentLength() + "<br/>");
        out.print("Content type : " + request.getContentType() + "<br/>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
