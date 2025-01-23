import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletException;

import java.io.PrintWriter;
import java.io.IOException;
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        out.print("I am in doGet method.");
    }
}
