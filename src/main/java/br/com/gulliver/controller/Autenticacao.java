package br.com.gulliver.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Autenticacao
 */
@WebServlet("/autentica")
public class Autenticacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Autenticacao() {
        super();        
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if(senha.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("1234")) {
			response.sendRedirect("index.jsp");			
		} else {
			response.sendRedirect("login.jsp");	
		}
		
	}

}
