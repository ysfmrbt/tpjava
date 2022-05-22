package Servlets;


import DaoPattern.CompteClientsDao;
import DaoPattern.DaoFactory;
import JavaBeans.CompteClient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

import static java.util.Objects.isNull;

@WebServlet(name = "Supprimer", value = "/Supprimer")
public class Supprimer extends HttpServlet {
    DaoFactory daoFactory = DaoFactory.getInstance();
    CompteClientsDao compteClientsDao = daoFactory.getCompteClientsDao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("User") != null) {
            try {
                int idClient = Integer.parseInt(request.getParameter("idClient"));
                compteClientsDao.supprimer(idClient);
                request.setAttribute("m", "Si le client avec l'id " + idClient + " existe dans la base de données, il devrait avoir été supprimé avec succès.");
                request.getServletContext().getRequestDispatcher( "/WEB-INF/Success.jsp" ).forward( request, response );
            } catch(Exception e) {
                request.setAttribute("e", e);
                request.getServletContext().getRequestDispatcher( "/WEB-INF/Echoue.jsp" ).forward( request, response );
            }
        } else {
            request.getRequestDispatcher( "/WEB-INF/Login.jsp" ).forward( request, response );
        }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/Supprimer.jsp").forward(request,response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    } // <editor-fold>
}
