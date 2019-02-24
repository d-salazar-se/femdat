package tbd.grupo1.femdat.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CrearSession")
public class CrearSesion extends HttpServlet{
    private static final long serialVersionUID = 1L;
    private User user;

    public CrearSesion(User user){
        this.user=user;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession misession= request.getSession(true);
        misession.setAttribute("user",this.user);

    }
}
