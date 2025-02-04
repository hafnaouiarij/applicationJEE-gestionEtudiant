package tn.essat.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionIMP;
import tn.essat.dao.IGestion;
import tn.essat.model.Etudiant;

public class Modiff extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public Modiff() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		int id = Integer.parseInt(request.getParameter("id"));
    	    String prenom = request.getParameter("prenom");
    	    String nom = request.getParameter("nom");
    	    String groupe = request.getParameter("groupe");
    	    
    	    Etudiant etudiant = new Etudiant(id, prenom, nom, groupe);
    	    
    	    IGestion dao = new GestionIMP();
    	    dao.modifierEtudiant(etudiant);
    	    
    	    response.sendRedirect("Principale");
    	}
}