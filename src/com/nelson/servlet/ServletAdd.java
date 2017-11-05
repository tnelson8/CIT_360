package com.nelson.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Tyler.
 * 
 */
@WebServlet(urlPatterns = {"/ServletAdd"})
//Using both doPost and doGet with a Third class to avoid duplication
public class ServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    // Simple adding class that interacts with the web page, doGet or doPost is called
    // based on if security is needed.
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t1"));

        int k = i + j;

        PrintWriter out = response.getWriter();
        out.println(k);
    }
}