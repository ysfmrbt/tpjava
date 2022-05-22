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

@WebServlet(name = "LoginSuccess", value = "/Servlets.LoginSuccess")
public class LoginSuccess extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginSuccess() {
        super();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher( "/WEB-INF/LoginSuccess.jsp" ).forward( request, response );
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( "/WEB-INF/LoginSuccess.jsp" ).forward( request, response );

    }
    @Override
    public String getServletInfo() {
        return "Short description";
    } // <editor-fold>
}
