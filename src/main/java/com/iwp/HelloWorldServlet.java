package com.iwp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("    <meta charset=\"UTF-8\">");
        response.getWriter().println("    <title>Hello World</title>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("    <h1>Hello World</h1>");
        response.getWriter().println("    <!-- Einbinden des kompilierten JavaScript -->");
        response.getWriter().println("    <script src=\"scripts/main.js\"></script>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
