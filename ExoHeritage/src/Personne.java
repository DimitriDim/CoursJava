
public class Personne {

	private String nom;
	private String prenom;
	


	static int nbrPersonne = 0;

	public static int getNbrPersonne() {
		return nbrPersonne;
	}

	public static void setNbrPersonne(int nbrPersonne) {
		Personne.nbrPersonne = nbrPersonne;
	}



	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		nbrPersonne++;
	}

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

}
