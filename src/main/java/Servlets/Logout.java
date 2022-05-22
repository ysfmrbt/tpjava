package Servlets;


import DaoPattern.CompteClientsDao;
import DaoPattern.DaoFactory;
import JavaBeans.CompteClient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "Logout", value = "/Servlets.Logout")
public class Logout extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Logout() {
        super();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( "/WEB-INF/Logout.jsp" ).forward( request, response );
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            session.invalidate();
            request.setAttribute("m", "Vous avez été déconnecté avec succès.");
            this.getServletContext().getRequestDispatcher( "/WEB-INF/Success.jsp" ).forward( request, response );
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    } // <editor-fold>
}
