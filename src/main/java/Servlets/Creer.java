package Servlets;


import DaoPattern.CompteClientsDao;
import DaoPattern.DaoFactory;
import JavaBeans.CompteClient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
import java.util.Objects;

@WebServlet(name = "Creer", value = "/Creer")
public class Creer extends HttpServlet {
    DaoFactory daoFactory = DaoFactory.getInstance();
    CompteClientsDao compteClientsDao = daoFactory.getCompteClientsDao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

        }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            if (session.getAttribute("User") != null) {
                request.getRequestDispatcher( "/WEB-INF/Creer.jsp" ).forward( request, response );
            } else {
                request.getRequestDispatcher( "/WEB-INF/Login.jsp" ).forward( request, response );
            }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CompteClient compteClient = new CompteClient();
        try {
            compteClient.setNumero(Integer.parseInt(request.getParameter("numero")));
            compteClient.setDateCreation(Date.valueOf(request.getParameter("dateCreation")));
            compteClient.setChiffreAffaire(Double.parseDouble(request.getParameter("chiffreAffaire")));
            compteClientsDao.ajouter(compteClient);
            request.setAttribute("m", "Un nouveau client a été créé avec succès!");
            this.getServletContext().getRequestDispatcher("/WEB-INF/Success.jsp").forward(request,response);
        } catch (Exception e) {
            request.setAttribute("e", e);
            request.getServletContext().getRequestDispatcher( "/WEB-INF/Echoue.jsp" ).forward( request, response );
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    } // <editor-fold>
}
