package pl.coderslab.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet141",urlPatterns = "/servlet141")
public class Servlet141 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().append(
                    "<h1 style='text-align:center;text-decoration: underline'>Wybierz produkt</h1>" + "\n" +
                            "<div align = 'center' style='border: 1px solid black'>"  +
                       "<a href='http://localhost:8080/servlet142?id=0'>Produkt1</a>" + "<br>"+
                       "<a href='http://localhost:8080/servlet142?id=1'>Produkt2</a>" +"<br>"+
                       "<a href='http://localhost:8080/servlet142?id=2'>Produkt3</a>" +"<br>"+
                       "<a href='http://localhost:8080/servlet142?id=3'>Produkt4</a>" +"<br>"+
                       "<a href='http://localhost:8080/servlet142?id=4'>Produkt5</a>" +"<br>"+
                       "<a href='http://localhost:8080/servlet142?id=5'>Produkt6</a>" +"<br>"+
                       "<a href='http://localhost:8080/servlet142?id=6'>Produkt7</a>" + "<br>" +
                            "</div>"





            );
    }
}
