package Servlets;

import JavaBeans.Produit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlets.Fournisseurs", value = "/Servlets.Fournisseurs")
public class Fournisseurs extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Produit prd = new Produit();
        prd.setLabel("Imprimante");
        prd.setDisponibilite(true);
        prd.setPrix((float) 700);
        request.setAttribute("produit", prd);
        this.getServletContext().getRequestDispatcher( "/WEB-INF/Fournisseurs.jsp" ).forward( request, response );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
