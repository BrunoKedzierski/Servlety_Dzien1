package pl.coderslab.servlets;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "Servlet15", urlPatterns = "/servlet15")
public class Servlet15 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Random random = new Random();
            int[] tablica = new int [10];
            for (int i = 0; i <10 ; i++) {

                tablica[i] = (random.nextInt(101)+1);
            }
            int[] sort = tablica.clone();
            Arrays.sort(sort);

            response.getWriter().append(Arrays.toString(tablica)).append("\n").append(Arrays.toString(sort));

    }
}
