package tn.essat.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionIMP;
import tn.essat.dao.IGestion;
import tn.essat.model.Etudiant;

/**
 * Servlet implementation class Principale
 */
public class Principale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * 
     * @see HttpServlet#HttpServlet()
     */
    public Principale() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
      IGestion dao=new GestionIMP();
      List<Etudiant> liste =dao.getALLEtudiant();
      request.setAttribute("Liste", liste);
      request.getRequestDispatcher("home.jsp").forward(request, response);
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
}
