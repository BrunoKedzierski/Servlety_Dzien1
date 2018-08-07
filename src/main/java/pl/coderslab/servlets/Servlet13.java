package pl.coderslab.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@WebServlet(name = "Servlet13", urlPatterns = "/servlet13")
public class Servlet13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Path path1 = Paths.get("/home/bruno/Desktop/WAR_JEE_S_09_Servlety/b_Zadania_Domowe/a_Dzien_2/oop.txt");
        try {
            for (String line : Files.readAllLines(path1)) {
                response.getWriter().append(line).append(", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
