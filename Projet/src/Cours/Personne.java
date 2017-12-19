package Cours;


public class Personne {

	//attributs
	private String nom, prenom;
	
	

	//methodes
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	//constructeur
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	
}
