package pl.coderslab.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet11", urlPatterns = "/servlet11")
public class Servlet11 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String par1 = request.getParameter("start");
    String par2 = request.getParameter("end");
    StringBuilder builder = new StringBuilder();
        for (int i = Integer.parseInt(par1); i < Integer.parseInt(par2) ; i++) {
            builder.append(i + ", ");
        }
        response.getWriter().append(builder);


    }
}