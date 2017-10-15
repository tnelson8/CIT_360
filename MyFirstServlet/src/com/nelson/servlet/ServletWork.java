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
@WebServlet(urlPatterns = {"/Servletwrk"})
public class ServletWork extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }

    //simple doGet method to test if the servlet is working
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType("text/html"); //setting content type
        PrintWriter pw = response.getWriter(); //get the stream to write data

        //write html in the stream
        pw.println("<html><body>");
        pw.println("<h1>Servlets test</h1>");
        pw.println("</body></html>");

        pw.close(); //close thread
    }
}