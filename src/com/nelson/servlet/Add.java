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
 */

/**
 * This is perhaps not the best way, it only has a doGet being used
 * which means it will be exposed in the address bar and wont work for any doPost
 * requests. In doGet(), the parameters are appended to the URL and sent along with
 * header information. This does not happen in case of doPost().
 */

@WebServlet(urlPatterns = {"/Add"})
public class Add extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));

        int k = i + j;

        PrintWriter out = response.getWriter();
        out.println(k);
    }
}