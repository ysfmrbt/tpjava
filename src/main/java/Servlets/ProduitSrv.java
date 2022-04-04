package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProduitSrv", value = "/ProduitSrv")
public class ProduitSrv extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JavaBeans.Produit produitOrdinateur = new JavaBeans.Produit();
        produitOrdinateur.setLabel("PC HP i7");
        produitOrdinateur.setPrix(1200.0f);
        produitOrdinateur.setDisponibilite(true);
        request.setAttribute("produit", produitOrdinateur);
        this.getServletContext().getRequestDispatcher( "/WEB-INF/ProduitSrv.jsp" ).forward( request, response );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
