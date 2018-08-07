package pl.coderslab.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet142", urlPatterns = "/servlet142")
public class Servlet142 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        StringBuilder builder = new StringBuilder();

        String products[] = {
                "Asus Transformr;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };
        String produkt = "";
        try{produkt = products[Integer.parseInt(id)].replaceAll(";"," - ");}
        catch (ArrayIndexOutOfBoundsException e){
            response.getWriter().append("Produkt nie istnieje");
            return;

        }
        builder.append(produkt + "zl");
        response.getWriter().append(builder);


    }
}
