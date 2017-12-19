package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Personne;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// création de l'objet perso de typer Personne
		/*
		 * Personne perso = new Personne(); perso.setNom("Wick");
		 * perso.setPrenom("John"); perso.setSexe('h'); PrintWriter out =
		 * response.getWriter(); out.print("Mr " + perso.getNom() + " " +
		 * perso.getPrenom() + " sexe: " + perso.getSexe()); out.print(perso); // suite
		 * redefinition de toString qui renvoil'info de l'objet perso // Création de la
		 * requete d'envoi request.setAttribute("perso", perso); // envoi de l'objet que
		 * j'appel 'perso' vers la JSP
		 * this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(
		 * request, response);
		 */

		/*
		 * int val1 = Integer.parseInt(request.getParameter("val1")); int val2 =
		 * Integer.parseInt(request.getParameter("val2")); String message = null;
		 * 
		 * switch (request.getParameter("op")) {
		 * 
		 * case "+": message = "La somme de " + val1 + " et de " + val2 + " vaut: " +
		 * (val1 + val2); break;
		 * 
		 * case "*": message = "Le produit de " + val1 + " et de " + val2 + " vaut: " +
		 * (val1 * val2); break;
		 * 
		 * case "/": message = "La division de " + val1 + " et de " + val2 + " vaut: " +
		 * (float) (val1 / val2); break;
		 * 
		 * case "-": message = "La soustraction de " + val1 + " et de " + val2 +
		 * " vaut: " + (val1 - val2); break;
		 * 
		 * }
		 * 
		 * // exemple de l'URL testé: http://localhost:8080/JeeProjet/index?5&*&10 //
		 * Création de la requete d'envoi request.setAttribute("messageEnvoye",
		 * message); // envoi de 'message' que j'appel 'messageEnvoye' vers la JSP
		 * this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(
		 * request, response);
		 */

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int nbr = Integer.parseInt(request.getParameter("nbr"));
		String message = "";

		for (int i = 0; i < nbr + 1; i++) {

			if ((i % 2) == 0) {
				message = message + i + " " + nom + "<br>";

			} else {
				message = message + i + " " + prenom + "<br>";

			}

		}
		request.setAttribute("messageEnvoye", message);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vue.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}