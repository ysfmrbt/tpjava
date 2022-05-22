package Servlets;


import DaoPattern.CompteClientsDao;
import DaoPattern.DaoFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Lister", value = "/Lister")
public class Lister extends HttpServlet {
    DaoFactory daoFactory = DaoFactory.getInstance();
    CompteClientsDao compteClientsDao = daoFactory.getCompteClientsDao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("User") != null) {
            request.setAttribute("compteClients", compteClientsDao.lister());
            this.getServletContext().getRequestDispatcher( "/WEB-INF/Lister.jsp" ).forward( request, response );
        } else {
            request.getRequestDispatcher( "/WEB-INF/Login.jsp" ).forward( request, response );
        }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/Lister.jsp").forward(request,response);
    }
}
