package beans;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.MaBase;

public class Personne {

	private String nom;
	private String prenom;
	private char sexe; // tous les champs sont private

	public String getNom() {
		return nom;
	}// des getters/setters public pour tous les champs

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", sexe=" + (sexe == 'f' ? "femme" : "homme") + "]";
	}

	public void AddPersonne() {

		Connection c = MaBase.LoadDatabase();

		try {
			Statement st = c.createStatement();
			String chaineEnvoi = "INSERT INTO personne (nom,prenom) VALUES (\"" + this.nom + "\", \"" + this.prenom+ "\");";
			st.executeUpdate(chaineEnvoi);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
