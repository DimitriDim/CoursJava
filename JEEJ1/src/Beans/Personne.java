package Beans;

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
	return "Personne [nom=" + nom + ", prenom=" +prenom + ", sexe=" + (sexe=='f' ? "femme" : "homme" ) + "]";
	}


	
}
