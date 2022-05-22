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

@WebServlet(name = "Login", value = "/Servlets.Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( "/WEB-INF/Login.jsp" ).forward( request, response );
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String User = request.getParameter("User");
        String Password = request.getParameter("Password");
            if (User.equals("admin") && (Password.equals("admin"))) {
                HttpSession session = request.getSession();
                session.setAttribute("User", User);
                session.setAttribute("Password", Password);
                request.getRequestDispatcher("/LoginSuccess").forward(request, response);
            } else {
                request.setAttribute("m", "Le nom d'utilisateur ou le mot de passe est faut!");
                this.getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp").forward(request, response);
            }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    } // <editor-fold>
}
