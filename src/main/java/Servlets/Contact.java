package Servlets;

import JavaBeans.Produit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlets.Contact", value = "/Servlets.Contact")
public class Contact extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramCategory = request.getParameter("category");
        String message = "Cher " + paramCategory + ", votre message a été bien envoyé ";
        request.setAttribute("category", message);
//
//        String[] Names = {"Youssef","Sadak","Foulen", "Foulena"};
//        String msg = "les noms sont " + Names[0] + ", " + Names[1] + ", " + Names[2] + ", " + Names[3];
//        request.setAttribute("Name", msg);

        this.getServletContext().getRequestDispatcher( "/WEB-INF/Contact.jsp" ).forward( request, response );
//        String fullName = request.getParameter( "fullName" );
//        String msg = request.getParameter( "message" );
//        String message = "Cher " + fullName + ", votre message " + msg + " a été bien envoyé ";
//
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
