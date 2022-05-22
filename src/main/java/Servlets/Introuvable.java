package Servlets;

import DaoPattern.CompteClientsDao;
import DaoPattern.DaoFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "Introuvable", value = "/Introuvable")
public class Introuvable extends HttpServlet {
    DaoFactory daoFactory = DaoFactory.getInstance();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        this.getServletContext().getRequestDispatcher( "/WEB-INF/Introuvable.jsp" ).forward( request, response );
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/Introuvable.jsp").forward(request,response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    } // <editor-fold>
}
