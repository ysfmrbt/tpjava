package Servlets;


import DaoPattern.CompteClientsDao;
import DaoPattern.DaoFactory;
import JavaBeans.CompteClient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "Servlets.Modifier", value = "/Servlets.Modifier")
public class Modifier extends HttpServlet {
    DaoFactory daoFactory = DaoFactory.getInstance();
    CompteClientsDao compteClientsDao = daoFactory.getCompteClientsDao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("User") != null) {
            request.setAttribute("valId", Integer.parseInt(request.getParameter("idClient")));
            try {
                this.getServletContext().getRequestDispatcher( "/WEB-INF/Modifier.jsp" ).forward( request, response );
            } catch(Exception e) {
                request.setAttribute("e", e);
                this.getServletContext().getRequestDispatcher( "/WEB-INF/Echoue.jsp" ).forward( request, response );
            }
        } else {
            request.getRequestDispatcher( "/WEB-INF/Login.jsp" ).forward( request, response );
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CompteClient compteClient = new CompteClient();
        try {
            compteClient.setIdClient(Integer.parseInt(request.getParameter("idClient")));
            compteClient.setNumero(Integer.parseInt(request.getParameter("numero")));
            compteClient.setDateCreation(Date.valueOf(request.getParameter("dateCreation")));
            compteClient.setChiffreAffaire(Double.parseDouble(request.getParameter("chiffreAffaire")));
            compteClientsDao.MiseAJour(compteClient);
            request.setAttribute("m", "les détails du client avec l'id "+ Integer.parseInt(request.getParameter("idClient")) +" ont été modifiés avec succès.");
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
