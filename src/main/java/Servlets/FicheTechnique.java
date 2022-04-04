package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FicheTechnique", value = "/FicheTechnique")
public class FicheTechnique extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String methode= request.getMethod();
        String url=request.getRequestURI();
        String protocol=request.getProtocol();
        String name=request.getServerName();
        int port=request.getServerPort();
        request.setAttribute("methode",methode);
        request.setAttribute("url",url);
        request.setAttribute("protocol",protocol);
        request.setAttribute("name",name);
        request.setAttribute("port",port);
        String img = "assets/image.png";
        request.setAttribute("img",img);
        this.getServletContext().getRequestDispatcher( "/WEB-INF/FicheTechnique.jsp" ).forward( request, response );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
